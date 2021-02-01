package com.inheritance;

public class Parent2 {

    public void m1() {
        System.out.println(" PARENT 2 ");
        m2();
    }

    public void m2() {
        System.out.println("  Recursive Method 2 ");
        m1();
    }

    /*
     *
     * Recursive concept
     * */
    public static void main(String[] args) {
        Parent2 p2 = new Parent2();
        p2.m1();
    }

}
