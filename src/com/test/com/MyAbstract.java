package com.test.com;

public abstract class MyAbstract {

    public static final int WHEELS = 4;
    String country;


    MyAbstract(){

    }

    /*
     * Abstract class can have both concrete (fully defined methods) and non concrete methods(abstract methods or non defined methods)
     *
     * */

    abstract String getModelNumber();
    abstract int getWheels();

    String myName() {
        return "JAVA";
    }

}
