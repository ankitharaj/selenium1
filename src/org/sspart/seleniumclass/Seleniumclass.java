package org.sspart.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumclass  {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANKITHA\\Downloads\\chromedriver.exe");
		
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Select s=new Select( driver.findElement(By.xpath("//*[@name=\"url\"]")));
		s.selectByValue("search-alias=electronics");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.navigate().to("https://www.amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.xpath("//*[@value=\"Go\"]")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		
		driver.findElement(By.linkText("Amazon Pay")).click();
		
		driver.quit();
		System.out.println("my execution is done");
		
		//WebDriver driver= new FirefoxDriver()

	}
  // public void get() {
	//   get("");
	 //  getTitle();
  // }
}
