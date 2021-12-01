package com.raven.farewell.transactionalTest.vo;

public class User extends Person {
	private Integer id;
	public String name = "user";
	public static String test = "user";

	static {
		System.out.println("load user");
	}
//	public static String nick = "u";

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

	public static void staticMethod() {
		System.out.println("user static method");
	}

	@Override
	public void instantMethod() {
		staticMethod();
	}
}
