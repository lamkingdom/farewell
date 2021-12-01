package com.raven.farewell.transactionalTest.jvm;

import java.lang.ref.WeakReference;

import com.raven.farewell.transactionalTest.vo.Person;
import com.raven.farewell.transactionalTest.vo.User;

public class LoadTest extends LoadParent {
	public static final String name = "lam";

	static {
		System.out.println("load class: LoadTest");
	}

	public static void main(String[] args) {
		WeakReference<String> stringWeakReference = new WeakReference<>(new String("a"));
		System.out.println(stringWeakReference.get());
		System.gc();
		System.out.println(stringWeakReference.get());
	}
}
