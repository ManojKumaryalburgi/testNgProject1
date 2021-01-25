package com.testngproject.scripts;

import org.testng.annotations.Test;

import com.testngproject.Commonutils.BaseClass;

public class Test5 extends BaseClass
{
	@Test(groups = "smoke")
	public void aatest()
	{
		System.out.println("anoj");
	}
	@Test(groups ="smoke" )
	public void abtest()
	{
		System.out.println("aacnoj");
	}


}
