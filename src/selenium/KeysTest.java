package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=fpctx&.intl=ca&.lang=en-CA&.done=https://ca.yahoo.com");

		driver.findElement(By.id("login-username")).sendKeys("test45");
		driver.findElement(By.id("login-username")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("login-passwd")).sendKeys("dfdf");
		driver.findElement(By.id("login-passwd")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		
		String expectedErr = "Invalid password. Please try again";
		String actualErr=driver.findElement(By.className("error-msg")).getText();
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("test pass");
		}else {
			System.out.println("test fail");
		}
		
		

	}

}
