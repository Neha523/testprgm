package bpbprgm1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	    driver.findElement(By.linkText("View or change my account information.")).click();
	    if(driver.findElement(By.xpath("//input[@value='m']")).isSelected())
	    {System.out.println("Male is selected");
	    }
	    else
	    {driver.findElement(By.xpath("//input[@value='m']")).click();
	    
	    }
	    driver.findElement(By.id("tdb5")).click();
	    if(driver.getPageSource().contains("Your account has been successfully updated."))
	    {
	    	System.out.println("profile updated successfully");
	    }
	    else
	    {
	    	System.out.println("Profile not updated successfully");
	    }

	}

}
