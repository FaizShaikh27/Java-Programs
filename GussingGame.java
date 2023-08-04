package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int NoOfGuesses=0;
    public int inputNumber;


    public int getNoOfGuesses() {
        return NoOfGuesses;
    }


    public void setNoOfGuesses(int noOfGuesses) {
        NoOfGuesses = noOfGuesses;
    }



     Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }


    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }


    boolean isCorrectNumber(){
        NoOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes You guessed it right! The answer was %d and you guessed it in %d attempts",number,NoOfGuesses);
            return true;

        }
        else if (inputNumber<number){
            System.out.println("Too Low...");
        }
        else if (inputNumber>number){
            System.out.println("Too High...");
        }
        return false;

    }
}


public class GussingGame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b=false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            
        }
    }
}
