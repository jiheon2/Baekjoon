package org.example;

import java.util.Scanner;

public class B_1001 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if ( a < 0 ) {
            return;
        }

        if ( b > 10 ) {
            return;
        }

        int result = 0;

        result = a - b;

        System.out.printf(String.valueOf(result));
    }

}