package bpbprgm1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://practice.bpbonline.com/index.php");
	      Select manufactures=new Select(driver.findElement(By.name("manufacturers_id")));
	      List<WebElement> Activename=manufactures.getOptions();
}
}