package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooDropDownListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/");
		driver.findElement(By.xpath("//div[@class='menu-section']/ul/li/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='createacc']")).click();
		driver.findElement(By.name("firstName")).sendKeys("sharma");
		driver.findElement(By.name("lastName")).sendKeys("pri");
		driver.findElement(By.name("yid")).sendKeys("abcdef");
		
		
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@id='desktop-suggestion-list']"));
		System.out.println(suggestion.size());
		
		Thread.sleep(2000);
		
		WebElement s1 =driver.findElement(By.name("desktop-suggestion-list"));
		Select sugg1=new Select(s1);
		
		
		sugg1.selectByIndex(2);
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("phone")).sendKeys("987654");
		
		List<WebElement> n1 = driver.findElements(By.xpath("//select[@name='shortCountryCode']"));
		System.out.println(n1.size());
		
		Thread.sleep(2000);
		
		WebElement selectcode =driver.findElement(By.name("shortCountryCode"));
		Select code1=new Select(selectcode);
		
		
		code1.selectByIndex(2);
		Thread.sleep(2000);
		
		
		
		
	
	}

}
