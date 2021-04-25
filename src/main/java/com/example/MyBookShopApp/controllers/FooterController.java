package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/footer")
public class FooterController {

    @RequestMapping("/signin")
    public String signIn(){

        return "signin";
    }

    @RequestMapping("/documents")
    public String documents(){

        return "";
    }


}
