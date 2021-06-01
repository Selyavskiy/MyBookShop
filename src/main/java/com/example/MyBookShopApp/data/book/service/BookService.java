package com.example.MyBookShopApp.data.book.service;

import com.example.MyBookShopApp.data.support.Tag;
import com.example.MyBookShopApp.data.support.repo.TagRepository;
import com.example.MyBookShopApp.data.book.Book;
import com.example.MyBookShopApp.data.book.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;
    private TagRepository tagRepository;

    @Autowired
    public BookService(BookRepository bookRepository, TagRepository tagRepository) {
        this.bookRepository = bookRepository;
        this.tagRepository = tagRepository;
    }


    public List<Book> getBooksData(){

      return bookRepository.findAll();
  }


    public List<Tag> getTagsData(){

        return tagRepository.findAll();
    }



}
