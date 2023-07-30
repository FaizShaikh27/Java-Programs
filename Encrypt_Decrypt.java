package com.company;

public class Encrypt_Decrypt {
    public static void main(String[] args) {
        //Encrypt
        char grade= 'B';
        grade=(char)(grade+8);
        System.out.println("Encrypt : "+grade);
        //Decrypt
        grade=(char)(grade-8);
        System.out.println("Decrypt : "+grade);
    }
}
