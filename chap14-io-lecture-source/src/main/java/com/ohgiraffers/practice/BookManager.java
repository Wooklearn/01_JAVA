package com.ohgiraffers.practice;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
//- booklist:ArrayList<BookDTO>
//- sc : Scanner
//+ BookManager()
//+ addBook(book:Book) : void
//+ deleteBook(index:int) : void
//+ searchBook(btitle:String) : void
//+ displayAll():void
//+ sortedBookList(type:int):List<BookDTO>
//+ printBookList(printList:List<BookDTO>):void


    Scanner sc = new Scanner(System.in);
    List<BookDTO> booklist = new LinkedList<>();

    // 기본생성자
    public BookManager() {
    }

    // 새 도서 추가
    public void addBook(BookDTO bookDTO) {

        booklist.add(bookDTO);
        System.out.println("도서가 추가되었습니다." + bookDTO);

    }

    // 도서 삭제
    public void deleteBook() {


    }

    public void searchBook() {

    }
    public void displayAll() {

        if (booklist.isEmpty()) {
            System.out.println("저장된 도서 목록이 없습니다.");
        } else {
            for (BookDTO bookDTO : booklist) {
                System.out.println(bookDTO);
            }
        }
    }

    public List<BookDTO> sortedBookList = new ArrayList<>();
    public void printBookList () {

    }

}
