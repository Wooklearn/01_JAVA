package com.ohgiraffers.section01.Practice;

import java.lang.invoke.SwitchPoint;
import java.util.Random;
import java.util.Scanner;

public class App01 {
    public void practice() {

        // 문제 01
        System.out.print("나이가 어떻게 되세요? : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 21) {
            System.out.println("판매 가능합니다.");
        } else if (a < 21) {
            System.out.println("판매 불가능합니다. 음료코너에서 골라주세요.");
        }
    }
    public void practice02() {

        // 문제 02
        System.out.print("짝,홀 그 결과는? : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String oddEven = (a % 2 == 0) ? "짝수":"홀수";

        System.out.println("결과는? " + oddEven + " 입니다.");
    }
    public void practice03() {

        // 문제 03
        System.out.print("당첨 번호가 어떻게 되세요? : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a >= 10) {
            System.out.println("담청 번호는 1 ~ 10 사이에만 있어요");
        } else if (a % 2 == 0) {
            System.out.println("짝수네요, 모자 선물입니다!");
        } else if (a % 2 != 0) {
            System.out.println("홀수네요, 인형 선물입니다!");
        }
    }
    public void practice04() {

        // 문제 04
        System.out.println("키와 몸무게를 입력하세요");
        System.out.print("키를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();

        System.out.print("체중을 입력하세요 : ");
        double k = sc.nextDouble();

        double result = (k / m * m);

        System.out.println("계산된 BMI는 " + result + " 입니다.");

        if(result < 20) {
            System.out.println("저체중입니다. 축제 음식을 왕창 드세요!");
        } else if(20 <= result && result < 25) {
            System.out.println("정상 체중입니다. 축제 재미있게 즐기세요~");
        } else if(25 <= result && result < 30) {
            System.out.println("축제에서 10,000보를 걷고 오시면 상품을 드려요!");
        } else if(result >= 30) {
            System.out.println("댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!");
        }
    }
    public void practice05() {

        //문제 05
        System.out.print("첫 번째 정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();

        System.out.println("연산 기호를 입력하세요 (+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch(op) {
            case '+' : result = a + b;
            break;
        }
        switch(op) {
            case '-' : result = a - b;
                break;
        }
        switch(op) {
            case '*' : result = a * b;
                break;
        }
        switch(op) {
            case '/': result = a / b;
                break;
        }
        switch(op) {
            case '%': result = a % b;
                break;
        }
        System.out.println(a + " " + op + " " + b + " = " + result );
    }
    public void practice06() {

        // 문제 06
        System.out.print("어떤 간식을 주문하시겠어요? : ");
        Scanner sc = new Scanner(System.in);
        String select = sc.nextLine();

        int prise = 0;

        switch (select) {
            case "pc": System.out.println("팝콘은 15,500원 입니다.");
            prise = 15500;
            break;
            case "chr" : System.out.println("츄로스는 3,000원 입니다.");
                prise = 3000;
                break;
            case "thr" : System.out.println("탕후루는 5,000원 입니다.");
                prise = 5000;
                break;
        }
        System.out.println("종료되었습니다.");
    }
    public void practice07() {
        /* 람쥐는 축제 부스에서 일한 뒤, 인사평가 점수를 받았습니다.
         *
         * 성실, 서비스, 미소 점수를 입력받아
         * 평균 점수가 60점 이상이면서 각 항목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,
         *
         * 단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해 주어야 합니다.
         * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다."라고 출력하고,
         * 항목당 과락 점수가 있는 경우 "xx 항목의 점수 미달로 불합격 입니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 성실 점수 : 60
         * 서비스 점수 : 30
         * 미소 점수 : 20
         *
         * -- 출력 예시 --
         * 평균 점수 미달로 불합격입니다.
         * 서비스 점수 미달로 불합격입니다.
         * 미소 점수 미달로 불합격입니다.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("성실 점수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.println("서비스 점수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.println("미소 점수를 입력하세요 : ");
        int c = sc.nextInt();


        int average = (a + b + c)/3;
        int total = a + b + c;


        if (average > 60 && a >=40 && b >= 40 && c >= 40) {
            System.out.println("합격입니다.");
        } else {
            if (average < 60) {
                System.out.println("평균점수 미달로 불합격입니다.");
            }
            if (a < 40) {
                System.out.println("성실점수 미달로 불합격입니다.");
            }
            if (a < 40) {
                System.out.println("서비스점수 미달로 불합격입니다.");
            }
            if (a < 40) {
                System.out.println("미소점수 미달로 불합격입니다.");
            }
        }

    }

}
