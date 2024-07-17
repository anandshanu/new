package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new EdgeDriver();
     
     //String expectedURL = "Welcome to UPSC | UPSC";
     driver.get("https://upsc.gov.in/");
     driver.manage().window().maximize();
     //get_title
    // String actualURL= driver.getCurrentUrl();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[text()='One Time Registration (OTR) for Examinations']")).click();
     driver.quit();
    /* System.out.println(actualURL);
     if(expectedURL.contains(actualURL))
     {
    	 System.out.println("pass");
     }
     else
     {
    	 System.out.println("fail");
     }*/
     
     

}
}
