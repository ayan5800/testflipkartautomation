package com.automate;
import static org.testng.Assert.assertTrue;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Automate {
	
	@Test
	public void Test1() throws InterruptedException
	{
		HashMap<Integer,String>Month=new HashMap<>(); 
		Month.put(1,"January");
		Month.put(2,"February");
		Month.put(3,"March");
		Month.put(4,"April");
		Month.put(5,"May");
		Month.put(6,"June");
		Month.put(7,"July");
		Month.put(8,"August");
		Month.put(9,"September");
		Month.put(10,"October");
		Month.put(11,"November");
		Month.put(12,"December");
		
		String input_day="15";
		int input_month=12;
		String input_year="2025";
		
		System.out.print(input_year);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(20);
		
		//driver.navigate().to()
		driver.findElement(By.className("commonModal__close")).click();
		//assertTrue(driver.getTitle().equalsIgnoreCase("Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"),"value does not match");
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		Thread.sleep(20);
		boolean f=true;
		
		while(f)
		{
			String text=driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Caption']")).getText();
			String[] arr=text.split("\\s+");
			Thread.sleep(20);
			if(arr[0].equalsIgnoreCase(Month.get(input_month))&&arr[1].equalsIgnoreCase(input_year))
			{
				System.out.print("helo dosto");
				Thread.sleep(20);
				driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div[@class='DayPicker-Day']/div/p[text()='"+input_day+"']")).click();
				f=false;
			}
			try {
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();		
			}catch(Exception e){
				driver.findElement(By.xpath("//div[@class='DayPicker-Month'][2]/div[@class='DayPicker-Body']/div[@class='DayPicker-Week']/div[@class='DayPicker-Day']/div/p[text()='"+input_day+"']")).click();	
				System.out.print("last month is selected");
			}
		}
		
	//	System.out.print(text);
		
		
	}
}
