package com.company;

public class VarArgsAvgOfNum {
    static double avg(int ...array){
        double sum=0;
        for (int i:array){
            sum+=i;

        }
        double result;
        result = sum/array.length;
        return result;
    }
    public static void main(String[] args) {
        double res=avg(2,3,4,5,6,7);
        System.out.println(res);
    }
}
