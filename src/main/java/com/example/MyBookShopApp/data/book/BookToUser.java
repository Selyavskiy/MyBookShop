package com.example.MyBookShopApp.data.book;

import com.example.MyBookShopApp.data.user.User;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "book2user")
public class BookToUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Time time;


    private BookToUserTypeCode code;

    private BookToUserTypeName name;

    private Integer typeId;

    @ManyToMany
    @JoinColumn(name = "bookList_id", referencedColumnName = "id")
    private List<Book> bookId;


    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User userId;


    public BookToUser() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }




}
