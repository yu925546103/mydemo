package medium.webmagic;

import com.dao.FilmsMapper;
import com.entity.Films;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@PropertySource(value={"classpath:/application.xml"})
public class TestDemo {
    @Autowired
    FilmsMapper filmsMapper;
    @Autowired
    Films films;

    @Test
    public void insert(){
        System.out.println(films.getTitle());
    }
}
