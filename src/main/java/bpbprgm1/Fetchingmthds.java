package bpbprgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fetchingmthds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://practice.bpbonline.com/");
		 Thread.sleep(1000);
		 WebElement Info=driver.findElement(By.xpath("//input[@title=' Quick Find ']"));
		 System.out.println(Info.getTagName());
		 System.out.println(Info.getText());
		 System.out.println(Info.getAccessibleName());
		 System.out.println(Info.getAccessibleName());
		 System.out.println(Info.getAttribute("src"));
		 System.out.println(Info.getRect().getHeight());
		 System.out.println(Info.getSize());
		 System.out.println(Info.getLocation());
		 System.out.println(Info.getDomAttribute("src"));
		 
		 
		 driver.close();
	}

}
