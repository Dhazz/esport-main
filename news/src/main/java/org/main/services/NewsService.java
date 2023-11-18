package org.main.services;

import org.main.dtos.News;
import org.main.mockrepo.NewsRepositoryMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class NewsService {

    @Autowired
    NewsRepositoryMock newsRepositoryMock;

    public List<News> getAllNews(){
        return newsRepositoryMock.findAll();
    }

}
