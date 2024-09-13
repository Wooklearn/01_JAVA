package miniproject;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {

        System.out.println("게임을 시작합니다.");
        System.out.println();
//        System.out.println("현재 돈 : " + money);
        System.out.println("1. 작물 선택");
        System.out.println("2. 작물 성장 (가위바위보)");
        System.out.println("3. 작물 팔기");
        System.out.println("0. 게임 설명");
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("1. 작물을 선택하세요.");
                    break;
                case 2:
                    System.out.println("2. 작물에 물을 줍니다.");
                    break;
                case 3:
                    System.out.println("3. 작물을 팝니다.");
                    break;
                case 0:
                    System.out.println("이 게임은 농장 게임입니다. 작물을 키우고 성장시킬 수 있으며, " +
                            "잘 키워진 작물을 팔아 1000원을 모으면 끝나는 게임입니다.");
                    break;
                default:
                    System.out.println("잘못 누르셨습니다. 다시 입력해주세요.");
                    return;
            }
            {
//                if (money >= 1000) {
//                    System.out.println("축하합니다!! 1000원을 모아서 게임이 종료됩니다.");
//                    return;
//                }
            }
            System.out.println("========================================================");
        }
    }
}