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

/**
 * @Author yujt
 * @Date 2021/11/24 16:59
 * @Version 1.0
 */
public class NewDemo {
    public static void main(String[] args) throws InterruptedException {
            String url = "https://time.geekbang.org/column/article/39922";
            Spider.create(new PageProcesser())
                    .addPipeline(new PipeLine())
                    .addUrl(url)
                    // .setDownloader(httpClientDownloader)
                    .run();
    }
}


class PageProcesser implements PageProcessor {
    private Site site = Site.me().setTimeOut(500);

    @SneakyThrows
    public void process(Page page) {
        Document document = page.getHtml().getDocument();
        System.out.println(document);


    }

    public Site getSite() {
        return new Site();
    }
}

class PipeLine implements Pipeline {

    public void process(ResultItems resultItems, Task task) {
        System.out.println(true);
    }
}

