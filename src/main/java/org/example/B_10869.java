package org.example;

import java.util.Scanner;

public class B_10869 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if ( a < 0 )
            return;
        if ( b > 10000 )
            return;
//        System.out.printf("%d", a + b);
//        System.out.printf("\n");
//        System.out.printf("%d", a - b);
//        System.out.printf("\n");
//        System.out.printf("%d", a * b);
//        System.out.printf("\n");
//        System.out.printf("%d", a / b);
//        System.out.printf("\n");
//        System.out.printf("%d", a % b);
//        System.out.printf("\n");

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
