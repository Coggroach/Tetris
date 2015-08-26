package com.coggroach.testtris;

import org.junit.Assert;
import org.junit.Test;

public class TestAdding
{
	@Test
	public void adding()
	{
		int i = 14;
		int j = 16;
		
		int k = i + j;
		
		Assert.assertEquals(k, 30);		
	}
	
	@Test
	public void notAdding()
	{
		int i = 14;
		int j = 16;
		
		int k = i + j;
		
		Assert.assertNotEquals(k, 31);		
	}
}
