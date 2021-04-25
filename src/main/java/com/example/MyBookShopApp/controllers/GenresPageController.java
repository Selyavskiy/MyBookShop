package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenresPageController {

    @RequestMapping("/genres")
    public String genresPage(){
        return "/genres/index";
    }

    @RequestMapping("/genres/slug")
    public String genresSlugPage(){
        return "/genres/slug";
    }

}
