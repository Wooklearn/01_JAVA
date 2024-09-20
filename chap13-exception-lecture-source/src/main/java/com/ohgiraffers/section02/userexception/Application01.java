package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section01.exception.ExceptionTest;
import com.ohgiraffers.section02.userexception.exception.MoenyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application01 {

    public static void main(String[] args) {

        /* title. 사용자 정의의 예외클래스 정의 후 발생한 예외를 처리할 수 있다. */

        ExceptionTest2 et = new ExceptionTest2();

        try {
            // 상품 가격 음수
//            et.checkEnoughMoney(-3000, 5000);
            // 가진 돈 음수
//            et.checkEnoughMoney(3000, -5000);
            // 물건의 가격이 가진 돈 보다 큼
            et.checkEnoughMoney(10000, 5000);





        } catch (PriceNegativeException e) {
            throw new RuntimeException(e);
        } catch (MoenyNegativeException e) {
            throw new RuntimeException(e);
        } catch (NotEnoughMoneyException e) {
            throw new RuntimeException(e);
        }

    }

}
