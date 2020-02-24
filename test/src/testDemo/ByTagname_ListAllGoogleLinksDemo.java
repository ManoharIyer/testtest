package testDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByTagname_ListAllGoogleLinksDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		
		for (int i=0;i<Links.size();i++)
		{
			System.out.println(Links.get(i).getText());
			Thread.sleep(200);
			
		}
		driver.close();

	}

}
