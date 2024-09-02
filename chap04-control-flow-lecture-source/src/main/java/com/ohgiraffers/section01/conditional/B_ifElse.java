package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    /* title. if-esle 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

    /* comment.
    *   [if-else 문 표현식]
    *   if(조건식) {
    *       조건이 true 일 때 실행 할 구문;
    *   } esle {
    *       조건이 false 일 때 실행 할 구문;
    *   }
    *  */

    /* comment.
    *   if 문은 조건식의 결과가 참(true) 이면 if {  } 내부의 코드 실행,
    *   else 문은 조건식의 결과가 거짓(false) 이면 else {  } 내부의 코드 실행
    *  */

    /* index. 1. 문제
    *   정수 한 개를 입력 받아 그 수가 홀수 이면, "입력하신 숫자는 홀수입니다." 출력하고,
    *   홀수가 아니면 "입력하신 숫자는 짝수입니다." 라고 출력하는 프로그램을 만들어보자.
    *   단, 조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다" 라고 출력되도록
    *   해보자. */

    public void testIfElseStatement () {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if (num % 2 != 0) {
            System.out.println("입력하신 숫자는 홀수 입니다.");

        } else {
            System.out.println("입력하신 숫자는 짝수 입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }
    public void testNestedIfElseStatement () {

        /* index. 2. 문제
        *   숫자를 하나 입력 받아 양수이면 "입력하신 숫자는 양수입니다." 출력하고,
        *   음수이면 "입력하신 숫자는 음수입니다." 출력
        *   단, 0이면 "입력하신 숫자는 0입니다." 출력
        *   조건과 상관 없이 프로그램이 종료될 때 "프로그램을 종료합니다." 를
        *   출력하는 프로그램을 만들어보자. */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        int num = sc.nextInt();

        if (num != 0) {

            if(num > 0) {
                System.out.println("입력하신 숫자는 양수입니다.");
            } else {
                System.out.println("입력하신 숫자는 음수입니다.");
            }
        } else {
            System.out.println("입력하신 숫자는 0 입니다.");
        }
        System.out.println("프로그램을 종료합니다.");


    }

}