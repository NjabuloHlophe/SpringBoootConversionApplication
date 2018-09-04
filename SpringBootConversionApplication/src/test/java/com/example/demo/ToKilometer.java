package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToKilometer {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.toKilometer(10000);
		assertEquals("testing meter to kilometer",10,output,0);
	}

}
