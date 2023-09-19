package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyMessageForTransferBwAccount {

	@FindBy(xpath = "//*[@id=\"firstRow\"]/div/div/form/div/div[4]/small")
	private WebElement verifyMessageForTransferBwAccount;
	
	public VerifyMessageForTransferBwAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String DoVerifyMessageForTransferBwAccount() {
		String message = verifyMessageForTransferBwAccount.getText();
		return message;
	}
	
}
