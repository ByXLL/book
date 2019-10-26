package com.hjl.book.entity;

import java.util.Date;
//章节实体类
public class Chapters {
    private Integer id;
    private String bookId;
    private Integer fictionId;
    private String createDate;
    private String title;
    private String content;
    private String html;

    public Chapters() {
    }
    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookId='" + bookId + '\'' +
                ", fictionId='" + fictionId + '\'' +
                ", createDate='" + createDate + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", html='" + html + '\'' +
                '}';
    }

    public Chapters(Integer id, String bookId, Integer fictionId, String createDate, String title, String content, String html) {
        this.id = id;
        this.bookId = bookId;
        this.fictionId = fictionId;
        this.createDate = createDate;
        this.title = title;
        this.content = content;
        this.html = html;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Integer getFictionId() {
        return fictionId;
    }
    public void setFictionId(Integer fictionId) {
        this.fictionId = fictionId;
    }

    public String getCreateDate() {
        return createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getHtml() {
        return html;
    }
    public void setHtml(String html) {
        this.html = html;
    }

}
