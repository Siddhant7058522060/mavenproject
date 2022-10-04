package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// declaration
		@FindBy (xpath="//div[@class='app_logo']") private WebElement logo;
		
		//initializatin
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//usage
		//method for logo
		public void verifyHomePageLogo(){
			
			boolean result = logo.isDisplayed();
			if(result==true) 
			{
				System.out.println("logo id displayed");
			}else {
				System.out.println("logo is not displayed");
			}
		}

}
