package com.company;

import java.util.Scanner;

public class Greater_or_not {
    public static void main(String[] args) {
        int a= 5;
        System.out.println("Enter your number to check wheater it is greater or not from the given number");
        Scanner scan= new Scanner(System.in);
        int b=scan.nextInt();
        System.out.println(a>b);

    }
}
