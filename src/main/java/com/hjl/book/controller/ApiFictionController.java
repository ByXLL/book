package com.hjl.book.controller;

import com.hjl.book.AsyncTaskService;
import com.hjl.book.entity.Fiction;
import com.hjl.book.mapper.FictionMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/api")
@RestController
public class ApiFictionController {

    @Autowired
    FictionMapper fictionMapper;

    @Autowired
    AsyncTaskService asyncTaskService;

    @RequestMapping("/getFictionList")
    public List<Fiction> getFictionList()
    {
        return fictionMapper.getFictionList();
    }

    @RequestMapping("/addFiction")
    public String addFiction(HttpServletRequest httpServletRequest) throws IOException, ParseException {
        String url =httpServletRequest.getParameter("url");
        System.out.println(url);

        Document doc = Jsoup.connect(url).get();
        //System.out.println(doc.body().html());
        Elements element = doc.select("dd");
        Elements info = doc.select("div.info");
        //System.out.println(info);
        Fiction fiction = new Fiction();

        //bookid
        String[] strBookId=url.split("/");
        fiction.setBookId(strBookId[4]);

        //书的图片地址
        fiction.setImgSrc(info.select(".cover img").attr("src"));
        //System.out.println(info.select(".cover img").attr("src"));

        //书名    name
        fiction.setName(info.select("h2").text());
        //作者    author
        fiction.setAuthor(info.select("div.small >span").eq(0).text().replace("作者：",""));
        //小说分类  type
        fiction.setType(info.select("div.small >span").eq(1).text().replace("分类：",""));
        //状态：   state
        //fiction.setState(info.select("div.small >span").eq(2).text().replace("状态：",""));
        String setStateText = info.select("div.small >span").eq(2).text().replace("状态：","");
        Integer setStateNumber = 1;
        switch (setStateText){
            case "连载中":
                setStateNumber = 1;
                break;
            case "断更":
                setStateNumber = 2;
                break;
            case "完结":
                setStateNumber = 3;
                break;
            default:
                setStateNumber = 4;
        }
        fiction.setState(setStateNumber);
        //更新时间 lastestupdated
        java.text.SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd ");
        String s= info.select("div.small >span.last").eq(0).text().replace("更新时间：","");
        Date date =  formatter.parse(s);
        fiction.setLastestupdate(date);
        //最新章节 lastestChapter
        fiction.setLastestChapter(info.select("div.small >span.last").last().text().replace("最新章节：",""));
        //简介    intro
        fiction.setIntro(info.select("div.intro").text().replace("简介：",""));
        //注入
        fictionMapper.Add(fiction);

        asyncTaskService.AddNode(fiction.getBookId());

        return "ok";
    }

}
