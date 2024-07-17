package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class switch_to {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new EdgeDriver();
	     driver.get("https://upsc.gov.in/");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	    /* driver.findElement(By.xpath("//a[text()='One Time Registration (OTR) for Examinations']")).click();
	    String parent = driver.getWindowHandle();
	   Set<String> all = driver.getWindowHandles();
	   for(String id:all)
	   {
		   driver.switchTo().window(id);
		   if(id.equals(parent))
		   {
			   String child = driver.getTitle();
			   System.out.println(child);
		   }
	   }*/
	   Thread.sleep(3000);
	   String anand = driver.findElement(By.xpath("//h2[text()='What’s New      ']")).getText();
	   System.out.println(anand);
	}

}
