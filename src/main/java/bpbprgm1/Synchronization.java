package bpbprgm1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Synchronization {

	public static void main(String[] args){
		// TODO Auto-generated method 

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://practice.bpbonline.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("log yourself in")).click();
		driver.findElement(By.xpath("//input[@name='email_address']")).sendKeys("admin@admin.com");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin@123");
	    driver.findElement(By.id("tdb5")).click();
	    driver.findElement(By.id("tdb3")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	    WebDriverWait wait=new WebDriverWait(driver,20);
	   
	    driver.findElement(By.xpath("//a[@id='tdb4']")).click();
	    
	    
	    driver.close();
	    
	    
	    

	}

}
