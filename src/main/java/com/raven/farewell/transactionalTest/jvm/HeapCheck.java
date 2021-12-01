package com.raven.farewell.transactionalTest.jvm;

import com.raven.farewell.transactionalTest.vo.Person;
import com.raven.farewell.transactionalTest.vo.User;

public class HeapCheck {
	public static void main(String[] args) throws InterruptedException {
		User user = new User();
		user.setName("aa");
		 String b = user.getName();
		 String a = b + "bb";
		a.intern();
		System.out.println(a == "aabb");
		String c = b + "bb";
		System.out.println(c == "aabb");
	}
}
