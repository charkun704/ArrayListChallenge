package com.charkun704;

public class Contact {
    private String name;
    private int phoneNum;

    Contact(){
        this.name = "UNDEFINED";
        this.phoneNum = 0;
    }
    Contact(String name, int phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public void printContact(){
        System.out.println("Name: "+ name );
        System.out.println("Number: "+phoneNum);
    }
}
