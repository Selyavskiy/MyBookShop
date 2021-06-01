package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.book.Book;
import com.example.MyBookShopApp.data.book.service.BookService;
import com.example.MyBookShopApp.data.support.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class MainPageController {

    private final BookService bookService;

    @Autowired
    public MainPageController(BookService bookService) {
        this.bookService = bookService;
    }


    @ModelAttribute("recommendedBooks")
    public List<Book> recommendedBooks(){
        return bookService.getBooksData().subList(1, 50);
    }

    @ModelAttribute("tagsList")
    public List<Tag> tagsList(){
        return bookService.getTagsData();
    }

    @GetMapping("/")
    public String mainPage(){
        return "index";
    }
}
