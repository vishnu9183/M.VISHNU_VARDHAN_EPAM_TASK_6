package com.code.EpamCustomCollectionList;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.*;

public class TestCollectionCustomList 
{
	public void test() 
	{
		CollectionCustomList c=new CollectionCustomList();
		int answer=c.Adding("10");
		c.Adding("20");
		assertEquals(1, answer,0.1);
		assertTrue( true );
	}
}