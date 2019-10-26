package com.hjl.book;

import com.hjl.book.entity.Chapters;
import com.hjl.book.mapper.ChaptersmMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@EnableAsync
public class AsyncTaskService {

    @Autowired
    ChaptersmMapper chaptersmMapper;

    //异步添加节点
    @Async
    public void AddNode(String bookId) throws IOException {
        System.out.println("Start AddNode");
        Chapters chapters = new Chapters();
        //章节
        String url="http://www.shuquge.com/txt/"+bookId+"/index.html";

        chapters.setBookId(bookId);
        //System.out.println(strBookId[4]);

        Document doc = Jsoup.connect(url).get();
//			System.out.println(doc);
        Elements elements = doc.select("dd");
        for(int i=12;i<elements.size();i++){
            Element el_dd=elements.get(i);
            Element el_a = el_dd.child(0);

            String title = el_a.text();

            //此章节对应的小说
            //转类型   id
            Integer a_url_id = Integer.parseInt(el_a.attr("href").replace(".html",""));
            chapters.setFictionId(a_url_id);

            //章节标题
            chapters.setTitle(title);

            //此章节的整个html页面
//                String a_url = el_a.attr("abs:href");       //此处获取章节链接中的内容
//                Document contentDoc = Jsoup.connect(a_url).get();
//                chapters.setHtml(String.valueOf(contentDoc));
            String a_url = el_a.attr("abs:href");   //此处是获取href
            chapters.setHtml(a_url);
            //System.out.println(a_url);


            //章节内容
            Document contentDoc = Jsoup.connect(a_url).get();
            chapters.setContent(String.valueOf(contentDoc.getElementById("content")));
            //获取text 没有br标签 样式等
            //chapters.setContent(contentDoc.select("div#content").text());
            //System.out.println(contentDoc.select("div#content").text());

            // 记录生成时间
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            chapters.setCreateDate(sdf.format(date));


            chaptersmMapper.Add(chapters);
            System.out.println(chapters.getTitle()+" 保存成功");
        }

    }

}
