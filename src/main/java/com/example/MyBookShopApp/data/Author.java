package com.example.MyBookShopApp.data;


public class Author {

    private Integer id;
    private String nameAuthor;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", nameAuthor='" + nameAuthor + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }
}
