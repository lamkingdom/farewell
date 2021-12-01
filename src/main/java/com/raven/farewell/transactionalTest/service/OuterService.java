package com.raven.farewell.transactionalTest.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OuterService {

	@Resource
	private FirstService firstService;

	@Transactional
	public void outer() {
		firstService.saveUserInfo();
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
