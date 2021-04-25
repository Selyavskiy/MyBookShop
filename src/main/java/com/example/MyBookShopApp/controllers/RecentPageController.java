package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecentPageController  {

    @RequestMapping("/recent")
    public String recentPage(){

        return "/books/recent";
    }
}
