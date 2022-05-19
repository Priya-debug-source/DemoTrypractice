package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
//driver.findElement(By.linkText("About")).click();
        Thread.sleep(2000);
        
        
        String expectedTitle ="Google - About Google, Our Culture & Company News";
       String actualTitle= driver.getTitle();
       System.out.println("actualTitle");
       
       String expectedUrl = "about.google";
       String actualUrl= driver.getCurrentUrl();
       System.out.println("actualUrl");
       driver.findElement(By.partialLinkText("Abo")).click();
       
       if(expectedTitle.equals(actualTitle) && actualUrl.contains(expectedUrl)){
    	   System.out.println("test pass");
    	   
       }else{
    	   System.out.println("test fail");
       }
        
	}

}
