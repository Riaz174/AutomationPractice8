package Capstone.AutomationPractice8;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository18\\AutomationPractice8\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement owindow = driver.findElement(By.id("openwindow"));
		owindow.click();
		Thread.sleep(3000);
		String currentwindohandle = driver.getWindowHandle();
		
		System.out.println(currentwindohandle);
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterators = windowHandles.iterator();
		String FirstWindowHandle = iterators.next();
		String SecondWindowHandle = iterators.next();
		System.out.println("First Window Handle : " + FirstWindowHandle);
		System.out.println("Second Window Handle : " + SecondWindowHandle);
		driver.switchTo().window(SecondWindowHandle);
		Thread.sleep(6000);
		WebElement contactbutton = driver.findElement(By.xpath("//*[text()='Contact']"));
		contactbutton.click();
		
		

	}

}
