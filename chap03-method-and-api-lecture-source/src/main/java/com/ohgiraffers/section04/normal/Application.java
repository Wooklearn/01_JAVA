package com.ohgiraffers.section04.normal;

import java.util.Random;

public class Application {
//
//    public int randomNumber(int a, int b) {
//
//        Random rand = new Random();
//        return rand.nextInt(b - a + 1) + a;


    // 2번 문제
//    public int rockPaperScissors (int a, int b, int c) {
//
//        Random rand = new Random();
//        return rand.nextInt(3) + 1;


    // 4번 문제
    public int tossCoin (int a) {
        Random rd = new Random();
        return rd.nextInt(2) + 1;


    }



}
//  random.nextInt()(구하려는 난수의 갯수) + 구하려는 난수의 최솟값