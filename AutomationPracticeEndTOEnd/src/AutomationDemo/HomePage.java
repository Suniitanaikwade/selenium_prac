package AutomationDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HomePage {

	public static void main(String[] args) throws InterruptedException {
	
		// String gender="male";
		
System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Automation_tools\\Driver_ChromeWebdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();       // maximize the window
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Wait command
driver.manage().deleteAllCookies(); // delete all cookies
driver.get("https://demo.automationtesting.in/Register.html");

// driver.navigate().to("https://demo.automationtesting.in/Register.html"); alternative to launch/get on the Web page

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
WebElement arabic=driver.findElement(By.xpath("//a[.='Arabic']"));   //Relative xpath //tagname[.='Value']
arabic.click();
WebElement skills=driver.findElement(By.id("Skills"));
// skills.click();
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(skills);
s.selectByValue("Adobe InDesign");

WebElement country=driver.findElement(By.id("countries"));
country.click();

WebElement selectCountry=driver.findElement(By.id("country"));
Select sc= new Select(selectCountry);
sc.selectByValue("India");

WebElement year=driver.findElement(By.id("yearbox"));
Select y=new Select(year);
y.selectByVisibleText("1990");

WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
Select m=new Select(month);
m.selectByVisibleText("October");

WebElement date=driver.findElement(By.xpath("//select[@placeholder='Day']"));
Select d=new Select(date);
d.selectByValue("26");

WebElement password=driver.findElement(By.xpath("//input[@ng-model='Password']"));
password.click();
password.sendKeys("1234");

WebElement confirmPassword=driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
confirmPassword.click();
confirmPassword.sendKeys("1234");

WebElement submit=driver.findElement(By.id("submitbtn"));
submit.click();

WebElement refreshbutton=driver.findElement(By.xpath("//button[.='Refresh']"));
refreshbutton.click();

System.out.println("test Execution Completed");
	}
}
