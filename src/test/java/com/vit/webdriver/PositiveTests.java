package com.vit.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {

	@Test
	public void loginTest() {
		System.out.println("Starting loginTest");
		
//		Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// sleep for 3 seconds
		sleep(3000);

		// maximize browser window
		driver.manage().window().maximize();

//		open test page
		String url = "http://the-internet.herokuapp.com/login";
		driver.get(url);
		System.out.println("Page is opened.");
		
		// sleep for 2 seconds
		sleep(2000);

//		enter username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		sleep(1000);

//		enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("SuperSecretPassword!");
		sleep(3000);
		
//		click login button
		WebElement logInButton = driver.findElement(By.tagName("button"));
		logInButton.click();
		
		sleep(5000);
		

//		verificatins:
//		 new url
		
//		 logout button is visible
		WebElement logOutButton = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
		
		
//		 succesful login message
		WebElement successMessage = driver.findElement(By.cssSelector("#flash"));
		
		
		
		
		// Close browser
		driver.quit();
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

