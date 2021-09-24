package Com.Landing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration extends BeforeTest {
	
	String string1="";
	
	String url="";
	
  @Test
  public void Panel1() throws Exception {
	    
	  System.out.println("+++++++Lets Begin+++++++");
	  WebElement LetsBegin = driver.findElement(By.xpath("//button[text()=\"Let's Begin\"]"));
	  LetsBegin.click();

	  System.out.println("+++++++Enter mail id+++++++");
	  WebElement mailid = driver.findElement(By.xpath("//input[@name='email']"));
	  mailid.sendKeys("maheshkale332@gmail.com");
	  
	  System.out.println("+++++++Password+++++++");
	  WebElement password = driver.findElement(By.xpath("//input[@name='password1']"));
	  password.sendKeys("Mahesh@19952");
	  
	  System.out.println("+++++++create profile+++++++");
	  
	  
	 
	  Thread.sleep(1000);
	    WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[2]/div[3]/div/div[1]/div[1]"));
	    Dropdown.click();
	    driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[2]/div[3]/div/div[2]/div[2]")).click();
	  
	
	  
	  
	  WebElement Next = driver.findElement(By.xpath("//*[@id=\"___gatsby\"]/div/div[7]/form/div[3]/button"));
	  Next.click();
  }
  
  public void Panel2() {
	 
	String S = driver.findElement(By.xpath("//div[text()=\"Marathi\"]")).getText();
	  
	  String url= driver.getCurrentUrl();
	  
	  if (url.length() > 6) 
	  {
	   String   firstFourChars = url.substring(0, 6);
	  } 
	  else
	  {
		  String firstFourChars = url;
		  System.out.println(firstFourChars);
	  }
	   
	  
	  System.out.println("S="     +   S);
	  System.out.println("url="  +  url    );
	  
	  if(S.equals(url)) {
		  
	 Assert.assertEquals("url", "S"); 
	 
	 
	 

	  
		/*
		 * System.out.println("Comparing " + String1.gett + " and " + url + " : " +
		 * stringCompare(String1, url));
		 */
	  
	  
	  } 
	  
  }


	// TODO Auto-generated method stub
	
}

