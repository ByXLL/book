package com.hjl.book;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookApplicationTests {
@Autowired
//BooksMapper booksMapper;
    @Test
    public void contextLoads() throws IOException {
//        Document doc = Jsoup.connect("http://www.shuquge.com/txt/8659/index.html").get();
//        //Document doc = Jsoup.parse(res);
//        //System.out.println(doc.body());
//        Elements element = doc.select("dd");
//
//        Elements info = doc.select("div.info");
//
//
//        Books books = new Books();
//        books.setAuthor(info.select("div.small >span").eq(0).text().replace("作者：",""));
//        books.setTitle(info.select("h2").text());
//        books.setDesc(info.select("div.intro").text().replace("简介：",""));
//        // BooksMapper booksMapper = SqlSessionFactoryUtils.getSession().getMapper(BooksMapper.class);
//        booksMapper.Add(books);
//        System.out.println(books);
//
////        for (Element el : element.next()) {
////            //System.out.println(el);
////            // http://www.shuquge.com/txt/8659/2324752.html
////            String href = el.getElementsByTag("a").attr("href");
////            System.out.println("txt:" + el.getElementsByTag("a").text());
////            Document content = Jsoup.connect("http://www.shuquge.com/txt/8659/"+href).get();
////System.out.println(content.body().select("div#content").text());
////            //System.out.println("href:" +);
////        }
//        //System.out.println(res);
    }

}
