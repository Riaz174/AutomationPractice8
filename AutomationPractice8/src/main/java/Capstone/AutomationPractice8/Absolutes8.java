package Capstone.AutomationPractice8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutes8 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice8\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
//		WebElement searchboxField = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
//		searchboxField.sendKeys("Computer");
		WebElement emailField = driver.findElement(By.xpath("//input[@type='text']"));
		emailField.sendKeys("john@gmail.com");
		Thread.sleep(3000);
		WebElement pwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwordField.sendKeys("abcdef");
		Thread.sleep(3000);
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		Thread.sleep(6000);
		WebElement fgotpassword = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		fgotpassword.click();
		
		

	}

}
