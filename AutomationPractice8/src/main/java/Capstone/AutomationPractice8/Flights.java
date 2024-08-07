package Capstone.AutomationPractice8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flights {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice8\\src\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement flightbutton = driver.findElement(By.xpath("//*[text()='Flights']"));
		flightbutton.click();
		Thread.sleep(6000);
		WebElement datebutton = driver.findElement(By.name("EGDSDateRange-date-selector-trigger"));
		datebutton.click();
		Thread.sleep(3000);
		WebElement departbutton = driver.findElement(By.xpath("//*[@aria-label='Friday, August 30, 2024']"));
		Actions action = new Actions(driver);//Actions class object used because it is iframe.
		action.moveToElement(departbutton).click().build().perform();
		
		

	}

}
