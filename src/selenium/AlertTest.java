package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B2")).click();
		
		
		Thread.sleep(2000);
		
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept();
		//al.dismiss();
		
		

	}

}
