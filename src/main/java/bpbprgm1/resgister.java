package bpbprgm1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class resgister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://practice.bpbonline.com");
	  Thread.sleep(1000);
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  if(driver.getPageSource().contains("Welcome to BPB Online"))
	  
	  {
		  System.out.println("Page is loadded successfully");
	  }
		  else 
		  {
			  System.out.println("Page is not loaded successfully");
	  }
	  
	  driver.navigate().to("http://www.selenium.dev");
	  if(driver.getPageSource().contains("Selenium"))
		  
	  {
		  System.out.println("Page is loadded successfully");
	  }
	  driver.close();
		 
   
	}

}
