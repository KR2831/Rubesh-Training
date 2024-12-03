package org.pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shiva\\eclipse-workspace\\Rubesh\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lh.inmakesedu.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Actions a = new Actions(driver);
		
		WebElement courses = driver.findElement(By.id("navbarDropdown"));
	
        a.moveToElement(courses).perform();
        
        WebElement SFT = driver.findElement(By.xpath("(//div[@class='dropdown dropright p-0 m-0'])[10]"));
	
        a.moveToElement(SFT).perform();
        
        WebElement stMaster = driver.findElement(By.xpath("//a[text()='ST Master Class']"));
        stMaster.click();
	}
	

}
