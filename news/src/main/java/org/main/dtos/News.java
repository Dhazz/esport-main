package org.main.dtos;

import java.util.Date;
import java.util.List;

public class News {
    public String title;
    public String content;
    public List<String> urlPictures;
    public String urlBanner;
    public String author;
    public Date date;
    public String theme;

    public News(String title, String content, String author, String theme){
        this.title = title;
        this.content = content;
        this.author = author;
        this.theme = theme;
    }
}
