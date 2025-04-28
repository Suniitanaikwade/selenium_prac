package AutomationUsingTestNGFramework.TestNGAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertsExample2 {
	
	@Test
	public void Alerts2() throws Throwable {
		
		String URL="https://demoqa.com/alerts";
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\Automation_tools\\Driver_ChromeWebdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
		
		/*
		 * WebElement clickbuttontoseealerttext=
		 * driver.findElement(By.xpath("https://demoqa.com/alerts"));
		 * clickbuttontoseealerttext.getText();
		 * 
		 * 		 */
		/*
		 * JavascriptExecutor js=(JavascriptExecutor) driver;
		 * js.executeScript("window.scrollby(0,300)", "");
		 */
		
		
	WebElement clickmebutton=driver.findElement(By.id("alertButton"));
		
		// Explicity wait with 20 seconds
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(clickmebutton));
		clickmebutton.sendKeys(Keys.PAGE_DOWN);
		clickmebutton.click();
		
		driver.switchTo().alert().accept();
		
	
		WebElement onbuttonclickalert1 = driver.findElement(By.id("timerAlertButton"));
		onbuttonclickalert1.click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.elementToBeSelected(onbuttonclickalert1);
		 */
		
		WebElement onbuttonclickalert2 =driver.findElement(By.id("confirmButton"));
		onbuttonclickalert2.click();
		
		String c="confirm box appeared";
		System.out.println(c);
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().dismiss();
		
		WebElement onbuttonclickalert3 = driver.findElement(By.id("promtButton"));
		onbuttonclickalert3.click();
		
		String p="prompt box will appear";
		System.out.println(p);
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().sendKeys("suniita");
		
		String msg="you entered as suniita";
		System.out.println(msg);
		
	}

}
