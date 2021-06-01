package com.example.MyBookShopApp.data.user;

import com.example.MyBookShopApp.data.support.BalanceTransaction;
import com.example.MyBookShopApp.data.support.Message;
import com.example.MyBookShopApp.data.book.BookReview;
import com.example.MyBookShopApp.data.book.BookReviewLike;
import com.example.MyBookShopApp.data.book.BookToUser;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String hash;

    private Time regTime;

    private Integer balance;

    private String name;

    @OneToMany(mappedBy = "userId")
    private List<BookReview> reviewList;

    @OneToMany(mappedBy = "userId")
    private List<BookReviewLike> reviewLikeList;

    @OneToMany(mappedBy = "userId")
    private List<UserContact> contactList;

    @OneToMany(mappedBy = "userId")
    private List<BookToUser> bookToUserList;

    @OneToMany(mappedBy = "userId")
    private List<BalanceTransaction> balanceTransactionList;

    @OneToMany(mappedBy = "userId")
    private List<Message> messageList;

    @Autowired
    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Time getRegTime() {
        return regTime;
    }

    public void setRegTime(Time regTime) {
        this.regTime = regTime;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookReview> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<BookReview> reviewList) {
        this.reviewList = reviewList;
    }

    public List<BookReviewLike> getReviewLikeList() {
        return reviewLikeList;
    }

    public void setReviewLikeList(List<BookReviewLike> reviewLikeList) {
        this.reviewLikeList = reviewLikeList;
    }

    public List<UserContact> getContactList() {
        return contactList;
    }

    public void setContactList(List<UserContact> contactList) {
        this.contactList = contactList;
    }

    public List<BookToUser> getBookToUserList() {
        return bookToUserList;
    }

    public void setBookToUserList(List<BookToUser> bookToUserList) {
        this.bookToUserList = bookToUserList;
    }

    public List<BalanceTransaction> getBalanceTransactionList() {
        return balanceTransactionList;
    }

    public void setBalanceTransactionList(List<BalanceTransaction> balanceTransactionList) {
        this.balanceTransactionList = balanceTransactionList;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }
}
