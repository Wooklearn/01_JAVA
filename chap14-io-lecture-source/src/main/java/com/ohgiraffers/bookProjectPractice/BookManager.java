package com.ohgiraffers.bookProjectPractice;

import java.util.*;

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
    public static List<BookDTO> booklist = new LinkedList<>();

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

    public void sortedBookList(int num) {

        System.out.print("정렬 전 도서 목록입니다.");
        displayAll();

        printBookList(num);

    }

    public void printBookList (int num) {

        if (num == 1) {
            Collections.sort(booklist, new Comparator<BookDTO>() {
                @Override
                public int compare(BookDTO o1, BookDTO o2) {
                    return o1.getBookName().compareTo(o2.getBookName());
                }
            });

            for (BookDTO bookDTO : booklist) {
                System.out.println(bookDTO);
            }

        } else if (num == 2) {
            Collections.sort(booklist, new Comparator<BookDTO>() {
                @Override
                public int compare(BookDTO o1, BookDTO o2) {
                    return o2.getBookName().compareTo(o1.getBookName());
                }
            });

            for (BookDTO bookDTO : booklist) {
                System.out.println(bookDTO);
            }

        }


    }

}
