package WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		 WebDriver driver = new EdgeDriver();
	     driver.get("https://upsc.gov.in/");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     driver.navigate().to("https://www.facebook.com/");
	     Thread.sleep(3000);
	     driver.navigate().refresh();
	     
	     
	     URL url= new URL("https://www.instagram.com/accounts/login/?hl=en");
	     
	     driver.navigate().to(url);
	    String insta = driver.getTitle();
	    System.out.println(insta);
	     
	}

}
