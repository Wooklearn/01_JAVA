package com.ohgiraffers.section04.normal;

import java.util.Random;
import java.util.Scanner;

public class RandomMaker {

    public static void main(String[] args) {
        // 01번 문제
//        //최소값
//        System.out.print("최소값을 지정 : ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("최소값은" + a + "입니다.");
//
//        //최대값
//        System.out.print("최대값을 지정 : ");
//        int b = sc.nextInt();
//        System.out.println("최대값은" + b + "입니다.");
//
//
//        Application rand = new Application();
//        int result = rand.randomNumber(a,b);
//
//        System.out.println("랜덤 숫자는" + result + "입니다.");


        // 03번 문제
//        int rock = 1;
//        int Scissors = 2;
//        int Paper = 3;
//
//        //가위,바위,보 중 한개를 냄
//        System.out.println("가위,바위,보 중 한 가지를 입력하세요 : ");
//        Scanner sc = new Scanner(System.in);
//        int rockPaperScissors = sc.nextInt();
//        System.out.println("내가 낸 것은 " + rockPaperScissors + "입니다.");
//
//        //가위바위보 하자
//        Application app1 = new Application();
//        int result = app1.rockPaperScissors(1,2,3);
//
//        System.out.println(result);


        // 04번 문제
//앞면, 뒷면 중 한 가지를 출력함 (tossCoin 호출)

        System.out.print("0을 넣어 동전을 던지기 : ");

        Scanner sc = new Scanner(System.in);
        int coin = sc.nextInt();
        System.out.println("동전을 돌립니다.");

        Application app1 = new Application();
        app1.tossCoin(coin);










    }
}
