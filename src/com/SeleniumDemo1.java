package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriver driver=new FirefoxDriver();

		driver.get("file:///F:/Selenium%20Software/Offline%20Website/Offline%20Website/index.html");
		
		// By css selector
		/*driver.findElement(By.linkText("Register a new membership")).click();
		//Thread.sleep(200);
		// driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("qwerty");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"email_error\"]")).getText());*/
		
		driver.findElement(By.cssSelector("#email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.cssSelector("#form > div.row > div > button")).click();
		
		//Check User_Url
		driver.findElement(By.xpath("//*[@href=\"users.html\"]")).click();
		Thread.sleep(2000);
		
		//Click User button and fill data
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary btn-sm pull-right']")).click();
		Thread.sleep(2000);
		
		//static select dropdown
		Select s=new Select(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select")));
		s.selectByVisibleText("Maharashtra");
		s.selectByValue("3");
		s.selectByIndex(4);
		
		//driver.close();
		// driver.quit();

	}

}
