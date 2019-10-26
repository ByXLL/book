package com.hjl.book.entity;


import javax.xml.crypto.Data;
import java.util.Date;


//书实体类
public class Fiction {
    private Integer id;
    private String bookId;
    private String imgSrc;
    private Integer state;
    private Date lastestupdate;
    private String name;
    private String author;
    private String type;
    private String lastestChapter;
    private String intro;

    public Fiction() {
    }
    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookId='" + bookId + '\'' +
                ", imgSrc='" + imgSrc + '\'' +
                ", state='" + state + '\'' +
                ", lastestupdate='" + lastestupdate + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", lastestChapter='" + lastestChapter + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }

    public Fiction(Integer id, String bookId, Integer state, String imgSrc, Date lastestupdate, String name, String author, String type, String lastestChapter, String intro) {
        this.id = id;
        this.bookId = bookId;
        this.state = state;
        this.imgSrc = imgSrc;
        this.lastestupdate = lastestupdate;
        this.name = name;
        this.author = author;
        this.type = type;
        this.lastestChapter = lastestChapter;
        this.intro = intro;
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

    public Integer getState() {
        return state;
    }
    public void setState(Integer state) {
        this.state = state;
    }

    public Date getLastestupdate() {
        return lastestupdate;
    }
    public void setLastestupdate(Date lastestupdate) {
        this.lastestupdate =  lastestupdate;
    }

    public String getImgSrc() {
        return imgSrc;
    }
    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getLastestChapter() {
        return lastestChapter;
    }
    public void setLastestChapter(String lastestChapter) {
        this.lastestChapter = lastestChapter;
    }

    public String getIntro() {
        return intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }
}
