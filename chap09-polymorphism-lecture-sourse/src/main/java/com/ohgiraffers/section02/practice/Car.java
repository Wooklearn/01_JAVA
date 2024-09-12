package com.ohgiraffers.section02.practice;

public class Car {


    private boolean isRunning;


    public void run() {
        this.isRunning = true;
        System.out.println("자동차가 달립니다.");
    }

    public void sound() {
        //자동차가 달리는 중에만 사용 가능

        System.out.println("빵~ 빵~");
    }

    public void stop() {

        System.out.println("자동차가 멈춥니다.");
    }

    protected boolean isRunning() {
        if (isRunning) {
            System.out.println("시동을 먼저 걸어주세요");
        } else {
            System.out.println("시동이 걸어져있습니다.");
        }

        return isRunning;
    }




}
