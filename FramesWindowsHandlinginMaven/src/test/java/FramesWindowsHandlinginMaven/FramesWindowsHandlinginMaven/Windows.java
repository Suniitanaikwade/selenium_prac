package FramesWindowsHandlinginMaven.FramesWindowsHandlinginMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws Throwable {

		String url = "https://demo.automationtesting.in/Windows.html";
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation\\Automation_tools\\Driver_ChromeWebdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// Windows window=new Windows();
		// window.openNewtabbedWindows();

		WebElement openNewWindow = driver.findElement(By.xpath("//a[.='Open New Tabbed Windows ']"));
		openNewWindow.click();

		WebElement click1 = driver.findElement(By.xpath("//button[.='    click   ']"));
		click1.click();

		Thread.sleep(4000);
		// switch from child window to parent window
		driver.switchTo().window("Frames & Windows");
		Thread.sleep(4000);
		//driver.switchTo().defaultContent();
		WebElement openNewSeperateWindow = driver.findElement(By.xpath("//a [@href= '#Seperate']"));
		
		openNewSeperateWindow.click();
		Thread.sleep(4000);
		WebElement click2 = driver.findElement(By.xpath("//button[.='click']"));
		click2.click();
		Thread.sleep(4000);
		driver.switchTo().window("Frames & Windows");
		
	}

}
