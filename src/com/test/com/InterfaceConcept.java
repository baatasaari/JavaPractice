package com.test.com;

public interface InterfaceConcept {
	/*
	 * variables
	 * by default declared variable is public static final variable.
	 * As all variables by default static hence there is no concept of instance variables.
	 * when there is not instance variables then there is no need of constructors( is used to instantiate the identifiers)
	 * when there is no constructor then there is no concept of object creations.
	 */

	public static final int WHEELS = 4;
	String COUNTRY = "UK";

	/*
	 * methods
	 * by default all methods are public abstract
	 *
	 * */

	String getModelNumber();
	int getWheels();

}
