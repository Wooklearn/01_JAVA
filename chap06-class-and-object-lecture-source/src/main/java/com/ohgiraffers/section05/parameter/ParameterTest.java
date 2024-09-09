package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimaryParameter(int num) {

        System.out.println("매개변수로 전달 받은 값 : " + num ) ;

    }

    public void testPrimaryArrayParameter(int[] iarr) {

        System.out.println("매개변수로 전달 받은 값 : " + iarr);

        System.out.print("배열의 값 확인 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i] + " ");

        }
        System.out.println();

        // 얕은복사 확인을 위한 값 변경 test
        iarr[0] = 99;

        System.out.print("배열의 값 확인 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i] + " ");

        }
        System.out.println();
    }

    public void testClassParameter(RectAngle r1) {

        System.out.println("매개변수로 전달 받은 값 : " + r1);

        System.out.println("변경 전 사각형의 넓이와 둘레");
        r1.calcArea();
        r1.calcRound();

        System.out.println("===========================");
        System.out.println("변경 후 사각형의 넓이와 둘레");
        r1.setHeigth(100);
        r1.setWidth(100);

        r1.calcArea();
        r1.calcRound();
    }

    public void testVariableLengthParameter(String name, String...hobbies) {


        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobbies.length);
        System.out.println("취미 : ");
        for (int i = 0; i < hobbies.length; i++) {
            System.out.println(hobbies[i] + " ");

        }
        System.out.println();
    }
}
