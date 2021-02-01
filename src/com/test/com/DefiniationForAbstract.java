package com.test.com;

public class DefiniationForAbstract extends MyAbstract{


    /*
     *
     * Interface
     * by default all declared variables are public static final
     * by default all methods are public abstract
     * cannot create object because there is no constructor
     * Interface should implements classes
     *
     *
     * Abstract
     * can have static, instance, final variables.
     * can have both abstract and non abstract methods.
     * cannot create object though it has constructor because it still have non concrete methods
     * Abstract class extends classes
     *
     *
     * */

    public static void main(String[] args) {
        DefiniationForAbstract dfa = new DefiniationForAbstract();
        System.out.println(dfa.myName());
        System.out.println(WHEELS);
        System.out.println(dfa.country);
        System.out.println(dfa.getModelNumber());
        System.out.println(dfa.getWheels());
    }

    @Override
    String getModelNumber() {
        return "SUV";
    }

    @Override
    int getWheels() {
        return 4;
    }

}
