package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickTransferBetweenAccount {

	@FindBy(linkText = "Transfer Between Accounts")
	private WebElement transferBetweenAccounts;
	
	public ClickTransferBetweenAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ClickTransferBetweenAccounts() {
		transferBetweenAccounts.click();
	}
	
	
}
