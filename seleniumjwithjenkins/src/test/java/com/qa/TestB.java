package com.qa;



import static org.junit.Assert.assertEquals;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestB {

	@Test
	public void sum3() {
	int a = 51;
	int b = 6;
	
	Assert.assertEquals(57, a+b);
	
	}
	
	
	@Test
	public void sum4() {
	int a = 1;
	int b = 6;
	
	Assert.assertEquals(7, a+b);
	
	}
}
