package com.example.MyBookShopApp.data.author;

import com.example.MyBookShopApp.data.author.Author;
import com.example.MyBookShopApp.data.author.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    public List<Author> getAuthorsData(){

        return authorRepository.findAll();
    }


    public Map<String, List<Author>> getAuthorsMap(){
        Map<String, List<Author>> result = new HashMap<String, List<Author>>();
        List<Author> allAuthor = this.getAuthorsData();

        //Формируем список первых букв фамилий авторов
        List<String> alphabet = allAuthor.stream().map(x->x.getLastName().substring(0,1).toUpperCase()).distinct().collect(Collectors.toList());

        //Наполняем по каждой букве листы авторами
        alphabet.stream().forEach(x->result.put(x, allAuthor.stream().filter(y->y.getLastName().substring(0,1).equals(x)).collect(Collectors.toList())));

        return result;
    }



}
