package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://moodle.cestarcollege.com/moodle/");
		
		
		//driver.findElement(By.xpath("//span[@class='instancename'][contains(text(),'Faq')]")).click();
		driver.findElement(By.linkText("Faq")).click();//This is the link that's why we used link tag
		
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());
		
		
		Iterator<String> iter=allwindows.iterator();
		String mainWindow=iter.next();
		String childWindow=iter.next();
		System.out.println(mainWindow);
		System.out.println(childWindow);
		
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
