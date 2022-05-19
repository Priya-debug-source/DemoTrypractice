package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://ca.shein.com/?ref=www&rep=dir&ret=ca");
		Thread.sleep(5000);
		
		List<WebElement> popUp = driver.findElements(By.xpath("(//i[@class='iconfont icon-close she-close'])[29]"));
		
		
		System.out.println(popUp.size());
		
		
		
		if(popUp.size()>0)
		{
			popUp.get(0).click();
		}
		driver.findElement(By.name("header-search")).sendKeys("tshirt");
		
		
		
		
		

	}

}
