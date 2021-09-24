# Shaadi.com
package Com.Landing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BeforeTest {
WebDriver driver;
	@Test
	//@BeforeMethod
	public void beforeMethod() throws Exception {
		
		//  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromedriver.exe");
		  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.marathishaadi.com/");
		Thread.sleep(5000);
	}
}




