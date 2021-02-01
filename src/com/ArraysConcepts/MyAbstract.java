package com.ArraysConcepts;

public abstract class MyAbstract {
    String grandFatherName;
    int grandFatherAge;
    String grandMotherName;

    MyAbstract(){
    }

    MyAbstract(String grandFatherName, int grandFatherAge, String grandMotherName){
        this.grandFatherName = grandFatherName;
        this.grandFatherAge = grandFatherAge;
        this.grandMotherName = grandMotherName;
    }

    MyAbstract(String grandFatherName, int grandFatherAge){
        this.grandFatherName = grandFatherName;
        this.grandFatherAge = grandFatherAge;
    }
}