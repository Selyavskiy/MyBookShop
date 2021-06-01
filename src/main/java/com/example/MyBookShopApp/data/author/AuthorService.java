package com.example.MyBookShopApp.data.author;

import com.example.MyBookShopApp.data.author.Author;
import com.example.MyBookShopApp.data.author.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        String firstLetter;


        for (Author author : allAuthor){
            firstLetter = author.getLastName().substring(0,1);
            if(result.containsKey(firstLetter)){
                result.get(firstLetter).add(author);
            }
            else{
                List<Author> tempAuthorList = new ArrayList<Author>();
                tempAuthorList.add(author);
                result.put(author.getLastName().substring(0,1), tempAuthorList);
            }

        }
        return result;
    }


}
