package com.testngproject.scripts;

import org.testng.annotations.Test;

import com.testngproject.Commonutils.BaseClass;

public class Test1 extends BaseClass
{
	@Test(groups = "smoke")
	public void atest()
	{
		System.out.println("abbbb");
	}
	@Test(groups ="smoke" )
	public void aatest()
	{
		System.out.println("aacccc");
	}


}
