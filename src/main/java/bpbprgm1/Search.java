package bpbprgm1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://practice.bpbonline.com/");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@name='keywords']")).clear();
	 driver.findElement(By.xpath("//input[@name='keywords']")).sendKeys("mouse");
	 driver.findElement(By.xpath("//input[@title=' Quick Find ']")).click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	 
	 
	}

}
