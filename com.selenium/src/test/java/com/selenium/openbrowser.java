package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class openbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.worktual.co.uk/");
		d.manage().window().maximize();
//		Thread.sleep(3000);
//		d.close();
		d.findElement(By.linkText("Pricing")).click();
		Thread.sleep(3000);
		d.findElement(By.linkText("AI Contact Centre")).click();
//		Actions actions = new Actions(d);
//		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
d.findElement(By.xpath("//div[@class='pricingHome_plansection__3oh_0 pricingHome_plansectioncontactcenter__1ozXD']//div[3]//div[1]//div[2]//a[1]")).click();
Thread.sleep(3000);
d.findElement(By.xpath("//input[@id='fname']")).sendKeys("Automation",Keys.TAB,"testing",Keys.TAB,"kishor@gmail.com",Keys.TAB,"787878787878",Keys.TAB,"Vectone",Keys.TAB,Keys.ENTER);
d.findElement(By.xpath("//div[contains(text(),'6-10')]")).click();
d.findElement(By.xpath("//input[@id='website']")).sendKeys("www.sss.com",Keys.TAB);
Thread.sleep(3000);
//WebElement dropdown = d.findElement(By.xpath("//input[@id='rc_select_0']"));
//Select select = new Select(dropdown);
//select.selectByIndex(2);

		
		
	}

}
