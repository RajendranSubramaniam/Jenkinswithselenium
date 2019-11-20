package com.qa;



import static org.junit.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestA {

	@Test
	public void sum1() {
	int a = 5;
	int b = 6;
	
	Assert.assertEquals(11, a+b);
	}
	
	@Test
	public void sum2() {
	int a = 9;
	int b = 6;
	
	Assert.assertEquals(15, a+b);
		}
	
	}

