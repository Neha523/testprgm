package bpbprgm1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class findelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("http://practice.bpbonline.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
     driver.findElement(By.linkText("log yourself in")).click();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
     driver.findElement(By.xpath("//input[@name='email_address']")).sendKeys("bpb@bpb.com");
     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("bpb@123");
     driver.findElement(By.xpath("//button[@id='tdb5']")).click();
     driver.findElement(By.id("tdb3")).click();
     
	}

}
