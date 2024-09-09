package com.ohgiraffers.section05.parameter;

public class RectAngle {

    private double width;       // 너비
    private double heigth;      // 높이

    // 매개변수가 있는 생성자를 작성하면, 기본생성자는 자동으로 만들어지지 않는다.

    public RectAngle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public void calcArea() {

        double area = width * heigth;

        System.out.println("이 사각형의 넓이는 " + area + "입니다.");
    }

    public void calcRound() {

        double round = (width + heigth) * 2;

        System.out.println("이 사각형의 둘레는 " + round + "입니다.");

    }

}
