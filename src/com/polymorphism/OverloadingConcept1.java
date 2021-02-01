package com.polymorphism;

public class OverloadingConcept1 {

    /*
     * method should have same name but different parameter
     *
     * byte -> short ->
     * 					int -> long -> float -> double
     * char->
     *
     *
     * lower data type to higher data type promotion
     * */
    public static void main(String[] args) {
        OverloadingConcept1 ol = new OverloadingConcept1();
        ol.m1(10);
        ol.m1(10.5f);
        ol.m1('a');
        ol.m1(15l);
        ol.m1(22.5f);

    }

    public void m1(int i) {
        System.out.println("   int method "+i);
    }

    public void m1(float i) {
        System.out.println("   float method "+i);
    }

}
