package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\buddy\\eclipse-workspace1\\maven\\src\\test\\java\\org\\fb\\FacebookLogin.java");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("buddylogesh@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("Logesh@23051996");
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		WebElement name=driver.findElement(By.xpath("//button[@name='login']"));
		name.click();
		
	}

}
