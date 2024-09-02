package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class WookEx {

    public void test() {
        System.out.print("내 몸무게는? : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        if (a > 70) {
            System.out.println("샐러드를 먹을게!");

        } else if (a < 70) {
            System.out.println("치킨집이 열었나 확인하려면 0을 누르세요");
            int b = sc.nextInt();

            if (b == 0) {
                System.out.println("치킨을 먹을게!");

            } else {
                System.out.println("라면을 먹을게!");

            }

            System.out.println("종료하겠습니다.");

        }


    }

}