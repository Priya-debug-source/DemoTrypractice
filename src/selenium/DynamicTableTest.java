package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.w3schools.com/html/html_tables.asp

          ////table[@id='customers']/tbody/tr[2]/td[1]

		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(rows.size());
		

		List<WebElement> column=driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(column.size());
		
		for(int i=2;i<=rows.size();i++) {
		
			
			
			for(int j=1;j<=column.size();j++)
		
				System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
		        System.out.println(" | ");
		
		} 
		
		
		System.out.println();
		
	}

}
