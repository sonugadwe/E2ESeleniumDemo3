package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SeleniumDemo {
	public static void main(String[] args) throws Exception {
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// WebDriver driver=new ChromeDriver();

		WebDriver driver = new FirefoxDriver();
		// open website
		driver.get("file:///F:/Selenium%20Software/Offline%20Website/Offline%20Website/index.html");
		System.out.println(driver.getCurrentUrl());
		String s = driver.findElement(By.xpath("html/body/div[1]/div[1]/a/b")).getText();
		System.out.println(s);
		String s1 = driver.findElement(By.xpath("html/body/div/div[1]/a/h4")).getText();
		System.out.println(s1);
		String s2 = driver.findElement(By.xpath("html/body/div[1]/div[2]/p")).getText();
		System.out.println(s2);

		WebElement email = driver.findElement(By.xpath(".//*[@id='email']"));
		email.clear();
		email.sendKeys("kiran@gmail.com");

		WebElement pass = driver.findElement(By.xpath(".//*[@id='password']"));
		pass.clear();
		pass.sendKeys("123456");

		WebElement submit = driver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
		submit.click();

		/*
		 * //for new registration WebElement
		 * newReg=driver.findElement(By.xpath("/html/body/div/div[2]/a"));
		 * newReg.click();
		 * 
		 * String name=driver.findElement(By.xpath("//*[@id=\"name\"]")).getText();
		 * System.out.println(name);
		 * 
		 * String mobile=driver.findElement(By.xpath("//*[@id=\"mobile\"]")).getText();
		 * System.out.println(mobile);
		 * 
		 * String email1=driver.findElement(By.xpath("//*[@id=\"email\"]")).getText();
		 * System.out.println(email1);
		 * 
		 * String pass1=driver.findElement(By.xpath("//*[@id=\"password\"]")).getText();
		 * System.out.println(pass1);
		 * 
		 * WebElement
		 * signin=driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button"));
		 * signin.click();
		 */

		String kiran = driver.findElement(By.xpath("html/body/div[1]/aside/section/div/div[2]/p")).getText();
		System.out.println(kiran);

		String online = driver.findElement(By.xpath("html/body/div[1]/aside/section/div/div[2]/a")).getText();
		System.out.println(online);

		String dashboard = driver.findElement(By.xpath("html/body/div[1]/aside/section/ul/li[2]/a/span")).getText();
		System.out.println(dashboard);

		WebElement users = driver.findElement(By.xpath("html/body/div[1]/aside/section/ul/li[3]/a/span"));
		users.click();

		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j <= 6; j++) {
				WebElement tabledata = driver
						.findElement(By.xpath("  html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["
								+ i + "]/td[" + j + "]"));
				System.out.print(" " + tabledata.getText());
			}
			System.out.println();
		}

		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		al.accept();

		//Add User Details
		WebElement AddUser = driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
		AddUser.click();

		String Fill_details = driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div/h3"))
				.getText();
		System.out.println(Fill_details);

		String userName_Text = driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[1]/label\r\n" + ""))
				.getText();
		System.out.println(userName_Text);
		
		WebElement userName_fill = driver.findElement(By.xpath(".//*[@id='username']"));
		userName_fill.clear();
		userName_fill.sendKeys("sonu");

		String moBile_Text = driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[2]/label")).getText();
		System.out.println(moBile_Text);
		
		WebElement moBile_fill = driver.findElement(By.xpath(".//*[@id='mobile']"));
		moBile_fill.clear();
		moBile_fill.sendKeys("123456789");

		WebElement submit_but = driver.findElement(By.xpath(".//*[@id='submit']"));
		submit_but.click();

		String operators = driver.findElement(By.xpath("html/body/div[1]/aside/section/ul/li[4]/a/span")).getText();
		System.out.println(operators);

		WebElement logout = driver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[7]/a/span"));
		logout.click();

	}
}
