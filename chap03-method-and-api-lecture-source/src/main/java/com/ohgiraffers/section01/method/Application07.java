package com.ohgiraffers.section01.method;

import java.io.PrintStream;

public class Application07 {

    public static void main(String[] args) {
        // 매개변수, 전달인자, 리턴
        /* title. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해할 수 있다. */

        /* comment.
         *   매개변수와 리턴값 복합 응용
         *   매개변수도 존재하고 리턴값도 존재하는 메소드를 이용해서
         *   간단한 계산기 만들어보기.
         *  */

        /* comment.
         *   더하기 메소드, 빼기 메소드, 곱하기 메소드, 나누기 메소드
         *   해당하는 메소드 들에게 2개의 정수를 넘겨줄 것이다.
         *  */

        int first = 20;
        int second = 10;

        Application07 app7 = new Application07();
        app7.plusTwoNumbers(first, second);     // 30
        app7.minusTwoNumbers(first, second);
        app7.multipleTwoNumbers(first, second);
        app7.divideTwoNumbersTwoNumbers(first, second);



        System.out.println(app7.plusTwoNumbers(first, second));
        System.out.println(app7.minusTwoNumbers(first, second));
        System.out.println(app7.multipleTwoNumbers(first, second));
        System.out.println(app7.divideTwoNumbersTwoNumbers(first, second));


    }

    public int plusTwoNumbers(int first, int second) {

        System.out.println("first = " + first);
        System.out.println("second = " + second);

        return first + second;

    }
    public int minusTwoNumbers(int first, int second) {

        return first - second;

    }
    public int multipleTwoNumbers(int first, int second) {

        return first * second;

    }
    public int divideTwoNumbersTwoNumbers(int first, int second) {

        return first / second;

    }


}