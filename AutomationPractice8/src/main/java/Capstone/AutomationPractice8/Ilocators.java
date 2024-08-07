package Capstone.AutomationPractice8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice8\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		Thread.sleep(3000);
		WebElement bestsellerbutton = driver.findElement(By.linkText("Best Sellers"));
		bestsellerbutton.click();
		Thread.sleep(3000);
		WebElement medicalcarebutton = driver.findElement(By.partialLinkText("Medical"));
		medicalcarebutton.click();
		Thread.sleep(3000);
		WebElement searchfield = driver.findElement(By.name("field-keywords"));
		searchfield.sendKeys("Computer");
		
		

	}

}
