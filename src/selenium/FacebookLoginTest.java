package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	//driver.findElement(By.className("inputtext _55r1 inputtext _1kbt _4rer inputtext _1kbt")).sendKeys("fcgh");
            //driver.findElement(By.id("email")).sendKeys("xffjhi");
            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("cdcvd");
	}

}
