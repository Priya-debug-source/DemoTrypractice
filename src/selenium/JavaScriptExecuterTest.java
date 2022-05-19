package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterTest {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		
		
		
		
		JavascriptExecutor jse =(JavascriptExecutor)driver;
	    WebElement aboutUs=driver.findElement(By.linkText("About Us"));
	    
	    
		//scroll by x and y
		//System.out.println(aboutUs.getLocation());
		//jse.executeScript("window.scrollBy(0.3000)");
		
		//scroll until the element is in the view is true
		jse.executeScript("arguments[0].scrollIntoView(true);",aboutUs);//this one scroll the window until we have element in view
		aboutUs.click();
		
		
		
		

	}

}
