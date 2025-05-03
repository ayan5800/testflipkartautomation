package com.automate;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShoot {

	
	@Test
	public void run() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ayan79@.gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.id("u_0_5_Cx")).click();
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source=ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./screenshot/Screen.png"));
		System.out.println("Screenshot is captured");
	}
}
