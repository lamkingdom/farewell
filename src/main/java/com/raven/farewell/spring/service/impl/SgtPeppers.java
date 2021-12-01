package com.raven.farewell.spring.service.impl;

import org.springframework.stereotype.Component;

import com.raven.farewell.spring.service.CompactDisc;

/**
 * @author invain
 */
@Component
public class SgtPeppers implements CompactDisc {
	private final String title = "farewell";
	private final String artist = "lam";

	@Override
	public void play() {
		System.out.println("Play " + title + " from " + artist);
	}
}
