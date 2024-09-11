package com.ohgiraffers.section01.polymorphism;

public class 너구리 extends 동물 {

    @Override
    public void 먹기() {
        System.out.println("너구리가 너구리라면을 먹습니다.");
    }

    @Override
    public void 뛰기() {
        System.out.println("너구리가 잽싸게 뛰어갑니다.");
    }

    @Override
    public void 울부짖기() {
        System.out.println("너굴너굴");
    }

    public void 깨물기() {
        System.out.println("너구리가 자기 밥그릇을 건든 사람에게 깨물기 공격을 시전합니다.");
    }
}
