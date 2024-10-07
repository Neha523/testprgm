package bpbprgm1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framealert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	      driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	      Alert confirm= driver.switchTo().alert();
	      confirm.accept();
	      if(driver.findElement(By.xpath("//p[id='result']")).getText().contains("You successfully clicked an alert"))
	      {
	    	  System.out.println("Alert successfully accepted");
	      }
	      else
	      {
	    	  System.out.println("Alert not successfully accepted");
	      }
	}

}
