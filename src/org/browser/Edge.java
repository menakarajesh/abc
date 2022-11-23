package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Menaka rajesh\\eclipse-workspace\\new\\Browser\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		//to get the title from the webpage
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("title"); //branch1
		//to get the url from the webpage
		String currentUrl= driver.getCurrentUrl();
		System.out.println(currentUrl);
		//enter the text
	WebElement textUsername = driver.findElement(By.id("email"));
		textUsername.sendKeys("menaka");
		//to enter the text in the password
		WebElement textpassword = driver.findElement(By.name("pass"));
		textpassword.sendKeys("234578");
		// to click on the login button
		WebElement buttonLogin = driver.findElement(By.name("login"));
		
}
}