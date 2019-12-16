package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("This is my id");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgotten account")).click();
		
		System.out.println(driver.getTitle());//validate url title
		System.out.println(driver.getCurrentUrl());//validate if ur landed current url
		System.out.println(driver.getPageSource());//print page source
		driver.navigate().to("https://Google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();//close current browser
		driver.quit();//close all open browser
		
		
		/*Sample code for download explaining xpath text/siblings/parent
		package Tests;

		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;

		public class test {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		//
		

		}
		}

		Resources for this lecture
		Info.txt
		*/
		  
		 /* //using regular expression
		driver.get("http:rediff.com");
		driver.findElement(By.cssSelector("title='Already a user? Sign in'")).click();
		driver.findElement(By.xpath("//a[contains(@class,'signin')]")).click();

		 */
	}

}
