package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ChromeBrower {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Automation_tools\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); /// Webdriver - interface, Chromdriver - Class
      driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox")); // Webelement - Interface
		
		Alert art = driver.switchTo().alert();
			art.accept();
			Actions ac=new Actions(driver);
			ac.clickAndHold().release().perform();
			ac.doubleClick(searchbox).build().perform();
		
	
//		WebDriverWait wait= new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.elementSelectionStateToBe(locator, selected))
		searchbox.click();
		
		searchbox.sendKeys("Women Shoes");
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
	
		
		String CurrentURL = driver.getCurrentUrl();
	System.out.println(CurrentURL);
	
	String GetTitle = driver.getTitle();
	System.out.println(GetTitle);

	
		// driver.close();
		
	
	}

}
