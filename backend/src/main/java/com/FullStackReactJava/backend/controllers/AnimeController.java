package com.FullStackReactJava.backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AnimeController {

    @GetMapping("/")
    public String home() {
        return "Bienvenidxs a mi aplicación!";
    }
    @GetMapping("/anime/{id}")
    public ResponseEntity<String> getAnime(@PathVariable String id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.jikan.moe/v4/anime/" + id;
        return restTemplate.getForEntity(url, String.class);
    }
}
