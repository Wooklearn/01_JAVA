package com.ohgiraffers.section01.method;

public class Application02 {

    public static void main(String[] args) {

        /* title. 다른 흐름의 메소드 호출에 대해 이해할 수 있다. */

        /* index. 1. methodA(),methodB(),methodC() 차례로 작성 */
        /* index. 2. 작성 후 메소드 호출 확인과 실행 종료 출력 구문을 작성 */
        /* index. 3. 메인메소드 실행 종료를 확인하기 위한 출력 구문을 작성 */
        System.out.println("main() 시작됨...");
        /* index. 4. methodA(),B(),C() 차례로 호출을 해보자 */
        // 클래스명 변수명 = new 클래스명();
        // 변수명.메소드명();

        Application02 app2 = new Application02();
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main() 종료됨...");




    }


    public void methodA() {
        System.out.println("methodA 호출됨...");
        System.out.println("methodA 종료됨...");
    }

    public void methodB() {
        System.out.println("methodB 호출됨...");
        System.out.println("methodB 종료됨...");
    }
    // public -> 접근제한자
    public void methodC() {
        System.out.println("methodC 호출됨...");
        System.out.println("methodC 종료됨...");
    }

    private void methodD() {

        System.out.println("sadfasfsdafasdfasdfas");

    }


}
