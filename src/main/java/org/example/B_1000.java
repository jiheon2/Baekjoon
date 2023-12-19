package org.example;

import java.util.Scanner;

public class B_1000 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if ( a < 0 ) {
            System.out.printf("다시 입력하세요");
            return;
        }

        if ( b > 10 ) {
            System.out.printf("다시 입력하세요");
            return;
        }

        int result = 0;

        result = a + b;

        System.out.printf(String.valueOf(result));
    }
}
