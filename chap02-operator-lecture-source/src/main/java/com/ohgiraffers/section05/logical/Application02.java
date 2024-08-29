package com.ohgiraffers.section05.logical;

public class Application02 {

    public static void main(String[] args) {

        /* title. 논리연산자의 우선순위에 대해 이해하고 활용해보자. */

        /* comment.
        *   논리연산자의 우선순위와 활용
        *   논리 and 연산자와 논리 or 연산자의 우선순위
        *   && : 11순위
        *   || : 12순위
        *  */

        /* index. 1. 1 부터 100 사이의 값인지 확인 */
        int num1 = -10;

        System.out.println("num1이 1부터 100 사이인 지 확인 : " + (1 <= num1 && num1 <= 100));

        /* index. 2. 영어 대문자인지 확인 */
        char ch1 = 'G'; // 문자는 내부적으로 숫자이다.

        System.out.println("ch1 이 영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));

        /* 번외 */
        // a 는 A 보다 클까? -> 구글링 하지 말아보자. -> 형변환 써보자
        char aTest = 'a';
        char ATest = 'A';

        int aToInt = aTest;
        int AToInt = ATest;

        System.out.println("aToInt = " + aToInt);
        System.out.println("AToInt = " + AToInt);

        /* index. 3. 'f' 대소문자 상관 없이 영어인지 확인해보기 */
        // f 는 a ~ z 사이 이거나, A ~ Z 사이면 되지 않을까?
        int ch2 = 'f';

        System.out.println("영어인지 확인 : " + ( (ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <= 'Z')));



    }

}
