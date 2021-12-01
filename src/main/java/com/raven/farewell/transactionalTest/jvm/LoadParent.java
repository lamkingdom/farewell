package com.raven.farewell.transactionalTest.jvm;

public class LoadParent {
	public static String age = "10";
	static {
		System.out.println("load class: LoadParent");
	}
}
