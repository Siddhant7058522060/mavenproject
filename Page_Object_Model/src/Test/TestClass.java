package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.HomePage;
import Page.LoginPage;

public class TestClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//create object of login page class
		LoginPage l= new LoginPage(driver);
		l.setLoginPageun();
		l.setLoginPagepass();
		l.clickLoginPagebutton();
		
		// create object of home page class
		HomePage h= new HomePage(driver);
		h.verifyHomePageLogo();
}
}
