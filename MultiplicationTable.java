package com.company;

public class MultiplicationTable {
    static void multiplication(int n){
        for(int i=1;i<11;i++){
            System.out.format("%d X %d = %d",n,i,n*i);
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
            //Problem : WAP to print multiplication table of number n
        multiplication(5);
    }
}
