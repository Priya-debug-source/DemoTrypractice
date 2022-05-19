package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggetionListTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//type canada in search box
		 driver.findElement(By.name("q")).sendKeys("canada");
	
		
		
		Thread.sleep(2000);
		
	    // driver.findElement(By.name("q")).getText();
		
		//we can use this xpath //ul[@role='listbox']/li
		List<WebElement> alloptions =driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println(alloptions.size());
		//print size=10;
		//text
		
		for(WebElement a : alloptions) {
			System.out.println(a.getText());
		}
		
		
		

	}

}
