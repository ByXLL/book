package com.hjl.book.controller;

import com.hjl.book.entity.Chapters;
import com.hjl.book.mapper.ChaptersmMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class ChaptersmController {

    @Autowired
    ChaptersmMapper chaptersmMapper;

    @RequestMapping("/read")
    public String index() {

        return "books";
    }

}
