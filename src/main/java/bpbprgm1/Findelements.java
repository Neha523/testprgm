package bpbprgm1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.bpbonline.com/");
		Thread.sleep(1000);
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
		for (WebElement alllink:Links)
		{
			System.out.println(alllink.getText());
		}
		

	}

}
