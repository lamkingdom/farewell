package com.raven.farewell;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.raven.farewell.transactionalTest.service.FirstService;
import com.raven.farewell.transactionalTest.service.OuterService;

@SpringBootTest
class FarewellApplicationTests {
	@Resource
	private OuterService outerService;
	@Resource
	private FirstService firstService;

	@Test
	void contextLoads() {
		firstService.saveUserInfo();
	}

}
