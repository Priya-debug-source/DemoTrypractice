package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		
				//WebElement footer = driver.findElement(By.id("uiList pageFooterLinkList _509- _4ki _703 _6-i"));
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));		
		
		//List<WebElement> alllinks = footer.findElements(By.tagName("a"));
				
			
				System.out.println(alllinks.size());
			
				
				for(int i=0; i<alllinks.size(); i++) {//this is for the multiple element
					System.out.println(alllinks.get(i).getText());
					
				}

	}

}
