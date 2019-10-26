package com.hjl.book.mapper;


import com.hjl.book.entity.Chapters;

import java.util.List;


//章节接口
public interface ChaptersmMapper {
    //添加
    Integer Add(Chapters chapters);
    //获取章节id
    Chapters getByid(Integer id);
    //获取书的id
    List<Chapters> getByBookId(String id);
    //获取整个章节数据
    List<Chapters> getChaptersmList();
}
