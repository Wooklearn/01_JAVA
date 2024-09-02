package com.ohgiraffers.section01.conditional;

import java.util.Random;
import java.util.Scanner;

public class WookEx {

    public void test() {
        System.out.print("내 몸무게는? : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        if (a >= 70) {
            System.out.println("샐러드를 먹을게!");

        } else if (a < 70) {
            System.out.print("치킨집이 열렸나? 확인하려면 yes(1) or no(2)을 입력하세요.");
            int b = sc.nextInt();

            if (b == 1) {
                System.out.println("치킨을 먹을게!");
            } else if (b == 2) {
                System.out.println("라면을 먹을게!");
            }
        }
    }
}