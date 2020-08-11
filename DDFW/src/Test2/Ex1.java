package Test2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Ex1 
{
   
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rashmitha\\Desktop\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.telugumatrimony.com/#");
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		driver.findElement(By.id("open_loginpp")).click();
		
		
	wait.until(ExpectedConditions.alertIsPresent());
		
	Alert	a = driver.switchTo().alert();
		a.accept();
		
		
		
	}
	
  	
	
	
}
