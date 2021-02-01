package com.ArraysConcepts;

public class Parent extends MyAbstract {

    String fatherName;
    int fatherAge;

    Parent(String fatherName, int fatherAge, String grandFatherName, int grandFatherAge){
        super(grandFatherName, grandFatherAge);
        this.fatherName = fatherName;
        this.fatherAge = fatherAge;
    }

    Parent(){
        System.out.println(" PARENT ");
    }

    Parent(String fatherName, int fatherAge){
        this.fatherName = fatherName;
        this.fatherAge = fatherAge;
        System.out.println(" PARAM PARENT ");
    }

    public static void main(String[] args) {
        Parent p = new Parent("Parent Name", 30, "Grand Father Name", 50);
        System.out.println(p.grandFatherName);
    }
}