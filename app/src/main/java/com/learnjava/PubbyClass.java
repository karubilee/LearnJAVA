package com.learnjava;

public class PubbyClass {
    int puppyAge;
    public PubbyClass(String name) {
        System.out.println("my dag's name is :" + name);
    }

    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }

    public int getPuppyAge() {
        return puppyAge;
    }

    public static void main(String[] args) {
        PubbyClass pubbyClass = new PubbyClass("JAVA");
        pubbyClass.setPuppyAge(3);
        System.out.println(pubbyClass.getPuppyAge());
    }
}
