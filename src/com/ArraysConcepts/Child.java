package com.ArraysConcepts;

public class Child extends Parent {

    String childName;
    int cAge;

    Child(){
        System.out.println("  CHILD ");
    }

    Child(String childName, int cAge, String fatherName, int fatherAge){
        super(fatherName, fatherAge);
        this.childName = childName;
        this.cAge=cAge;
        System.out.println(" PARAM CHILD ");
    }

    public static void main(String[] args) {
        Child ch = new Child();
        Child chParam = new Child("Child Name", 10, "Father Name", 30);
        System.out.println(chParam.fatherName);
    }

}

