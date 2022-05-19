package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		 
		
		List<WebElement> all = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(all.size());
		
		for(WebElement a: all) {
			if(a.isSelected()) {
		
			System.out.println(a.getText()+"......."+a.isSelected());
			}
		}
		System.out.println("...........................................");
		
		WebElement box = driver.findElement(By.id("gh-cat"));
		Select s=new Select(box);
		
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		
		s.selectByValue("2984");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Books");
		Thread.sleep(2000);
		
		/*for(int i=0;i<all.size();i++) {
			System.out.println(all.get(i).getText()+"........"+all.get(i).isSelected());
		}*/
		
		for(WebElement a: all) {
			if(a.isSelected()) {
		
			System.out.println(a.getText()+"......."+a.isSelected());
			}
	}
	}
}
