package com.company;
import java.util.Scanner;

class Square{
    int side;
    int area;
    int perimeter;

    public int setSide(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side of the square");
        side = scan.nextInt();
        return side;
    }
    public void getArea(int side){
        area= side * side;
        System.out.println("Area of the square is : "+area);
    }

    public void getPerimeter(int side){
        perimeter=side*4;
        System.out.println("Perimeter of the square is : "+perimeter);
    }
}

public class Square_Area {
    public static void main(String[] args) {
        Square sq = new Square();
        int sideOfSquare=sq.setSide();
        sq.getArea(sideOfSquare);
        sq.getPerimeter(sideOfSquare);
    }
}
