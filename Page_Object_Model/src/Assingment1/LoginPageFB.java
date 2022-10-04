package Assingment1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFB {
	@FindBy(xpath="//input[@id='email']") private WebElement un;
	@FindBy(xpath="//input[@id='pass']") private WebElement pass;
	@FindBy(xpath="//button[@name='login']") private WebElement lgbutton;
	
	public LoginPageFB(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLoginPageun() {
		un.sendKeys("8468947700");
	}
	public void setLoginPagepass() {
		pass.sendKeys("Siddhant1999");
	}
	public void clickLoginPagelgbutton() {
		lgbutton.click();
	}
}
