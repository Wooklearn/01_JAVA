package com.ohgiraffers.section03.dto;

public class Application {

    public static void main(String[] args) {

        /* title. 데이터를 추상화하는 기법을 이용할 수 있다. */

        /* comment.
        *   캡슐화의 원칙에는 일부 어긋나긴 하기만, 다른 목적을 가진
        *   클래스와 객체를 추상화 하는 기법이 있다.
        *   행위(메소드) 위주가 아닌, 데이터를 하나로 뭉치기 위한
        *   객체(Data Transfer Object) 의 경우이다.
        *   이러한 객체를 설계할 때는 행위가 아닌 데이터 위주이며
        *   캡슐화를 적용하여 모든 필드를 private 로 막고 각
        *   필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성해둔다.
        *   어떤 값을 쓸 지 모르니 미리 다 준비해두는 선물세트 같은 느낌이다.
        *   private 로 캡슐화가 된 필드와, 필드의 값을 수정할 수 있는
        *   설정자(setter), 필드에 값을 접근할 수 있는 접근자(getter) 로
        *   구성이 된다. 주로 계층간의 데이터를 주고 받을 목적이다.
        *  */

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberNo(1);
        memberDTO.setName("조평훈");
        memberDTO.setAge(20);
        memberDTO.setGender('남');
        memberDTO.setHeight(180.32);
        memberDTO.setWeight(60);
        memberDTO.setActivated(true);

        System.out.println("회원번호 : " + memberDTO.getMemberNo());
        System.out.println("회원명 : " + memberDTO.getName());
        System.out.println("회원나이 : " + memberDTO.getAge());
        System.out.println("회원성별 : " + memberDTO.getGender());
        System.out.println("회원키 : " + memberDTO.getHeight());
        System.out.println("회원몸무게 : " + memberDTO.getWeight());
    }
}
