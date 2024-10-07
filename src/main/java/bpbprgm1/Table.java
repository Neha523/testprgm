package bpbprgm1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("http://practice.bpbonline.com/");
		driver.manage().window().maximize();
		WebElement Producttable= driver.findElement(By.tagName("table"));
	    List<WebElement> row= Producttable.findElements(By.xpath("//*/tbody/tr"));
	  
	    for (WebElement rows:row)
	    {  List<WebElement> Col=rows.findElements(By.xpath("td"));
	    	for (WebElement cols:Col)
	    	{
	    		String content=cols.getText();
	    		System.out.println(content);
	    	}
	    }
	   driver.close(); 		
	}

}
