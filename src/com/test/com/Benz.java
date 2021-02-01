package com.test.com;

public class Benz implements InterfaceConcept, InterfaceConcept1 {

    @Override
    public String getModelNumber() {
        return "SUV";
    }

    @Override
    public int getWheels() {
        return WHEELS;
    }

    public int myMethod() {
        return 0;
    }

}