package com.company;

public class FibonacciSereis {

    static int fiboacci(int n){
       if(n==1 || n==2){
           return n-1;
       }
       else{
           return fiboacci(n-1)+fiboacci(n-2);
       }
    }

    public static void main(String[] args) {
        int num = fiboacci(5);
        System.out.println(num);
    }
}
