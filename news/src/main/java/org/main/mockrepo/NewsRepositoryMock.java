package org.main.mockrepo;

import org.main.dtos.News;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NewsRepositoryMock {
    
    public List<News> findAll(){
        List<News> listNews = new ArrayList<>();
        listNews.add(new News("Bienvenue sur le site", "C'est la 1ère news du site ! Super !", "Dhaz", "Apex Legends"));
        listNews.add(new News("Tournoi sur Apex prochainement", "Restez à l'écoute ! Le premier tournoi Apex de la plate-forme bientôt ouvert", "Dhaz", "Website"));
        listNews.add(new News("Hub Twitch disponible !", "Accédez à un hub Twitch qui permet de suivre les tournois en différé sur tous ses streams dispos", "Dhaz", "Website"));

        return listNews;
    }
}
