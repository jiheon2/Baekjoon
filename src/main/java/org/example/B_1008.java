package org.example;

import java.util.Scanner;

public class B_1008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if ( a < 0 )
            return;
        if ( b > 10 )
            return;
        double result = 0;
        result = (double) a / b; // int로 받은 값을 연산할 때 형변환을 해줘야한다.. 정수 / 정수 = 정수 | (double) 정수 / 정수 = 실수
        System.out.printf("%f", result);
    }
}