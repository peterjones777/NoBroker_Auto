package noBroker_TestCases;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test
public class DataPro {


	
		@DataProvider(name="bhk")
		public Object[][] dataset1(Method m)
		{
	Object[][] testcase=null;
	
	if(m.getName().equals("AssignBHK"))
	{
		testcase=new Object[][]
	{
		{3},{4}      /*1.1RK 2.1BK 3.2BHK 4.3BHK 5.4BHK 6.4+BHK*/
		
		};
	}
	else if(m.getName().equals("AssignStreet"))
	{
		testcase=new Object[][]
	{
			
			{3},{4} /*1.First suggestion 2.Second Suggestion 3.Third Suggestion
			          4.Fourth Suggestion 5.Fifth Suggestion*/
			          //***CAN USE ONLY 3 SUGGESTIONS AT ONCE***
			};
	}
	else if(m.getName().equals("SelectCity"))
	{
		testcase=new Object[][]
	{
		{1}/*1.Mumbai  2.Bangalore  3.Pune           4.Chennai 
		     5.Gurgaon 6.Hyderabad  7.Delhi          8.Noida 
		     9.Greater Noida       10.Ghaziabad     11.Faridabad*/
		     //***CAN USE ONLY 1 CITY AT ONCE***
		};
	}
	return testcase;
}}
