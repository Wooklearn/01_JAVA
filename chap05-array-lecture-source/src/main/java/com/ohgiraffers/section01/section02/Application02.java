package com.ohgiraffers.section01.section02;

import java.util.Scanner;

public class Application02 {
    public void practice01() {
        // 문제 01
        System.out.print("나이가 어떻게 되세요? : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 19) {
            System.out.println("판매 불가능합니다. 음료코너에서 골라주세요.");
        } else if (age >= 19) {
            System.out.println("판매 가능합니다.");
        }
    }

    public void practice02() {
        // 문제 02
        Scanner sc = new Scanner(System.in);
        System.out.print("짝,홀 그 결과는? : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수입니다 ~ !");
        } else {
            System.out.println("홀수입니다 ~ !");
        }
    }

    public void practice03() {
        // 문제 03
        Scanner sc = new Scanner(System.in);
        System.out.print("당첨 번호가 어떻게 되세요? : ");
        int num = sc.nextInt();

        if (num > 10) {
            System.out.println("당첨 번호는 1~10 사이에만 있어요.");
        } else if (num % 2 == 0) {
            System.out.println("짝수네요, 모자 선물입니다!");
        } else {
            System.out.println("홀수네요, 인형 선물입니다!");
        }
    }

    public void practice04() {
        // 문제 04
        Scanner sc = new Scanner(System.in);
        System.out.print("키를 입력하세요 : ");
        double height = sc.nextDouble();
        System.out.print("몸무게를 입력하세요 : ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.println(bmi);

        if (bmi < 20) {
            System.out.println("저체중입니다. 축제 음식을 왕창 드세요!");
        } else if (bmi >= 20 && bmi < 25) {
            System.out.println("정상 체중입니다. 축제 재미있게 즐기세요~");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("축제에서 10,000보를 걷고 오시면 상품을 드려요!");
        } else if (bmi > 30) {
            System.out.println("댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!");
        }
    }

    public void practice05() {
        // 문제 05
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int second = sc.nextInt();
        System.out.print("연산기호를 입력하세요 ( +, -, *, /, %) : ");
        char ch = sc.next().charAt(0);

        int resule = 0;

        switch (ch) {
            case '+':
                resule = first + second;
                break;
            case '-':
                resule = first - second;
                break;
            case '*':
                resule = first * second;
                break;
            case '/':
                resule = first / second;
                break;
            case '%':
                resule = first % second;
                break;
        }
        System.out.println(first + " " + ch + " " + second + " = " + resule);
    }

    public void practice06() {
        // 문제 06
        Scanner sc = new Scanner(System.in);
        System.out.print("간식 이름을 입력해주세요 : ");
        String select = sc.nextLine();

        int price = 0;

        switch (select) {

            case "cp":
                System.out.println("팝콘은 15500원 입니다.");
                break;
            case "chu":
                System.out.println("츄로스는 3000원 입니다.");
                break;
            case "tong":
                System.out.println("팝콘은 2000원 입니다.");
                break;
            case "dotori":
                System.out.println("팝콘은 5000원 입니다.");
                break;
        }
        System.out.println("종료되었습니다.");
    }

    public void practice07() {
        // 문제 07
        Scanner sc = new Scanner(System.in);
        System.out.print("성실점수를 입력해주세요 : ");
        int a = sc.nextInt();
        System.out.print("서비스점수를 입력해주세요 : ");
        int b = sc.nextInt();
        System.out.print("미소점수를 입력해주세요 : ");
        int c = sc.nextInt();

        int total = a + b + c;
        int avg = (a + b + c) / 3;

        if (avg >= 60 && a >= 40 && b >= 40 && c >= 40) {
            System.out.println("합격입니다.");
        } else {
            if (a < 40) {
                System.out.println("성실점수 미달로 불합격 입니다.");
            }
            if (b < 40)
                System.out.println("서비스점수 미달로 불합격 입니다.");
            if (c < 40)
                System.out.println("미소점수 미달로 불합격 입니다.");
        }
    }

    public void practice08() {
        // 문제 08
        Scanner sc = new Scanner(System.in);

        System.out.print("월 급여 입력 : ");
        int salary = sc.nextInt();

        System.out.print("월 매출액 입력 : ");
        int income = sc.nextInt();

        double bonus = 0;


        if (income >= 50000000) {
            bonus = 0.05;
        } else if (income >= 30000000) {
            bonus = 0.03;
        } else if (income >= 10000000) {
            bonus = 0.01;
        } else if (income >= 10000000) {
            bonus = 0.0;
        }

        int total = salary + (int) (income * bonus);

        System.out.println("매출액은 : " + income + "입니다.");
        System.out.println("보너스율은 : " + (int) (bonus * 100) + " % " + "입니다.");
        System.out.println("월 급여는 : " + salary + "입니다.");
        System.out.println("보너스 금액은 : " + (income * bonus) + "입니다.");
        System.out.println("===================================");
        System.out.println("총 금액은 : " + total + "입니다.");


    }

    public void practice09() {
        // 문제 09
        Scanner sc = new Scanner(System.in);
        System.out.print("차를 골라주세요 : ");

        String select = sc.nextLine();

        switch (select) {
            case "so":
                System.out.println("소형차는 40000원 입니다.");
                break;
            case "jung":
                System.out.println("중형차는 55000원 입니다.");
                break;
            case "dea":
                System.out.println("대형차는 80000원 입니다.");
                break;
            case "SUV":
                System.out.println("SUV차는 100000원 입니다.");
                break;
            case "sh":
                System.out.println("승합차는 120000원 입니다.");
                break;
        }
    }

    public void practice10() {
//        중복 문자열 제거하고 출력하기
//        문자열을 사용자에게서 입력 받아 어떠한 문자들로 구성되어 있는지 출력하라.
//                - 입출력 예
//
//        문자열을 입력하시오: apple
//
//        구성 문자 요소 : a p l e
//
//        문자열을 입력하시오: banana
//
//        구성 문자 요소 : b a n

    }

    public void practice11() {
        /* Q1.길이가 10인 정수형 배열을 선언 및 할당한 뒤 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요.
         * */

        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = (i + 1);
            System.out.println((i + 1) + " 번 째 인덱스 " + a[i]);
        }
    }

    public void practice12() {
        // 문제 12
        String[] fruit = {"딸기", "바나나", "복숭아", "키위", "사과"};
        Scanner sc = new Scanner(System.in);
        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("딸기");
        } else if (num == 1) {
            System.out.println("바나나");
        } else if (num == 2) {
            System.out.println("복숭아");
        } else if (num == 3) {
            System.out.println("키위");
        } else if (num == 4) {
            System.out.println("사과");
        } else {
            System.out.println("준비된 과일이 없습니다.");
        }
    }

    public void practice13() {

        int a = 0;
        do while (a < 5) {
            a++;
            System.out.println(a);
        }int a
    }
}




