package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class move_to_element {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new EdgeDriver();
	     driver.get("https://upsc.gov.in/");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	    WebElement privacy = driver.findElement(By.xpath("//a[text()='Examination ']"));
	     Actions action= new Actions(driver);
	     action.moveToElement(privacy).build().perform();
	     driver.findElement(By.xpath("//a[text()='Active Examinations']")).click();
	}

}
