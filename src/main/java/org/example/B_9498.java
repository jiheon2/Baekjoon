package org.example;

import java.util.Scanner;

public class B_9498 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int examScore = s.nextInt();
        String examGrade = "";

        if (examScore >= 90) {
            examGrade = "A";
        } else if (90 > examScore && examScore >= 80) {
            examGrade = "B";
        } else if (80 > examScore && examScore >= 70) {
            examGrade = "C";
        } else if (70 > examScore && examScore >= 60) {
            examGrade = "D";
        } else if (60 > examScore) {
            examGrade = "F";
        }

        System.out.println(examGrade);
    }
}
