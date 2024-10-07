package bpbprgm1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Confirmalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	      driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	      Alert dismiss=driver.switchTo().alert();
	      dismiss.dismiss();
	      if(driver.findElement(By.xpath("//p[@id='result']")).getText().contains("You clicked: Cancel"))
{
System.out.println("Dismiss performed successfully");

}
else
	
{System.out.println("Dismiss not performed successfully");
	}
	      Thread.sleep(100);
	  driver.findElement(By.xpath("//button[[normalize-space()='Click for JS Prompt']")).click();
	  Alert third=driver.switchTo().alert();
	  String text= third.getText();
	  System.out.println(text);
	  third.sendKeys("How are you?");
	  third.dismiss();
	  
	  
	}

}
