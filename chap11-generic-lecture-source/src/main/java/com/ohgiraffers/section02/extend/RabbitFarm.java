package com.ohgiraffers.section02.extend;

/* RabbitFarm 은 말그대로 토끼를 위한 농장 */
public class RabbitFarm<T extends Rabbit>{

    /* <T extends Rabbit> 의 의미
    *   타입변수(T)어떤 녀석이 될 지 모른다.
    *   하지만, extends Rabbit 이라고 설정을 하게 되면
    *   토끼 이거나, 토끼를 상속 받는 녀석은 다 가능하다.
    *  */

    private T animal;

    public RabbitFarm () {}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
