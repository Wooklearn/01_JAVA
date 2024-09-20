package com.ohgiraffers.section04.calculatingMachine;

public class Calculrator {

//        나누기의 경우 나눌 수 가 0인 경우 사용자 정의의 DivideNotZeroException 이 발생하도록 구현
//        DivideNotZeroException 클래스는 message 로 "나눌 수는 0이 될 수 없습니다" 출력
//        곱하기의 경우 곱하는 수가 0인 경우 사용자 정의의 MultipleNotZeroException 이 발생하도록 구현
//        MultipleNotZeroException 클래스는 message 로 "곱하는 수는 0이 될 수 없습니다" 출력
//        그 외에 본인이 만들고 싶은 예외사항 있으면 얼마든지 추가 가능

    public void calculate (int first, int second) {
        int result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public void calculate2 (int first, int second) {
        int result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    public void calculate3(int first, int second) {
        int result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    public void calculate4(int first, int second) {
        int result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    public void calculate5(int first, int second) {
        int result = first % second;
        System.out.println(first + " % " + second + " = " + result);
    }

}
