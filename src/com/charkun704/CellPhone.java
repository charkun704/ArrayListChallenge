package com.charkun704;

import java.util.ArrayList;

public class CellPhone {
    private ArrayList<Contact> phonebook;
    private int myNum;

    public CellPhone(int myNum){
        this.myNum = myNum;
        this.phonebook = new ArrayList<Contact>();
    }
}
