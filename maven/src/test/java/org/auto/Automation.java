package org.auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\buddy\\eclipse-workspace1\\maven\\src\\test\\java\\org\\auto\\Automation.java");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.automationexercise.com/");
	}

	

}
