package com.ohgiraffers.section02.copy;

public class ApplicationPractice {
    public static void main(String[] args) {

//        정수형 배열을 생성하고, 배열의 모든 요소의 합을 구하는 프로그램을 작성하세요.
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }
        System.out.println(sum);
    }
}

