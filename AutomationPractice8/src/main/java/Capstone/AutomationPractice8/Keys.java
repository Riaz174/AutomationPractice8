package Capstone.AutomationPractice8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository18\\AutomationPractice8\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement searchbx = driver.findElement(By.id("twotabsearchtextbox"));
		searchbx.sendKeys("Computer");
		Actions action = new Actions(driver);
		action.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("a").keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
		action.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("c").keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();
		Thread.sleep(6000);
		searchbx.clear();
		Thread.sleep(6000);
		searchbx.click();
		Thread.sleep(3000);
		action.keyDown(org.openqa.selenium.Keys.CONTROL).sendKeys("v").keyUp(org.openqa.selenium.Keys.CONTROL).build().perform();

	}

}
