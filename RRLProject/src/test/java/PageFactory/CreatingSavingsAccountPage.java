package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingSavingsAccountPage {
	
	@FindBy(id="savings-menu")
	private WebElement savings;
	
	@FindBy(id="new-savings-menu-item")
	private WebElement newsavingsaccount;
	
	@FindBy(id="Savings")
	private WebElement SavingsAccounttype;
	
	@FindBy(id="Individual")
	private WebElement individualAccountOwnership;
	
	@FindBy(id="name")
	private WebElement AccountName;
	
	@FindBy(id="openingBalance")
	private WebElement InitialDeposit;
	
	@FindBy(id="newSavingsSubmit")
	private WebElement Submit;
	
	@FindBy(id="new-account-msg")
	private WebElement Message;
	
	public CreatingSavingsAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Savings() {
		savings.click();
	}

	public void NewSavingsAccount() {
		newsavingsaccount.click();
	}
	public void savingsAccountType() {
		SavingsAccounttype.click();
	}
	
	public void Accountownership() {
		individualAccountOwnership.click();
	}
public void enterAccountname(String name) {
		
		AccountName.sendKeys(name);
		
	}
public void enterInitialdeposit(String money) {
	
	InitialDeposit.sendKeys(money);
	
}
public void submitbtn() {
	Submit.click();
}

public String getMsg() {
	String message = Message.getText();
	return message;
}
	

}