package selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.tagName("a"));
		
		//WebElement footer = driver.findElement(By.id("fbar"));
		//WebElement footer = driver.findElement(By.id("fsl"));
		//List<WebElement> alllinks = footer.findElements(By.tagName("a"));
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//span[@id='fsl']/a"));
		System.out.println(alllinks.size());
	
		
		for(int i=0; i<alllinks.size(); i++) {//this is for the multiple element
			System.out.println(alllinks.get(i).getText());
			
		}
		
		// System.out.println(alllinks.get(0).getText());for getting a single element
	}

}
