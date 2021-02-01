package com.inheritance;

public class Child extends Parent{

    public void m2() {
        System.out.println("   CHILD ");
    }

    /*
     * JAVA wont support multiple inheritance concept
     * but it supports multi level inheritance concept
     * */
    public static void main(String[] args) {

        Parent p = new Parent();
        p.m1();

        Child c = new Child();
        c.m1();
        c.m2();
        System.out.println(c.i);


        Parent pC = new Child();
        pC.m1();
        System.out.println(pC.i);

    }

}
