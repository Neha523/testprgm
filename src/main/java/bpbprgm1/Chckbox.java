package bpbprgm1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	     driver.get("https://the-internet.herokuapp.com/checkboxes");
		 System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isEnabled());
		 System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isDisplayed());
		 System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 
		 
		 

	}

}
