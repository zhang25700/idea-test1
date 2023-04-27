package com.zzy;

import org.junit.Test;
import org.junit.Asset;

public class TestDemo{
	
	@Test
	public void test1(){
		ClsDemo c = new ClsDemo();
		String res = c.printStr("maven");
		Asset.assertEquals("hello maven", res);
	}
}