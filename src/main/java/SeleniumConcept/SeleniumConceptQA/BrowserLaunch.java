package SeleniumConcept.SeleniumConceptQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		//1. Firefox Browser
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ranajitb\\Geckodriver\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				String title = driver.getTitle();
				System.out.println(title);
				System.out.println(driver.getCurrentUrl());
				driver.close();
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ranajitb\\Chromedriver\\chromedriver.exe");
				WebDriver driver2 = new ChromeDriver();
				driver2.manage().window().maximize();
				driver2.get("https://www.google.com");
				String title2 = driver2.getTitle();
				System.out.println(title2);
				System.out.println(driver2.getCurrentUrl());
				driver2.quit();


	}

}
