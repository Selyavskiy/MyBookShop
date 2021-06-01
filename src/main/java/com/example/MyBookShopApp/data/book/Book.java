package com.example.MyBookShopApp.data.book;

import com.example.MyBookShopApp.data.support.BalanceTransaction;
import com.example.MyBookShopApp.data.support.Genre;
import com.example.MyBookShopApp.data.author.Author;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date pubDate;

    private boolean isBestseller;

    private String slug;
    private String title;
    private String image;

    private String description;

    private byte discount;

    @Column(name = "priceold")
    private String priceOld;
    private String price;

    @OneToOne
    private BookFile bookFile;


    @OneToMany(mappedBy = "bookId")
    private List<BookReview> reviewList;


    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Author author;

    @OneToOne
    private Genre bookGenre;

    @OneToOne
    private BalanceTransaction balanceTransaction;

    @ManyToMany
    @JoinColumn(name = "book2user_id", referencedColumnName = "id")
    private List<BookToUser> bookToUserList;



    @Autowired
    public Book() {
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", priceOld='" + priceOld + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(String priceOld) {
        this.priceOld = priceOld;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public boolean isBestseller() {
        return isBestseller;
    }

    public void setBestseller(boolean bestseller) {
        isBestseller = bestseller;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getDiscount() {
        return discount;
    }

    public void setDiscount(byte discount) {
        this.discount = discount;
    }

    public List<BookReview> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<BookReview> reviewList) {
        this.reviewList = reviewList;
    }

    public Genre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(Genre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public BalanceTransaction getBalanceTransaction() {
        return balanceTransaction;
    }

    public void setBalanceTransaction(BalanceTransaction balanceTransaction) {
        this.balanceTransaction = balanceTransaction;
    }

    public List<BookToUser> getBookToUserList() {
        return bookToUserList;
    }

    public void setBookToUserList(List<BookToUser> bookToUserList) {
        this.bookToUserList = bookToUserList;
    }

    public BookFile getBookFile() {
        return bookFile;
    }

    public void setBookFile(BookFile bookFile) {
        this.bookFile = bookFile;
    }
}
