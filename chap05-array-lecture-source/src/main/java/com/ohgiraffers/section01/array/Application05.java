package com.ohgiraffers.section01.array;

public class Application05 {

    public static void main(String[] args) {

        /* title. 배열을 사용한 예제(2) */

        /* index. 랜덤한 카드 한 장을 뽑아서 출력 */
        /* comment. 카드의 숫자 / 카드의 문양 배열을 만들 것이다. */

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        // (Math.random() * 범위) + 최솟값;

        int randomShapesIndex = (int)(Math.random() * shapes.length);
        int randomcardNumbersIndex = (int)(Math.random() * cardNumbers.length);

        /* comment. 발생한 난수를 인덱스에 대입해서 출력 */
        System.out.println("당신이 뽑은 카드는 " + shapes[randomShapesIndex] + " " + cardNumbers[randomcardNumbersIndex] + " 카드 입니다.");

    }
}
