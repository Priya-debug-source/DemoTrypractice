package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("laptop");
		
		Thread.sleep(2000);
		
		List<WebElement> option =driver.findElements(By.xpath("//div[@id='gAC']/ul/li"));
		System.out.println(option.size());
		
		
		for(int i=0;i<option.size()-1;i++) {
			System.out.println(option.get(i).getText());
			
			if(!(option.get(i).getText().contains("laptop")) ){
				System.out.println("failed");
				break;
			}
		}
		

	}

}
