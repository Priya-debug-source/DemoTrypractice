package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDListTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking/");
		
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));
		System.out.println(alllinks.size());
	
		
		/*for(int i=0; i<alllinks.size(); i++) {//this is for the multiple element
			System.out.println(alllinks.get(i).getText());*/
			
		for(WebElement a:alllinks) {
			System.out.println(a.getText());
		}
		
		
		

	}

}
