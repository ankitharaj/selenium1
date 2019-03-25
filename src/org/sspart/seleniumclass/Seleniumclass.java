package org.sspart.seleniumclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANKITHA\\Downloads\\chromedriver.exe");
		
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.quit();
		System.out.println("my execution is done");
		
		

	}

}
