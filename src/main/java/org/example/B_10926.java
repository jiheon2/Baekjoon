package org.example;

import java.util.Scanner;

public class B_10926 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String id = s.next().toLowerCase();

        if(id.length() > 50)
            return;

        System.out.printf("%s", id + "??!");
    }
}
