package org.main.controllers;

import org.main.dtos.News;
import org.main.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/news")
@RestController
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping("/test")
    public String testOK(){
        return "OK";
    }

    @GetMapping("/allnews")
    public List<News> getAllNews(){
        return newsService.getAllNews();
    }

    @PostMapping("/newsByAuthor")
    public News getNews(@RequestBody String author){

    }
}
