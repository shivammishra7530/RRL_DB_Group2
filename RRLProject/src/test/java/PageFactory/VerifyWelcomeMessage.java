package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyWelcomeMessage {

	@FindBy(xpath = "//*[@id=\"right-panel\"]/div[1]/div[2]/div/div/ol/li")
	private WebElement verifyWelcomeMessage;
	
	public VerifyWelcomeMessage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String DoVerifyWelcomeMessage() {
		String message = verifyWelcomeMessage.getText();
		return message;
	}
	
}
