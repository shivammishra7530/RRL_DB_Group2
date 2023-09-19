package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "submit")
	private WebElement submit;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ClickUsername() {
		username.sendKeys("selena1234@gmail.com");
	}
	
	public void ClickPassword() {
		password.sendKeys("Selena@123");
	}
	
	public void ClickSubmit() {
		submit.click();
	}
	
}
