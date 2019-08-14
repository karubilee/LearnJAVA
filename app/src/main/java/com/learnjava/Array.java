package com.learnjava;

import java.util.ArrayList;
import java.util.List;

public class Array {
    String[] myStringList;

    public static void main(String[] args) {
        double[] doubles = new double[10];
        double[] doubles1 = {1.0, 2.0, 3.0, 4.0};

        List<String> list = new ArrayList<>();
        list.add("haha");
        System.out.println(list);

        for (int i = 0; i < doubles1.length; i++) {
            System.out.println(doubles1[i] + " ");
        }

        for (double v : doubles1) {
            System.out.println(v + " ");
        }
    }
}
