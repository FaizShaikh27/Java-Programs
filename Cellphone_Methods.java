package com.company;

class Cellphone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
    public void call(){
        System.out.println("Calling....");
    }
}
public class Cellphone_Methods {
    public static void main(String[] args) {

        Cellphone realme = new Cellphone();
        realme.ring();
        realme.vibrate();
        realme.call();

    }
}
