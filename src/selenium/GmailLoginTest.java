package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//enter wrong email
		//click on next
		//compare expected and actual error
		driver.findElement(By.id("identifireId")).sendKeys("assf");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(2000);
		
		String expectedErrMsg ="Could't find your Google Acoount";
		String ActualErrMsg = driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).getText();
		System.out.println("ActualErrMsg");
		
		if(ActualErrMsg.equals(expectedErrMsg)) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
		
		

	}

}
