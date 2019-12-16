package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2ESeleniumDemo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/Default.aspx");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[9]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //*[@id=\"dropdownGroup1\"]/div/ul[1]/li[7]/a"))
				.click();

		// for current date in calender
		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date1")).click();
		driver.findElement(By.cssSelector(
				"#ui-datepicker-div > div.ui-datepicker-group.ui-datepicker-group-first > table > tbody > tr:nth-child(2) > td.ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today > a")).click();
		Thread.sleep(1000);
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Its Disabled");
			Assert.assertTrue(true);
		} else {

			Assert.assertTrue(false);
		}

		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();

		
		driver.findElement(By.id("divpaxinfo")).click();
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adult.selectByValue("2");
		Select child = new Select(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_Child")));
		child.selectByIndex(3);
		Select infant = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Infant\"]")));
		infant.selectByValue("1");

		Select inr = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		inr.selectByIndex(3);

		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		
	}

}
