package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) {
		
		
		//*[id='email']
		//Contains - input[id*='mai']
				//Starts-with - input[id^='emai']
				//ends with - input[id$='mail']

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abcds");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("a45s5sc");
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
