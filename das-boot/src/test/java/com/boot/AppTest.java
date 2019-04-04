package com.boot;

import org.junit.Test;

import com.boot.controller.HomeController;

import junit.framework.TestCase;

public class AppTest extends TestCase {

	@Test
	public void testApp() {
		HomeController homeCotroller = new HomeController();
		String result = homeCotroller.home();
		assertEquals(result, "Das Boot, reporting for duty!");
	}
}
