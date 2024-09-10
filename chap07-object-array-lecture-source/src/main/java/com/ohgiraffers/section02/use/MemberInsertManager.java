package com.ohgiraffers.section02.use;

public class MemberInsertManager {


    public void insert(MemberDTO[] member) {

        System.out.println("전달 받은 회원 " + member.length + "명 등록 하겠습니다!!");

        for (int i = 0; i < member.length; i++) {
            System.out.println(member[i].getName() + "님을 회원 등록에 성공했습니다.");

        }
    }
}
