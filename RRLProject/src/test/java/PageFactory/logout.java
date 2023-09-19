package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
	@FindBy(xpath="(//img[contains(@class,'user')])")
	private WebElement icon;
	
	
	@FindBy(linkText="Logout")
	private WebElement logout;
	public logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickWithdraw() {
		icon.click();
	}
	public void clickLogout() {
		logout.click();
	}
	

}