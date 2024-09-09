package com.ohgiraffers.practice.practice;

import java.util.Enumeration;
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
        // 문제 13
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int first = sc.nextInt();
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int second = sc.nextInt();
        System.out.print("연산기호를 입력하세요 (+, -, *, /, %) : ");
        String calculation = sc.next();

        int result = 0;

        switch (calculation) {
            case "+" : result = first + second;
            break;
            case "-" : result = first - second;
                break;
            case "*" : result = first * second;
                break;
            case "/" : result = first / second;
                break;
            case "%" : result = first % second;
                break;
            default :
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
        }
        System.out.println(first + " " + calculation + " " + second + " = " + result);
    }

    public void practice14() {
        // 문제 14
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 과목의 점수 : ");
        int first = sc.nextInt();
        System.out.print("첫 번째 과목의 점수 : ");
        int second = sc.nextInt();

        int avg = (first * second) / 2;

        if (avg >= 60 && first > 40 && second > 40) {
            System.out.println("합격입니다.");
        } else {
            if (first < 40){
                System.out.println("불합격입니다.");
            }
            if (second < 40) {
                System.out.println("불합격입니다.");
            }
        }
    }

    public void practice15() {
        // 문제 15
//        Q4. Scanner 로 1 ~ 12 사이의 정수를 입력 받아 입력 한 정수에 해당하는
//        계절의 정보를 출력하시오.
//                추가적으로 겨울과 여름의 경우 온도를 입력받아
//        겨울에 경우 -15 도 이하이면 한파경보
//                -5 ~ -14 이면 한파 주의보
//        여름의 경우 33도 이상이면 폭염경보,
//                28 ~ 33 이면 폭염주의보 를 출력하시오


        Scanner sc = new Scanner(System.in);
        System.out.println("월 입력 : ");
        double a = sc.nextDouble();

        if (a <= -15) {
            System.out.println("한파경보");
        } else if (a >= -14 && a <= -5) {
            System.out.println("한파주의보");
        } else if (a >=  1&& a <= 1) {
        }
    }
    public void practice16() {
        // 문제 16
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }
        System.out.println(sum);
    }
    public void practice17() {
        /* Q1.길이가 10인 정수형 배열을 선언 및 할당한 뒤 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요.
         * */

        int[] num = new int[10];
        for (int i = 1; i < num.length + 1; i++) {

            System.out.println(i + "번째 숫자는 : " + i);
        }

//        int[] num = new int[10];
//        for (int i = 0; i < num.length; i++) {
//
//            num[0] = i + 1;
//
//            System.out.println((i + 1) + "번째 숫자는 : " + num[0]);
//        }

    }
    public void practice18() {

        /* 1. 길이가 5인 String 배열 선언
         * 2. "딸기", "바나나", "복숭아", "키위", "사과"로 초기화
         * 3. 스캐너로 0부터 4까지의 정수를 입력받아
         * 4. 해당 정수의 인덱스에 있는 과일을 출력
         *
         * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 2
         *
         * -- 출력 예시 --
         * 복숭아
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 준비된 과일이 없습니다.
         * */
        Scanner sc = new Scanner(System.in);
        String[] fruit = {"딸기", "바나나", "복숭아", "키위", "사과"};

        for (int i = 0; (i != 0 || i !=1); i++) {
            System.out.print("정수를 입력하세요 : ");
            int num = sc.nextInt();

            if (num == 0) {
                System.out.println(fruit[0]);
                break;
            } else if (num == 1) {
                System.out.println(fruit[1]);
                break;
            } else if (num == 2) {
                System.out.println(fruit[2]);
                break;
            } else if (num == 3) {
                System.out.println(fruit[3]);
                break;
            } else if (num == 4) {
                System.out.println(fruit[4]);
                break;
            } else {
                System.out.println("준비된 과일이 없습니다.");
            }
        }
    }

    public void practice19() {
        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력받은 검색할 문자가 배열에 몇 개 있는지를 출력하세요.
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         * 검색할 문자를 입력하세요 : l
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         *
         * -- 고려 사항 --
         * 문자배열, 반복문, charAt(), length(), 갯수를 담을 변수
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String st = sc.nextLine();
        System.out.print("검색할 문자를 입력하세요 : ");
        char cs = sc.next().charAt(0);

        char[] ch = st.toCharArray();

        int count = 0;

        for (int i = 0; i < st.length(); i++) {
            if (cs == ch[i]) {
                count++;
            }
        }
        System.out.println("입력하신 문자열 " + st + "에서 찾으시는 문자 " + cs + "는" + count + "입니다.");
    }
    public void practice20() {
        // 반복문 01
        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            sum += i;

        }
        System.out.println("1부터 10까지의 합은 : " + sum + "입니다.");
    }

    public void practice21() {
        // 반복문 02
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 한개를 입력해주세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {

            sum += i;

        }
        System.out.println("입력한 값까지의 합은 : " + sum );
    }

    public void practice22() {
        // 반복문 03
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {

                sum+=i;
            }
        }
        System.out.println("입력한 정수까지의 짝수의 합은 = " + sum);
    }

    public void practice23() {
        // 반복문 04
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("문자열을 입력하세요 : ");
        System.out.println(str.charAt(0));

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public void practice24() {
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
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            str.charAt(i);


        }
    }
}

//looping
//7,9,10,11
//배열
//3,4



