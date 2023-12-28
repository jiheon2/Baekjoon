package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class B_11382 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Long> sum = new ArrayList<>();

        for (int i = 0; i < 3; i++ ) {
            sum.add(i, s.nextLong());
        }

        System.out.println(sum.get(0) + sum.get(1) + sum.get(2));
    }
}
