package com.ohgiraffers.bookProjectPractice;

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

//        1. 새 도서 추가 // addBook (inputBook()이 리턴한 객체) 실행
//        2. 도서정보 정렬 후 출력 // printBookList() 실행
//          =>인자로 selectSortedBook()하여 리턴받은 리스트 객체사용
//        3. 도서 삭제 // deleteBook (inputBookNo()이 리턴한 도서 번호) 실행
//        4. 도서 검색출력 // searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
//          => 결과가 있는경우 해당 도서를 출력하고,
//             결과가 없는 경우 “조회한 도서가 목록에 없습니다.”
//
//        5. 전체 출력 // displayAll() 실행
//           => 비어있을 경우 “출력결과가 없습니다.”
//           비어있지 않은 경우 전체 출력
//        6. 끝내기 // main()으로 리턴
//        메뉴 번호 선택 : >> 입력 받음

// 메뉴 화면 반복 실행 처리
// 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행

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
                    BookDTO bookDTOAdd = inputBook();
                    bm.addBook(bookDTOAdd);
                    break;

                case 2 :
                    // 도서정보 정렬 후 출력
                    int select = selectSortedBook();
                    bm.sortedBookList(select);

                case 3 :
                    // 도서 삭제

                case 4 :
                    // 도서 검색출력



                case 5 :
                    // 전체 출력
                    bm.displayAll();
                    break;

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

    public BookDTO inputBook() {
        // 이 메소드 안에 BookDTO를 넣어야 호출 할 때마다 저장을 할 수 있다
        BookDTO bookDTO = new BookDTO();

        // 새 도서 추가
        System.out.print("도서 번호를 입력하세요 : ");
        int bookNo = sc.nextInt();
        
        System.out.print("장르 분류 번호를 입력하세요 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        
        sc.nextLine();
        System.out.print("책 이름을 입력하세요 : ");
        String title = sc.nextLine();
        
        System.out.print("책 저자를 입력하세요 : ");
        String author = sc.nextLine();
        
        bookDTO.setBookNum(bookNo);
        bookDTO.setBookClassificationNum(category);
        bookDTO.setBookName(title);
        bookDTO.setBookAuthor(author);

        // 4개의 저장된 값을 리턴
        return bookDTO;

    }

    public String inputBookNo() {
        BookDTO bookDTO = new BookDTO();
        System.out.print("삭제할 도서 번호를 입력하세요 : ");
        String bookNo = sc.nextLine();

        return bookNo;
//        삭제할 도서번호를 키보드로 입력 받아 리턴
    }

    public String inputBookTitle() {
        return null;
    }


    public int selectSortedBook() {

        System.out.println("정렬방식을 선택해주세요");
        System.out.println("1번 - 오름차순 정렬");
        System.out.println("2번 - 내림차순 정렬");
        System.out.print("메뉴 번호를 선택해주세요 : ");
        int first = sc.nextInt();

        return first;
    }

}
