package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable//");
		
		//write the code which is show sortable link is present or not?
		
		 List<WebElement> Sortable=driver.findElements(By.linkText("Sortable"));
		   
	        System.out.println(Sortable.size());
	        
	        
	        if(Sortable.size()>0) {
	        	System.out.println("element present");
	        }else {
	        	System.out.println("element not present");
	        }

	
	      //drag me to my target box is present or not
	        
	        List<WebElement> draggable=driver.findElements(By.id("draggable"));
			   
	        System.out.println(draggable.size());
	        
	        
	        if(draggable.size()>0) {
	        	System.out.println("draggable present");
	        }else {
	        	System.out.println("draggble not present");
	        }
	        
	        System.out.println(".....................after switching  frame...........");

             driver.switchTo().frame(0);
   
           //driver.switchTo().frame("");--string option works with id and name only.In this case we can not use as we don't have id and name
	//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
             
             
            Sortable=driver.findElements(By.linkText("Sortable"));
  		   
 	        System.out.println(Sortable.size());
 	        
 	        
 	        if(Sortable.size()>0) {
 	        	System.out.println("element present");
 	        }else {
 	        	System.out.println("element not present");
 	        }

	
             draggable=driver.findElements(By.id("draggable"));
			   
 	        System.out.println(draggable.size());
 	        
 	        
 	        if(draggable.size()>0) {
 	        	System.out.println("draggable present");
 	        }else {
 	        	System.out.println("draggble not present");
 	        }
 	        
	System.out.println(".......................swith to main page..............");
	
	
	driver.switchTo().defaultContent();
	
	 Sortable=driver.findElements(By.linkText("Sortable"));
	   
      System.out.println(Sortable.size());
      
      
      if(Sortable.size()>0) {
      	System.out.println("element present");
      }else {
      	System.out.println("element not present");
      }


      draggable=driver.findElements(By.id("draggable"));
		   
      System.out.println(draggable.size());
      
      
      if(draggable.size()>0) {
      	System.out.println("draggable present");
      }else {
      	System.out.println("draggble not present");
      }
	
	//driver.switchTo().parentFrame();---this is for when our frame is inside the frame
	
	
	
	}

}
