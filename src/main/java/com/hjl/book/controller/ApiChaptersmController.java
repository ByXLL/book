package com.hjl.book.controller;

import com.hjl.book.entity.Chapters;
import com.hjl.book.mapper.ChaptersmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//路由
@RequestMapping("/api")
@RestController
public class ApiChaptersmController {
    //
    @Autowired
    ChaptersmMapper chaptersmMapper;
    //通过FictionList获取书id
    @RequestMapping("/getChaptersmList/{id}")
    public List<Chapters> getFictionList(@PathVariable String id)
    {
        return chaptersmMapper.getByBookId(id);
    }
    //通过章节id获取章节信息
    @RequestMapping("/seeinfo/{id}")
    public Chapters seeinfo(@PathVariable Integer id)
    {
        return chaptersmMapper.getByid(id);
    }
}
