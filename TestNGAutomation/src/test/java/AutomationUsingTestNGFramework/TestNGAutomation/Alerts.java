package AutomationUsingTestNGFramework.TestNGAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alerts {

	@Test
	public void alertpage1() throws Throwable {
		String url = "https://demo.automationtesting.in/Alerts.html";

		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\Automation_tools\\Driver_ChromeWebdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(url);

		WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alert1.click();

		driver.switchTo().alert().accept();
		
		Thread.sleep(1000);

		/*
		 * //create Object of Alert
		 * 
		 * Alert al= driver.switchTo().alert(); al.accept();
		 * 
		 */
		WebElement alertbutton = driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']"));
		alertbutton.click();

		WebElement alert2 = driver.findElement(By.xpath("//button[.='click the button to display a confirm box ']"));
		alert2.click();
		
		Thread.sleep(1000);
// to click on Calcel button needs to perform dismiss operation on pop message
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(1000);

		WebElement alertTextbox=driver.findElement(By.xpath("//a[.='Alert with Textbox ']"));
		
		// create object for explicity wait
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(alertTextbox));
		
		alertTextbox.click();
		
		WebElement alert3=driver.findElement(By.xpath("//button[.='click the button to demonstrate the prompt box ']"));
		alert3.click();
				
		driver.switchTo().alert().sendKeys("Alert windows to be handled");
		
		// driver.switchTo().alert().accept();
		
		
	}

}
