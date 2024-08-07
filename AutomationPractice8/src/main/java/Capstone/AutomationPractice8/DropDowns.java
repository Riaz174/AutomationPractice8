package Capstone.AutomationPractice8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice8\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement cnewaccount = driver.findElement(By.xpath("//*[contains(text(),'Create new account')]"));
		cnewaccount.click();
		Thread.sleep(6000);
		WebElement birthmonth = driver.findElement(By.name("birthday_month"));
		Select ob = new Select(birthmonth);
		ob.selectByIndex(10);
		Thread.sleep(6000);
		WebElement birthday = driver.findElement(By.name("birthday_day"));
		Select od = new Select(birthday);
		od.selectByValue("15");
		Thread.sleep(3000);
		WebElement birthyear = driver.findElement(By.id("year"));
		Select oy = new Select(birthyear);
		oy.selectByVisibleText("2020");
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		gender.click();
		
		

	}

}
