package com.ohgiraffers.section03.math;

public class Application02 {

    public static void main(String[] args) {

        /* title. random() 사용해서 사용자 지정 범위의 난수 발생 */

        /* comment.
        *   난수의 활용
        *   Math.random() 을 이용하게 되면 0 부터 1 전까지의 실수
        *   값을 반환해준다.
        *   근데 우리는 필요에 따라서 정수를 출력하고 싶을 수 있고
        *   예를들어 8 ~ 20 사이의 난수 등등 이렇게 하고 싶다.
        *  */

        /* comment.
        *   원하는 범위의 난수를 구하는 공식
        *   (int)(Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최솟값
        *  */
        
        /* index. 1. 0 ~ 9 까지의 난수 발생 */
        int random1 = (int)(Math.random() * 10) + 0;

        System.out.println("random1 = " + random1);
        
        // 1 ~ 10
        int random2 = (int)(Math.random() * 10) + 1;
        System.out.println("random1 = " + random2);


        // 10 ~ 15
        int random3 = (int)(Math.random() * 6) + 10;
        System.out.println("random1 = " + random3);


        // -128 ~ 127
        int random4 = (int)(Math.random() * 256) - 128;
        System.out.println("random4 = " + random4);

    }

}
