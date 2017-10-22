package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc_01 {
	
	@Test
	
	public static void startTest()
	{
	
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		
		driver.manage().window().maximize();
		
		
	}
	
	
	

}
