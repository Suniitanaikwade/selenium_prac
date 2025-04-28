package AutomationDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class HomePage {

	public static void main(String[] args) throws InterruptedException {
	
		// String gender="male";
		
System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Automation_tools\\Driver_ChromeWebdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();       // maximize the window
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Wait command
driver.manage().deleteAllCookies(); // delete all cookies
driver.get("https://demo.automationtesting.in/Register.html");

// driver.navigate().to("https://demo.automationtesting.in/Register.html"); alternative to launch/get on the Webpage
WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
firstname.click();
firstname.sendKeys("Suniita");

WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
lastname.click();
lastname.sendKeys("Naikwade");

WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
address.click();
address.sendKeys("803 c wing");

WebElement emailaddress=driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
emailaddress.click();
emailaddress.sendKeys("suniitanaikwade@gmail.com");

WebElement phonenumber=driver.findElement(By.xpath("//input[@ng-model='Phone']"));
phonenumber.click();
phonenumber.sendKeys("9830675467");

WebElement genderM=driver.findElement(By.xpath("//input[@value='Male']"));
genderM.click();

		/*
		 * WebElement genderF=driver.findElement(By.xpath("//input[@value='FeMale']"));
		 * genderF.click();
		 */
/*
 if (gender.equals("male")) {
	WebElement genderM=driver.findElement(By.xpath("//input[@value='Male']"));
	genderM.click();
}
else{
	WebElement genderF=driver.findElement(By.xpath("//input[@value='FeMale']"));                                                      
	genderF.click();
} **/

WebElement cricket=driver.findElement(By.id("checkbox1"));
cricket.click();                                                                                                                                                                                                                                                                                                                                         

WebElement movies=driver.findElement(By.id("checkbox2"));
movies.click();                                                 

WebElement hockey=driver.findElement(By.id("checkbox3"));
hockey.click();

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,300)");

WebElement language=driver.findElement(By.id("msdd"));
language.click();
WebElement arabic=driver.findElement(By.xpath("//a[.='Arabic']"));
arabic.click();
WebElement skills=driver.findElement(By.id("Skills"));
// skills.click();
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(skills);
s.selectByValue("Adobe InDesign");





	}
}
