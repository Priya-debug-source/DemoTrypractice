package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		//for  group1 
		List<WebElement> allRadioButtons =driver.findElements(By.name("group1"));
		System.out.println(allRadioButtons.size());
		
		
		for(WebElement a:allRadioButtons) {
			if(a.isSelected()) {
			System.out.println(a.getAttribute("value")+".........."+a.isSelected());
			}
		}
		
		allRadioButtons.get(2).click();
		
		for(WebElement a:allRadioButtons) {
			if(a.isSelected()) {
				System.out.println(a.getAttribute("value")+".........."+a.isSelected());
				}
		}
		
		//group 2
		
		
		

	}

}
