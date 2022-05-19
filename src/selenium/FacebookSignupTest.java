package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("u_0_2")).click();//data test id will be used
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		
		//create new account
		Thread.sleep(2000);
		
		
		//driver.findElement(By.name("firstname")).sendKeys("pri");
		driver.findElement(By.name("lastname")).sendKeys("sharma");
		
		//driver.findElement(By.id("u_1_g")).sendKeys("123456");
		driver.findElement(By.name("reg_email__")).sendKeys("123456");
		driver.findElement(By.id("password_step_input")).sendKeys("aabb");
		driver.findElement(By.name("websubmit")).click();
		//frist name
		//enter lastname
		//mobile number
		//password
	

		//sign up
		
		
		String expectedErr ="What’s your name?";
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
		
		//select radiobutton
		
		List<WebElement> allradiobutton =driver.findElements(By.xpath("//label[contains(text(),'Female')]"));
		
		System.out.println(allradiobutton.size());
		
		for(WebElement a : allradiobutton ) {
			if(a.isSelected()) {
				System.out.println(a.getAttribute("value")+"......."+a.isSelected());
			}
		
		
		}
		
		
		
	}
		
		
		
	
	}
	
	
	
	
	


