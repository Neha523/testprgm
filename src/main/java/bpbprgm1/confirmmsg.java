package bpbprgm1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class confirmmsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		  Alert third=driver.switchTo().alert();
		  String text= third.getText();
		  System.out.println(text);
		  third.sendKeys("How are you?");
		  third.accept();
	}

}
