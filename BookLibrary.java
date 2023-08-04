package com.company;
import java.util.Scanner;

class Library{
    String[] books;
    int numberOfBooks;
    Library(){
        this.books= new String[100];
        this.numberOfBooks=0;
    }

    void showAvailableBooks(){
        System.out.println("Available Books Are: ");
        for (String book:this.books) {
            if(book==null){
                continue;
            }
            System.out.println("*"+book);
        }


    }
    void addBook(String book){
        this.books[numberOfBooks]=book;
        numberOfBooks++;
        System.out.println(book+" has been added");
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if (this.books[i]==book){
                System.out.println("The book has been issued");
                this.books[i]=null;
                return;
            }
            System.out.println("Book does not exist");
        }
    }
    void returnBook(String book){
        addBook(book);
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Library centralLibrary = new Library();
        centralLibrary.addBook("Rich Dad Poor Dad");
        centralLibrary.addBook("Atomic Habits");
        centralLibrary.addBook("Crush it on Linkedin");
        centralLibrary.addBook("Ikigai : The japanese secret to a long and happy life");
        centralLibrary.addBook("The manual of living");
        centralLibrary.addBook("The sun also rises");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("Atomic Habits");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("Atomic Habits");
    }
}
