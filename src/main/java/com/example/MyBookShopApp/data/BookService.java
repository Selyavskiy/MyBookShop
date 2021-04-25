package com.example.MyBookShopApp.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public BookService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> getBooksData(){

      List<Book> books = jdbcTemplate.query("SELECT books.id, authors.first_name, books.title, books.priceOld, books.price " +
                                                "FROM books, authors WHERE books.id = authors.id", (ResultSet rs, int rowNum) -> {
          Book book = new Book();
          book.setId(rs.getInt("books.id"));
          book.setAuthor(rs.getString("authors.first_name"));
          book.setTitle(rs.getString("books.title"));
          book.setPriceOld(rs.getString("books.priceOld"));
          book.setPrice(rs.getString("books.price"));
          return book;
      });
      return new ArrayList<Book>(books);
  }


    public List<List<String>> getTagsData(){

        List<List<String>> tags = jdbcTemplate.query("SELECT tags.id, tags.tag, tags.tag_type " +
                "FROM tags", (ResultSet rs, int rowNum) -> {
            List<String> tagList = new ArrayList<>();
            tagList.add(0, rs.getString("tags.tag"));
            tagList.add(1, String.valueOf(rs.getString("tags.tag_type")));
            return tagList;
        });
        return new ArrayList<> (tags);
    }



}
