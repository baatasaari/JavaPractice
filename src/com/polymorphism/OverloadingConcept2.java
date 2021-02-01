package com.polymorphism;

public class OverloadingConcept2 {

    /*
     * Promotions are always takes from child to parent
     * */
    public static void main(String[] args) {

        OverloadingConcept2 ol = new OverloadingConcept2();
        ol.m1(" JAVA ");
        ol.m1(new Object());
        ol.m1(null);

    }


    public void m1(String s) {
        System.out.println("  String Class "+s);
    }

    public void m1(Object o) {
        System.out.println("  Object Class "+o);
    }
}
