package com.text;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitPro {
	@Test
	public void test() {
//		fail("Not yet implemented");
		int op1=14;
		int op2=13;
		
		int expVal=op1 + op2;
		int actualVal=27;
		Assert.assertEquals(actualVal, expVal);
//		System.out.println("test");
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


}
