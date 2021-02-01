package com.polymorphism;

public class OverloadingConcept3 {

    public static void main(String[] args) {
        OverloadingConcept3 ol = new OverloadingConcept3();
        ol.m1(" JAVA ");
        ol.m1(new StringBuffer("JAVA SB"));
        ///ol.m1(null);  compiler is confused when both the methods doesn't have relationship
    }

    public void m1(String s) {
        System.out.println("  String Class "+s);
    }

    public void m1(StringBuffer sb) {
        System.out.println("  StringBuffer Class "+sb);
    }

}