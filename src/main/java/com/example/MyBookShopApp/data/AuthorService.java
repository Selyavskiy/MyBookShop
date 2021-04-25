package com.example.MyBookShopApp.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AuthorService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public AuthorService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Author> getAuthorsData(){

        List<Author> authors = jdbcTemplate.query("SELECT * FROM authors", (ResultSet rs, int rowNum) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setFirstName(rs.getString("first_name"));
            author.setLastName(rs.getString("last_name"));
            return author;
        });
        return new ArrayList<Author>(authors);
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
