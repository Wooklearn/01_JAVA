package com.ohgiraffers.section04;

import java.util.Scanner;

public class PracticeF {
    public void practice() {
        // 문제 01
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 더한 값 : " + sum);
    }
    public void practice01() {
        // 문제 02
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("1부터 " + num + "까지의 합은 : " + sum);
    }
    public void practice02() {
        // 문제 03
        System.out.print("정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
    public void practice03() {
        // 문제 04
        System.out.print("문자열을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(i + "번째 숫자는 : " + ch);
        }
    }
    public void practice04() {
        // 문제 05
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i);
        }
    }
    public void practice05() {
        // 문제 06
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print("토");
            } else {
                System.out.print("마");
            }
        }
    }
    public void practice06() {
        // 문제 07
        /* 2보다 큰 정수를 하나 입력 받아 그 수가 소수인지 아닌지를 판별해서 출력하세요.
         * 소수인 경우 "소수다." 출력, 소수가 아닌 경우 "소수가 아니다."를 출력하면 됩니다.
         *
         * 단, 2보다 큰 정수가 아닌 경우 "잘못 입력하셨습니다. 다시 입력하세요." 라고 출력 후
         * 정수를 다시 입력 받도록 하세요.
         *
         * 참고) 소수란?
         * 어떤 수를 1부터 자기 자신까지 차례대로 나누었을 때
         * 나누어 떨어지는 수가 1과 자기 자신만 존재하는 수를 소수라고 한다.
         *
         * -- 입력 예시 --
         * 2보다 큰 정수를 하나 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 소수다.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : ");
        int num = sc.nextInt();

        for (int i = 1; i > 2;) {
        }


    }
    public void practice07() {
        // 문제 08
        /* 1부터 100 사이의 난수를 발생시키고
         * 정수를 입력 받아서 입력받은 정수가 발생한 난수보다 큰 경우 "입력하신 정수보다 큽니다."를,
         * 입력받은 정수보다 난수가 작은 경우 "입력하신 정수보다 작습니다."를 출력하며
         * 입력한 정수와 난수와 같은 경우가 될 때까지 난수 맞추기를 반복하는 프로그램을 만드세요.
         *
         * 단, 입력한 정수와 난수가 같은 경우 "정답입니다. n회 만에 정답을 맞추셨습니다."라고
         * 정답을 입력한 횟수도 함께 출력되도록 해야 합니다.
         * 첫 회부터 바로 난수를 맞추는 경우는 1회만에 정답을 맞춘 것입니다.
         *
         * 정답을 맞추는 경우 위 내용을 출력하고 프로그램이 종료되도록 작성하세요.
         *
         * -- 프로그램 예시 --
         * 정수를 입력하세요 : 5
         * 입력하신 정수보다 작습니다.
         * 정수를 입력하세요 : 3
         * 입력하신 정수보다 큽니다.
         * 정수를 입력하세요 : 4
         * 정답입니다. 3회만에 정답을 맞추셨습니다.
         * */

        int random = (int)(Math.random() * 100) + 1;
        System.out.println("1부터 100까지의 난수 : " + random);

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        int trynum = 0;

        if (num < random) {
            System.out.println("입력하신 정수보다 큽니다.");
        } else if (num > random) {
            System.out.println("입력하신 정수보다 작습니다.");
        } else if (num == random) {
            System.out.println("정답입니다. " + trynum + "회 만에 정답을 맞추셨습니다.");
        }


    }
    public void practice08() {
        /* 문자열을 하나 입력 받고,
         * 검색할 문자형을 하나 입력 받아
         * 입력받은 문자열에 검색할 문자가 몇 개 포함되어 있는지를 출력하는 프로그램을 만드세요.
         *
         * 단, 문자열에 영문자가 아닌 문자가 섞여 있는 경우에는
         * 검색할 문자를 입력받지 않고 "영문자가 아닌 문자가 포함되어 있습니다." 출력 후 프로그램을 종료하세요.
         *
         * 또한 일치하는 문자의 경우 대소문자를 구분합니다.
         *
         * -- 프로그램 예시 --
         *
         * -- 정상 동작의 경우 --
         * -- 입력 예시 --
         * 문자열 입력 : apple
         * 문자 입력 : p
         *
         * -- 출력 예시 --
         * 포함된 갯수 : 1개
         *
         * --------------------
         * -- 영문자가 아닌 문자 포함된 경우 --
         * -- 입력 예시 --
         * 문자열 입력 : app2le
         *
         * -- 출력 예시 --
         * 영문자가 아닌 문자가 포함되어 있습니다.
         * */
    }
}


//System.out.print("정수를 입력하세요 : ");
//Scanner sc = new Scanner(System.in);
//int num = sc.nextInt();
//int random = (int)(Math.random()*10);
//
//int trynum = 0;
//
//        for () {
//                }
//
//
//                if (num < random) {
//        System.out.println("입력하신 정수보다 작습니다.");
//        } else if (num > random) {
//        System.out.println("입력하신 정수보다 큽니다.");
//        }