package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		
		Actions builder=new Actions(driver);
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		builder.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		
		
		//WebElement sports = driver.findElement(By.linkText("Sporting Goods"));
		//builder.moveToElement(sports).build().perform();
		
		//Thread.sleep(2000);
		
		
		List<WebElement> alllinks = driver.findElements(By.xpath("(//div[@class='hl-cat-nav__sub-cat-col']/ul)[5]/li"));
		System.out.println(alllinks.size());
	
		
	
		
		for(WebElement a:alllinks) {
			System.out.println(a.getText());
		}
		
		

	}

}
