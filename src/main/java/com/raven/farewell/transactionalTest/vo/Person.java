package com.raven.farewell.transactionalTest.vo;

public class Person {
	public static String nick = "p";
	public String name = "person";

	static {
		System.out.println("load person");
	}

	public static void staticMethod() {
		System.out.println("person static method");
	}

	public String getName() {
		return name;
	}

	public void instantMethod() {
		staticMethod();
	}

}
