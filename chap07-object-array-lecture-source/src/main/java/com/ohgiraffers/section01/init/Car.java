package com.ohgiraffers.section01.init;

public class Car {

    private String modelName;
    private int maxSpeed;


    public Car(String modelNlme, int maxSpeed) {
        this.modelName = modelNlme;
        this.maxSpeed = maxSpeed;
    }

    public void carMaxSpeedInfo() {
        System.out.println(modelName + "이(가) 최고속도 " + maxSpeed + "km/h 로 달려갑니다!!");
    }





}
