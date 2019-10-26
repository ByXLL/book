package com.hjl.book.mapper;


import com.hjl.book.entity.Fiction;

import java.util.List;
//小说信息接口
public interface FictionMapper {
    //添加
    Integer Add(Fiction fiction);
    //获取章节列表
    List<Fiction> getFictionList();
}
