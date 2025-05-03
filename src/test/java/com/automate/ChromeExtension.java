package com.automate;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeExtension {
	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("debuggerAddress", "localhost:8080");
		WebDriver driver=new ChromeDriver(opt);
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		Thread.sleep(15);
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
	}
}
