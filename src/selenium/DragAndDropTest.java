package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		
		//https://jqueryui.com/droppable/
		
		 Actions builder=new Actions(driver);
         builder.dragAndDrop(draggable, droppable).build().perform();
         
         
          if(droppable.getText().equals("Dropped!"))   {
 		System.out.println("test pass");
	
          }else {
        	  System.out.println("test fail");
          }
	}

}
