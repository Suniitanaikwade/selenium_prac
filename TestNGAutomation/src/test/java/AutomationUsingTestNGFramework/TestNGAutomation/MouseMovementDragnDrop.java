package AutomationUsingTestNGFramework.TestNGAutomation;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseMovementDragnDrop {
	
	WebDriver driver;
	Actions ac;
	
	@BeforeSuite
	public void openbrowser() {
		System.out.println("before Suite");
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\Automation_tools\\Driver_ChromeWebdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	@BeforeTest
	public void openurl() {
		System.out.println("Before test");
		String URL="https://vinothqaacademy.com/mouse-event/";
		driver.get(URL);
	}

	@BeforeClass
	public void maximizeWindow() {
		System.out.println("Before Class");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void cookiesandTimeout() {
		System.out.println("Before Method");
		driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}
	
	@Test(priority = 1)
	public void dragnDrop() {
		System.out.println("@Test");
		WebElement dragme=driver.findElement(By.id("draggableElement"));
		WebElement drop= driver.findElement(By.id("droppableElement"));
		Actions ac= new Actions(driver);  // you can declare object globally to call multiple times
		ac.dragAndDrop(dragme, drop).build().perform();
		System.out.println("drag and drop");
	}
	
	@Test(priority = -3)
	
	public void mouseMovement() throws Throwable {
		WebElement mouseovertextbox = driver.findElement(By.id("textbox"));
		ac= new Actions(driver);
        ac.moveToElement(mouseovertextbox).click().build().perform();
        Thread.sleep(3000);
		System.out.println("mouse movement text box");
	}
	
	@Test(enabled = false)
	public void mouseactionDoubleClick() throws Throwable {
		WebElement doubleClick = driver.findElement(By.id("dblclick"));
		ac= new Actions(driver);
		ac.doubleClick(doubleClick).build().perform();
		Thread.sleep(3000);
		System.out.println("mouse double click");
	
	}
	@Test (priority = 0)
	public void mouseRightClick() throws Throwable {
		WebElement rightClick = driver.findElement(By.id("rightclick"));
		ac= new Actions(driver);
		ac.contextClick(rightClick).build().perform();
		Thread.sleep(3000);
		System.out.println("mouse right click context");
	}
	
	@Test(dependsOnMethods = "mouseRightClick")
	public void m1() {
		System.out.println("m1");
	}
	
	
@AfterMethod
public void screenshot() throws Throwable {
	System.out.println("After Method");
	File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("D:\\Automation\\screenshot\\DummySS.jpg"));
}

@AfterClass
public void deleteCookies() {
	System.out.println("After Class");
	driver.manage().deleteAllCookies();
}

@AfterTest
public void closeDatabase() {
	System.out.println("After Test");
	System.out.println("This is required for database connection and required DB actions");
}

@AfterSuite
public void closebrowser() {
	System.out.println("After suite");
	//driver.close();
}
}
