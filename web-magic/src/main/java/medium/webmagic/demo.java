package medium.webmagic;

import com.dao.FilmDao;
import com.entity.Films;
import lombok.SneakyThrows;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import us.codecraft.webmagic.*;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) throws InterruptedException {
        String[] strings = {
        "1284547","1298218","1281427","1263116","1300821","1282366","1277808","1324204","1261067","1290443"};
        int code = 1300;
        for (int i=0;i<strings.length;i++) {
            String url = "https://maoyan.com/films/"+ strings[i];
            Spider.create(new PageProcesser())
                    .addPipeline(new PipeLine())
                    .addUrl(url)
                    // .setDownloader(httpClientDownloader)
                    .run();
        }
    }
}

class Processer implements PageProcessor {

    @Override
    public void process(Page page) {
        Document document = page.getHtml().getDocument();
        System.out.println(document);
    }

    @Override
    public Site getSite() {
        return new Site();
    }
}


class MyPageProcesser implements PageProcessor {
    private Site site = Site.me().setTimeOut(500);

    @SneakyThrows
    public void process(Page page) {
        Document document = page.getHtml().getDocument();
        Films films = new Films();
        //标题
        Element span = document.select("div.movie-brief-container").select("h1.name").get(0);
        String title = span.text();
        page.putField("title",title);
        films.setTitle(title);
        //标签
        List<String> tagsList = new ArrayList<String>();
        Elements tags = document.select("div.movie-brief-container").select("a.text-link");
        for (Element element:tags) {
            tagsList.add(String.valueOf(element.text()));
        }
        page.putField("tags",tagsList);
        films.setTypelist(String.join(",",tagsList));
        //简介
        Element description = document.select("span.dra").get(0);
        String info = description.text();
        page.putField("description",info);
        films.setDescription(info);
        //时间
        Element time = document.select("div.movie-brief-container").select("li.ellipsis").get(2);
        String yr = time.text().substring(0,10);
        page.putField("time",yr);
        films.setYr(yr);
        //图片
        Element poster = document.select("div.avatar-shadow").select("img.avatar").select("img[src]").get(0);
        String posterUrl = poster.attr("src");
        page.putField("poster",posterUrl);
        films.setPoster(posterUrl);
        films.setBackpost(posterUrl);
        //导演
        Elements personInfo = document.select("div.celebrity-container").select("div.celebrity-group");
        Element director = personInfo.get(0).select("div.info").select("a.name").get(0);
        String directorName = director.text();
        films.setDirector(directorName);
        //评分
        Element rate = document.select("div.star-wrapper").select("div.star-on").get(0);
        String rateValue = rate.attr("style").substring(6,8);
        double avgrating = Double.parseDouble(rateValue) / 20;
        films.setAvgrating(avgrating);
        //演员
        List<String> actorList = new ArrayList<String>();
        Element leadActorsElement = personInfo.get(1);
        Elements leadActorsElements = leadActorsElement.select("div.info").select("a.name");
        for (Element e:leadActorsElements) {
            actorList.add(String.valueOf(e.text()));
        }
        films.setLeadactors(String.join(",",actorList));
        //String directorInfo = director;
        //page.putField("director",directorInfo);
        //入库
        new FilmDao().insert(films);

    }

    public Site getSite() {
        return new Site();
    }
}

class MyPipeLine implements Pipeline {

    public void process(ResultItems resultItems, Task task) {
        Object title = resultItems.get("title").toString();
        List<String> list = resultItems.get("tags");
        Object description = resultItems.get("description").toString();
        Object yr = resultItems.get("time").toString();
        Object poster = resultItems.get("poster").toString();
     //   Object director = resultItems.get("director").toString();
        System.out.println("标题是"+title);
        System.out.println(list);
        System.out.println(description);
        System.out.println(yr);
        System.out.println(poster);
      //  System.out.println(director);
    }
}