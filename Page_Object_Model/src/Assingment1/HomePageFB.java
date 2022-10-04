package Assingment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFB {
	@FindBy(xpath="//div[@class='l38y3qj3 ekq1a7f9 myo4itp8 khm9p5p9 p9ctufpz k3q8kl47 cgu29s5g alzwoclg bdao358l i85zmo3j']") private WebElement logo;
	
	public HomePageFB(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public void verifyHomePagelogo() {
		boolean result=logo.isDisplayed();
		if(result==true) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("not displayed");
		}
	}

}
