package com.company;
import java.util.Scanner;

public class Percentage_Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first subject marks out of 100");
        int first_subject=scan.nextInt();
        System.out.println("Enter second subject marks out of 100");
        int second_subject=scan.nextInt();
        System.out.println("Enter third subject marks out of 100");
        int third_subject=scan.nextInt();
        System.out.println("Enter fourth subject marks out of 100");
        int fourth_subject=scan.nextInt();
        double total=first_subject+second_subject+third_subject+fourth_subject;
        double percentage=total / 4;
        System.out.println("Percentage is : ");
        System.out.println(percentage);

    }
}
