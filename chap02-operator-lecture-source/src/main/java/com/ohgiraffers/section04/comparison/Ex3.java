package com.ohgiraffers.section04.comparison;

public class Ex3 {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = 7;

        int total = (a + b + c);
        float time = total/24f;

        System.out.println("하루 생산되는 과일의 총 갯수 : " + total);
        System.out.println("시간당 과일의 생산 갯수 : " + time);

    }
}
