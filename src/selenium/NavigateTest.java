package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//driver.get("http://www.echoecho.com/javascript4.htm");
		driver.navigate().to("http://www.echoecho.com/javascript4.htm");
		//this both method are same but driver.navigate.to has so many other method thats the only difference
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		
		

	}

}
