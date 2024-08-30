package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application03 {

    public static void main(String[] args) {

        /* title. java.utill.Random 클래스를 사용하여 난수 발생 */

        Random random = new Random();

        /* comment.
        *   random.nextInt()(구하려는 난수의 갯수) + 구하려는 난수의 최솟값
        *  */

        int randomNumber = random.nextInt(10);

        System.out.println(randomNumber);

        // 1 ~ 10
        int randomNumber2 = random.nextInt(10)+1;
        System.out.println("randomNumber2 = " + randomNumber2);

        // 10 ~ 15
        int randomNumber3 = random.nextInt(6)+10;
        System.out.println("randomNumber3 = " + randomNumber3);

        // -127 ~ 128
        int randomNumber4 = random.nextInt(256)-127;
        System.out.println("randomNumber4 = " + randomNumber4);



    }
}
