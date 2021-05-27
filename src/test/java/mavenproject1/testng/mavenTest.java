package mavenproject1.testng;

import org.testng.annotations.Test;

public class mavenTest {
	
	
	@Test(priority=7)
	public void Test1()
	{
		System.out.println("1st test");
		}
	
	@Test(priority=6)
	public void Test2()
	{
		System.out.println("2nd test");
	}
	
	@Test(priority=5)
	public void Test3()
	{
		System.out.println("3rd test");
	}
    
	@Test(priority=4)
	public void Test4()
	{
		System.out.println("4th test");
	}
	
	@Test(priority=3)
	public void Test5()
	{
		System.out.println("5rd test");
	}

	@Test(priority=2)
	public void Test6()
	{
		System.out.println("6nd test");
	}
	
	@Test(priority=1)
	public void Test7()
	{
		System.out.println("7rd test");
	}


}
