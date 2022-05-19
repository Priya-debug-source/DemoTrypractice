package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) throws IOException {
		
		
		//"C:\Program Files\Mozilla Firefox\firefox.exe"
		
		
		FileInputStream fs =new FileInputStream("C:\\testing\\prop.properties");
		Properties prop=new Properties();
		prop.load(fs);
		
		String browser=prop.getProperty("browser");
		
		
		
		//String browser ="chrome";//we will read this from data file
				//String browser="chrome"
				
		WebDriver driver;	
		
if(browser.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		 driver = new FirefoxDriver();
}else if (browser.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
    driver = new ChromeDriver();
}else {
	System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
   driver = new ChromeDriver();
}
		
			
			
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abckjkds");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("a45shgh5sc");
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
