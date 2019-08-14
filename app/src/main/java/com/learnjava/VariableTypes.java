package com.learnjava;

public class VariableTypes {
    static int allClicks = 0; // 类变量

    String str = "Hello world"; // 实例变量

    private static double salary;
    // DEPARTMENT是一个常量
    public static final String DEPARTMENT = "开发人员";

    public static void main(String[] args) {
        salary = 10000;
        System.out.println(DEPARTMENT+"平均工资:"+salary);
    }

    public void method() {
        int i = 0; //局部变量
    }
}
