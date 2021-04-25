package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PopularPageController {

    @RequestMapping("/popular")
    public String popularPage(){
        return "/books/popular";
    }
}
