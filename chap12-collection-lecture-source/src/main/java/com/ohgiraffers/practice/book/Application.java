package com.ohgiraffers.practice.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* title. ArrayList 활용 예제(1) */

        /* comment.
         *   요구사항
         *   1. 클래스는 Application, BookDTO 클래스로 구성한다.
         *   2. Application 클래스는 main 메소드를 포함한다.
         *   3. BookDTO 클래스는 책과 관련 된 데이터를 모아둔다.
         *   4. BookDTO 클래스는 책 번호, 책 이름, 책 저자, 책 가격을 관리한다.
         *   5. BookDTO 를 사용해서 총 다섯 권의 책을 관리 할 것이며
         *      4권의 책은 BookDTO 클래스의 매개변수 있는 생성자로 만들 것이다.
         *   6. 나머지 책 한 권은 Scanner 객체를 사용해서 우리가 입력한 값으로
         *      2번째 인덱스에 추가를 할 것이다.
         *  */

        /* comment.
         *   출력 예시
         *   1. Application 에서는 ArrayList 를 만들어 4권의 책을 넣고
         *   출력하는 구문을 작성하라.
         *   2. 4권의 출력하는 구문은 for 문 과 향상된 for 문 두 가지를 사용하라.
         *   3. 출력 후 Scanner 객체를 사용해 입력한 값을 ArrayList 에 넣어 출력하라.
         *  */




        List<BookDTO> book = new ArrayList<>();
        book.add(new BookDTO(1, "책1권", "김용욱", 15000));
        book.add(new BookDTO(2, "책2권", "김용순", 16000));
        book.add(new BookDTO(3, "책3권", "김용구", 17000));
        book.add(new BookDTO(4, "책4권", "김용팔", 18000));




        // ArrayList 사용시 값 불러오려면 .get 사용
        for (int i = 0; i < book.size(); i++) {
            System.out.println(book.get(i));
        }
        System.out.print("책 넘버를 입력해주세요 : ");
        int bookNum = sc.nextInt();
        sc.nextLine();
        System.out.print("책 이름를 입력해주세요 : ");
        String bookName = sc.nextLine();
        System.out.print("책 저자를 입력해주세요 : ");
        String bookAuthor = sc.nextLine();
        System.out.print("책 가격를 입력해주세요 : ");
        int bookPrice = sc.nextInt();

        BookDTO book2 = new BookDTO(bookNum,bookName,bookAuthor,bookPrice);

        System.out.println(book2);

        System.out.print("책을 몇번 째에 꽂아놓으시겠습니까? : ");
        int num00 = sc.nextInt();

        book.add(num00, book2);

        for (int i = 0; i < book.size(); i++) {
            System.out.println(book.get(i));
        }


    }

}
