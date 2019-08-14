package com.learnjava;

public class TestFor {
    public static void main(String[] args) {
        for (int x = 0; x <= 20; x++) {

            if (x == 10) {
                continue;
            }

            if (x == 15) {
                break;
            }

            System.out.println(x);

        }

        int[] numbers = {10000, 20000, 300, 40, 50};
        for (int x : numbers) {
            System.out.println(x);
        }

    }


}
