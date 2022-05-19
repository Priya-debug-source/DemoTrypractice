package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MississaguaTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.mississauga.ca/portal/home");
		
		
		Actions builder=new Actions(driver);
		WebElement cityhall = driver.findElement(By.id("tnNavHall"));
		builder.moveToElement(cityhall).build().perform();
		
		Thread.sleep(2000);
		
		

		 List<WebElement> alllinks=driver.findElements(By.xpath("//div[@id='tnNavHall']/a"));
		   
	        System.out.println(alllinks.size());
	        
	        for(WebElement a : alllinks) {
	        	
	        	System.out.println(a.getText());
	        }
	        
		
	

	}

}
