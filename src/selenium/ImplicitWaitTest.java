package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//implicitwait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//explicit
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		//driver.findElement(By.id("u_0_2")).click();//data test id will be used
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		
		//create new account
		//Thread.sleep(2000);
		
		
		//driver.findElement(By.name("firstname")).sendKeys("pri");
		driver.findElement(By.name("lastname")).sendKeys("sharma");
		
		//driver.findElement(By.id("u_1_g")).sendKeys("123456");
		driver.findElement(By.name("reg_email__")).sendKeys("123456");
		driver.findElement(By.id("password_step_input")).sendKeys("aabb");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
		//frist name
		//enter lastname
		//mobile number
		//password
	

		//sign up
		
		Thread.sleep(3000);
		String expectedErr ="What’s your name?";
		//explixit object call here...s
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(//div[contains(@id,'js_')])[1]"), "What’s your name?"));
		//This is line copied from the sir
		//wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(//div[@class='_5633 _5634 _53ij'])[2]"), "What’s your name?"));

		String ActualErrMsg = driver.findElement(By.xpath("(//div[contains(@id,'js_')])[1]")).getText();
		
		System.out.println(ActualErrMsg);
		
		if(expectedErr.equals(ActualErrMsg)) {
			System.out.println("passed");
		}else
			System.out.println("failed");
		
		
		//dropdownlistTest
		List<WebElement> month = driver.findElements(By.xpath("//select[@id='month']"));
		List<WebElement> day = driver.findElements(By.xpath("//select[@id='day']"));
		List<WebElement> year=driver.findElements(By.xpath("//select[@id='year']"));
		System.out.println(month.size());
		System.out.println(day.size());
		System.out.println(year.size());
		
		
		
		
		WebElement m1 = driver.findElement(By.id("month"));
		WebElement d1 = driver.findElement(By.id("day"));
		WebElement y1=driver.findElement(By.id("year"));
		Select s=new Select(m1);
		Select day1 =new Select(d1);
		Select year1=new Select(y1);
		
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		day1.selectByIndex(2);
		Thread.sleep(2000);
		
		year1.selectByIndex(2);
		Thread.sleep(2000);

	}

}
