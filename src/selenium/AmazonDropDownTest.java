package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonDropDownTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.amazon.ca/");	


//span[contains(text(),'Hello, Sign in')]

List<WebElement> b1=driver.findElements(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
System.out.println(b1.size());

for(WebElement a : b1)
{
	System.out.println(a.getText());
}

		
	}

}
