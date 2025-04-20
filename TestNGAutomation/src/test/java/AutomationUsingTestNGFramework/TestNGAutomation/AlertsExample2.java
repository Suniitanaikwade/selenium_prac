package AutomationUsingTestNGFramework.TestNGAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample2 {
	
	public void Alerts2() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Automation_tools\\Driver_ChromeWebdriver\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		
	}

}
