package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FromKilometerToMeter {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.FromKilometerToMeter(500);
		assertEquals(5, output);
	}

}
