package Assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Assingment1.HomePageFB;
import Assingment1.LoginPageFB;

public class TestClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/?stype=lo&jlou=Afe52ZozkINTrwpDp26h9xKiR-UqSJbeh2B0ON8giCQDyXkFShumWnf2UKXQ48hN55YcejwtpYqWofpv5HL0_pJE1BTek4sp-0UKXSkuBqRWgg&smuh=16639&lh=Ac9CWHmwwfmb5u3O-qo");
		driver.manage().window().maximize();
		
		
	LoginPageFB l= new LoginPageFB(driver);	
	
	l.setLoginPageun();
	l.setLoginPagepass();
	l.clickLoginPagelgbutton();
	
	HomePageFB h= new HomePageFB(driver);
	h.verifyHomePagelogo();
	}

}
