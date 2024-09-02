package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSwitchStatement () {

        /* title. switch 문 단독 사용에 대한 흐름을 이해할 수 있다. */

        /* comment.
        *   [표현식]
        *   switch(비교 할 변수) {
        *       case 비교값1 : 비교값1 과 일치하는 경우 실행구문; break;
        *       case 비교값2 : 비교값2 과 일치하는 경우 실행구문; break;
        *       default : case 에 모두 해당하지 않는 경우 실행구문; break;
        *   } */

        /* comment.
        *   여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은
        *   if-else-if 구문과 유사하다.
        *   하지만 switch 문으로 비교가 가능한 값은 정수, 문자, 문자열 형태의
        *   값이다.
        *   실수와 논리는 비교할 수 없다. <- 중요
        *   또한 정확하게 일치하는 경우만 비교할 수 있으며
        *   대소비교를 할 수 없다는 게 차이점이다.
        *   case 절에는 변수를 사용할 수 없다. <- 값만 비교 가능하다.
        *  */

        /* index. 1. 문제
        *   정수 두 개와 연산 기호 문자를 입력 받아
        *   두 숫자의 연산 결과를 출력해보는 계산기 만들어 보기
        *  */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int first = sc.nextInt();

        System.out.print("두 번째 정수를 입력해주세요 : ");
        int second = sc.nextInt();

        System.out.print("연산 기호 입력 (+, -, *, /, %) : ");
        // 문자열을 charAt(인덱스) 으로 문자로 만들기
        char op = sc.next().charAt(0);
        // 입력한 연산기호 문자에 따라서 연산 결과를 다르게 만들어보기

        int result = 0;

        switch (op) {
            case '+' : result = first + second;
            break;

            case '-' : result = first - second;
                break;

            case '*' : result = first * second;
                break;

            case '/' : result = first / second;
                break;

            case '%' : result = first % second;
                break;
        }
        System.out.println(first + " " + op + " " + second + " = " + result);

    }

    public void testSwitchVendingMachine() {

        System.out.println("==========HiMedia 음료 자판기==========");
        System.out.println("  사이다s  맥콜m  눈의솔n  콜라c  환타h  밀키스b  ");
        System.out.println("=====================================");

        Scanner sc = new Scanner(System.in);
        System.out.print("음료를 선택해 주세요 : ");

        String selectDrink = sc.nextLine();

        // 투입 가격을 위한 변수 선언
        int price = 0;

        switch (selectDrink) {

            case "s" :
                System.out.println("사이다를 선택했습니다.");
                price = 500;
            case "m" :
                System.out.println("맥콜을 선택했습니다.");
                price = 300;
            case "n" :
                System.out.println("눈의솔을 선택했습니다.");
                price = 100;
            case "c" :
                System.out.println("콜라를 선택했습니다.");
                price = 700;
            case "h" :
                System.out.println("환타를 선택했습니다.");
                price = 750;
            case "b" :
                System.out.println("밀키스를 선택했습니다.");
                price = 500;
        }

        System.out.println(price + " 원을 투입해주세요!! ");

        System.out.println("========================================");
        System.out.println("=======HiMedia 음료 자판기 개선해보기=======");
        System.out.println("========================================");

        String orderMenu = "";

        switch (selectDrink) {

            case "s" :
                System.out.println("사이다를 선택했습니다.");
                price = 500;
                orderMenu = "사이다";
                break;
            case "m" :
                System.out.println("맥콜을 선택했습니다.");
                price = 300;
                orderMenu = "맥콜";
                break;
            case "n" :
                System.out.println("눈의솔을 선택했습니다.");
                price = 100;
                orderMenu = "눈의솔";
                break;
            case "c" :
                System.out.println("콜라를 선택했습니다.");
                price = 700;
                orderMenu = "콜라";
                break;
            case "h" :
                System.out.println("환타를 선택했습니다.");
                price = 750;
                orderMenu = "환타";
                break;
            case "b" :
                System.out.println("밀키스를 선택했습니다.");
                price = 500;
                orderMenu = "밀키스";
                break;

        }
        System.out.println(orderMenu + " 를 선택하셨습니다.");
        System.out.println(price + " 원을 투입해주세요!!!");

    }

}
