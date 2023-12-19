package org.example;

import java.util.Scanner;

public class B_2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(a*(b%10));
        System.out.println((a*(b%100) - a*(b%10)) / 10);
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }
}
