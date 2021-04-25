package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdditionalPageController {

    @GetMapping("/documents/index")
    public String documentsPage(){
        return "/documents/index";
    }

    @GetMapping("/faq")
    public String faqPage(){
        return "/faq";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "/about";
    }

    @GetMapping("/contacts")
    public String contactsPage(){
        return "/contacts";
    }
}
