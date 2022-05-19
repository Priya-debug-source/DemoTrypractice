package selenium;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//Classname objname = new Classname();
		//Interfacename Objname = new Classname();
		//WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("abcd");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("adfg");
		
		WebElement login = driver.findElement(By.name("login"));//it's called webelement
		login.click();
				

		//driver.findElement(By.id("email")).sendKeys("sdfgfg");
		//driver.findElement(By.id("pass")).sendKeys("abc");
		//driver.findElement(By.name("login")).click();

	}

}
