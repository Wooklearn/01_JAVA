package com.ohgiraffers.section01.file;

import com.ohgiraffers.bookProjectPractice.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    // 기본 생성자
    public BookMenu () {
        System.out.println("====== 도서관리 프로그램 ======");
    }

    // 도서관리 프로그램
    public void mainMenu() {

        while (true) {
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 번호를 선택하세요 : ");
            int choice = sc.nextInt();


            switch (choice) {
                case 1 :
                    // 새 도서 추가
                    break;

                case 2 :
                    // 도서정보 정렬 후 출력

                case 3 :
                    // 도서 삭제

                case 4 :
                    // 도서 검색출력

                case 5 :
                    // 전체 출력


                case 6 :
                    // 끝내기
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못 누르셨습니다. 다시 입력해주세요.");
                    break;
            }
            System.out.println("=================================");
        }
    }

//    public BookDTO inputBook() {
//
//
//    }
//
//    public String inputBookNo() {
//
//    }
//
//    public String inputBookTitle() {
//        return null;
//    }
//
//    public List<BookDTO> selectSortedBook() {
//        return null;
//    }

}
