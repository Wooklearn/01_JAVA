package com.ohgiraffers.practice.book;

public class BookDTO {
    private int booknum;
    private String bookname;
    private String bookAuthor;
    private int bookPrice;

    // 기본 생성자
    public BookDTO() {}

    // 초기화 된 생성자
    public BookDTO(int booknum, String bookname, String bookAuthor, int bookPrice) {
        this.booknum = booknum;
        this.bookname = bookname;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    // getter/setter
    public int getBooknum() {
        return booknum;
    }

    public void setBooknum(int booknum) {
        this.booknum = booknum;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    // 오버라이딩
    @Override
    public String toString() {
        return "BoolkDTO{" +
                "booknum=" + booknum +
                ", bookname='" + bookname + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                '}';
    }

}
