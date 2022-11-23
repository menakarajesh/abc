package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\Menaka rajesh\\eclipse-workspace\\new\\Browser\\Driver\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.get("http://greenstech.in/selenium-course-content.html\r\n" + 
		"");
}
}