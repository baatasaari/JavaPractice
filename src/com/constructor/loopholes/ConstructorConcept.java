package com.constructor.loopholes;

public class ConstructorConcept {

    String name;
    int rollNo;

    ConstructorConcept(){
        System.out.println("  Default ConstructorConcept ");
    }

    ConstructorConcept(String name){
        System.out.println("  Default ConstructorConcept ");
        this.name = name;
    }

    ConstructorConcept(String name, int rollNo){
        System.out.println("  Param ConstructorConcept ");
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        ConstructorConcept cc = new ConstructorConcept();
        System.out.println(cc.name);
        System.out.println(cc.rollNo);

        ConstructorConcept ccParam = new ConstructorConcept("JAVA Class", 11);
        System.out.println(ccParam.name);
        System.out.println(ccParam.rollNo);
    }

}
