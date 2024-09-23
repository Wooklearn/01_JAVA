package com.ohgiraffers.practice;

public class BookDTO {
    // 필드 값 설정
    private int bookNum;                    // 도서 번호
    private int bookClassificationNum;      // 장르 분류 번호
    private String bookName;                // 책 이름
    private String bookAuthor;              // 책 저자

    // 기본 생성자
    public BookDTO() {
    }

    // 초기화 된 생성자
    public BookDTO(int bookNum, int bookClassificationNum, String bookName, String bookAuthor) {
        this.bookNum = bookNum;
        this.bookClassificationNum = bookClassificationNum;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    // getter/setter
    public int getBookNum() {
        return bookNum;
    }

    public void setBookNum(int bookNum) {
        this.bookNum = bookNum;
    }

    public int getBookClassificationNum() {
        return bookClassificationNum;
    }

    public void setBookClassificationNum(int bookClassificationNum) {
        this.bookClassificationNum = bookClassificationNum;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    // 오버라이딩
    @Override
    public String toString() {
        return "BookDTO{" +
                "bookNum=" + bookNum +
                ", bookClassificationNum=" + bookClassificationNum +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}
