package com.hjl.book.controller;

import com.hjl.book.entity.Chapters;
import com.hjl.book.entity.Fiction;
import com.hjl.book.mapper.FictionMapper;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.mybatis.spring.SqlSessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class FictionController {

    @Autowired
    FictionMapper fictionMapper;

    @RequestMapping("/index")
    public String index() throws IOException, ParseException {


        return "index";
    }


}
