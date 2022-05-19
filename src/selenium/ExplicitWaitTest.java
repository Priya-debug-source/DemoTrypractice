package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/javascript4.htm");
		//implicitwait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explicit 
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		
		driver.findElement(By.name("B2")).click();
		
		
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept();
		//al.dismiss();
	}

}
