package mavenproject1.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Test {
	
	@Test(dataProvider="getdata")
	public void setdata(String name,String Rnumber)
	{
		System.out.println("my name is :" +name);
		System.out.println("my roll number is:" +Rnumber);
	}

	@DataProvider(name="getdata")
	public Object[][] method()
	{
		Object[][] data= new Object[3][2];
		
		data[0][0] = "pradeep";
		data[0][1] = "227";
		
		data[1][0] = "amreen";
		data[1][1] = "228";
		
		data[2][0] = "ayesha";
		data[2][1] = "229";
		
		return data;
		
	}
	
}
