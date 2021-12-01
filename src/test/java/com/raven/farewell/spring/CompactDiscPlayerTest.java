package com.raven.farewell.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.raven.farewell.spring.config.CompactDiscConfig;
import com.raven.farewell.spring.service.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CompactDiscConfig.class)
public class CompactDiscPlayerTest {

	@Autowired
	private CompactDisc compactDisc;

	@Test
	public void cdShouldNotBeNull() {
		assert compactDisc != null;
	}
}
