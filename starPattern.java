package com.company;

public class starPattern {
    static void patternStar1(int n){
        for(int i = 0; i < n ; i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patternStar2(int n){
        for(int i=n;i>0;i--){
            for(int j=i+1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternStar1(5);
        patternStar2(5);
    }
}
