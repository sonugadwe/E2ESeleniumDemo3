package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SeleniumDemo3 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/Default.aspx");
		
		// radio button and select depart and arrival date
		/*it is not working
		 *System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());*/

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Its Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}

		

		// for dynamic dropdown
		/*
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click(); Actions
		 * action=new Actions(driver); action.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"dropdownGroup1\"]/div/ul[4]/li[1]/a"))).click().build().perform();
		 * 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]")).click();
		 * action.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[8]/a"))).click().build().perform();
		 * 
		 * //parent child relationship
		 * driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[7]/a"))
		 * .click(); driver.findElement(By.
		 * xpath("//*[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"] //*[@id=\"dropdownGroup1\"]/div/ul[1]/li[7]/a"
		 * )).click(); //Autosuggestive dropdown concept is miising
		 */

		/*
		 * driver.findElement(By.id("divpaxinfo")).click(); Select s = new
		 * Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		 * s.selectByValue("2");
		 */

		// for current date in calender
		driver.findElement(By.cssSelector("ui-state-default.ui-state-highlight.ui-state-active")).click();

		// checkbox
		System.out.println(
			driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
		System.out.println(
				driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());

		// count the checkbox of screen
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		/*
		 * // using assertion Assert.assertFalse(driver.findElement(By.xpath(
		 * "//*[@id=\\\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).click();
		 * Assert.assertTrue(driver.findElement(By.xpath(
		 * "//*[@id=\"ctl00_mainContent_chk_friendsandfamily\"]")).isSelected());
		 */
		
		/*driver.get("http://spicejet.com"); //URL in the browser

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

		System.out.println("its disabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		driver.findElement(By.id("divpaxinfo")).click();

		   Thread.sleep(2000L);

		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		driver.findElement(By.cssSelector("input[value='Search']")).click();

		// driver.findElement(By.xpath("//input[@value='Search']")).click();

		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

		}



		}*/



	

	}
}