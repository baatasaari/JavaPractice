package com.inheritance;

public class HasARelationShip {

    public static void main(String[] args) {
        Parent2 p2 = new Parent2(); // this can be any class
        p2.m1();
    }

    /*
     * IS-A : By default parent class methods are available to child class, in this case parent to child should have.
     * HAS-A : Create a object access required methods, in this case class can be any class.
     *
     * */
}
