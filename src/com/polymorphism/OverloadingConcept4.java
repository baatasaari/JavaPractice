package com.polymorphism;

import com.inheritance.Child;
import com.inheritance.Parent;

public class OverloadingConcept4 {

    /*
     * When there is no relation it cause ambiguity issues
     * */
    public static void main(String[] args) {
        OverloadingConcept4 ol = new OverloadingConcept4();
        ol.m1(new Child());
        ol.m1(new Parent());
        ol.m1(null);

    }

    public void m1(Child s) {
        System.out.println("  Child Class "+s);
    }

    public void m1(Parent o) {
        System.out.println("  Parent Class "+o);
    }

}
