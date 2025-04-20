package AutomationDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EdgeEStoreApplication {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.edge.driver",
				"D:\\Automation\\Automation_tools\\Driver_edgewebDriver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");

		// alternate way to locate the element of UI

		// String usernamelocator= "//input[@placeholder='Username']";
		// WebElement username=driver.findElement(By.xpath(usernamelocator));

		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.click();
		username.sendKeys("standard_user");

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.click();
		password.sendKeys("secret_sauce");

		WebElement loginbutton = driver.findElement(By.id("login-button"));
		loginbutton.click();

		WebElement dropdown = driver.findElement(By.xpath("//select[@data-test='product-sort-container']"));
		Select dr = new Select(dropdown);
		dr.selectByValue("lohi");

		WebElement addtocart = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		addtocart.click();

		WebElement addtocartlink = driver.findElement(By.xpath("//a[.='1']"));
		addtocartlink.click();

		// how to verify the amount from cart post adding the produts

		WebElement amount = driver.findElement(By.xpath("//div[@data-test='inventory-item-price']"));
		String a = amount.getText();
		System.out.println(a);

		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();

		// check with all the validation on Check out page

		WebElement continuecheckoutinfopage = driver.findElement(By.id("continue"));
		continuecheckoutinfopage.click();

		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.click();
		firstname.sendKeys("Su434");

		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.click();
		lastname.sendKeys("Naik34");

		WebElement zipcode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
		zipcode.click();
		zipcode.sendKeys("343456");

		continuecheckoutinfopage.click();

		// verify the product price on checkout page
		WebElement price = driver.findElement(By.xpath("//div[@data-test='inventory-item-price']"));
		String p = price.getText();
		System.out.println(p);

		boolean pricedifference = a.equals(p);
		System.out.println("both the price are matching" + pricedifference);

		WebElement finishcheckoutpage = driver.findElement(By.name("finish"));
		finishcheckoutpage.click();

		WebElement checkoutcompletepage = driver.findElement(By.xpath("//h2[@data-test='complete-header']"));
		String ch = checkoutcompletepage.getText();
		System.out.println(ch);

		WebElement checkouttext = driver.findElement(By.xpath("//div[@data-test='complete-text']"));
		String ct = checkouttext.getText();
		System.out.println(ct);

		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);

		String gettitle = driver.getTitle();
		System.out.println(gettitle);

		System.out.println("Success");

		// how to take a screenshot
		File screenshotLocation = new File("D:\\Automation\\screenshot\\EdgeEstoreapp1.png");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, screenshotLocation);

		// FileUtils.copyFile(src,new File("D:\\Automation\\screenshot"));

	}

}
