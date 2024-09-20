package com.ohgiraffers.section01.exception;

public class Application02 {

    public static void main(String[] args) {

        /* title. try-catch 블럭을 이용하여 예외처리를 할 수 있다. */

        /* index. 2. try-catch 블럭을 이용한 방법(예외 발생하지 않음) */

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(10000,50000);

            System.out.println("========상품 구입 가능========");

        } catch (Exception e) { // try 구문 내에서 예외가 발생하면 catch 구문이 동작을 한다.
            System.out.println("========상품 구입 불가능========");
        }

        System.out.println("프로그램을 종료합니다.");

    }

}
