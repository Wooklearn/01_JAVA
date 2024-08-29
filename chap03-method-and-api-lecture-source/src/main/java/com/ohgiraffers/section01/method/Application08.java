package com.ohgiraffers.section01.method;

public class Application08 {

    public static void main(String[] args) {

        /* title. static 메소드를 호출 할 수 있다. */
        /* comment.
        *   우리가 지금 만들고 있는 메소드는 public 과 void or 자료형 사이에
        *   static 키워드가 붙은 메소드를 만들어서 호출을 해 볼 것이다.
        *   static 나중에 다시 다룰거지만,
        *   static 키워드가 붙은 메소드 호출을 알아 볼 것이다. */

        Application08.sumTwoNumbers(10,20);

        int result = Application08.sumTwoNumbers(10,20);

        System.out.println("result = " + result);

        /* comment.
        *   동일한 클래스 내에 작성 된 static 메소드는 클래스 명이
        *   생략 가능하다. */
        sumTwoNumbers(10,20);

    }

    public static int sumTwoNumbers(int first, int second) {

        /* comment.
        *   [표현식]
        *   클래스명.메소드명(); <- 이런방식으로 호출한다. */

        return first + second;

    }


}
