package com.company;

//Created a class named Employee
class Employee{
    //Specified the data types of variables
    int salary;
    String name;
    //Added a method named getSalary to return salary
    public int getSalary() {
        return salary;
    }
    //Added a method named getName to return name
    public String getName() {
        return name;
    }
    //Added a method named setName to get the Employee name
    public void setName(String n){
        name=n;

    }
}

public class EmployeeData {
    public static void main(String[] args) {
        //Created object for class Employee
        Employee Elon = new Employee();
        //Set name and salary of employee
        Elon.setName("Elon");
        Elon.salary= 20000;
        //Get output of name and salary
        System.out.println(Elon.getName());
        System.out.println(Elon.getSalary());
    }
}
