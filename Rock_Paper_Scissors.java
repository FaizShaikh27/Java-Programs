package com.company;
import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int computer = random.nextInt(3);
        System.out.println("Enter your choice!\n0 for Rock\n1 for Paper\n2 for Scissors");
        int user = scan.nextInt();
        if(computer==user)
            System.out.println("Tie");
        else if (user==0 && computer==2 || user==1 && computer==0 || user==2 && computer==1) {
            System.out.println("You win!");
        }
        else System.out.println("You Loose!");
    }
}
