package com.learnjava;

public class TestPolymorphism {

}

abstract class Animal1 {
    abstract void eat();
}

class cat extends Animal1 {
    public void eat() {
        System.out.println("吃鱼");
    }

    public void work() {
        System.out.println("抓老鼠");
    }
}