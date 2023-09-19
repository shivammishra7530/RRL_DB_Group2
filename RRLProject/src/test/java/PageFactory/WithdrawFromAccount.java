package PageFactory;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WithdrawFromAccount {
	private	Actions actions;
	
	@FindBy(id="withdraw-menu-item")
	private WebElement withdrawtab;
   @FindBy(id="selectedAccount")
	private WebElement selectAccount;
	@FindBy(id="amount")
    private WebElement withdrawAmount;
	@FindBy(xpath="(//button[contains(@class,'btn')])[3]")
	private WebElement submit;
	@FindBy(xpath="(//small[contains(@class,'text-light')])[4]")
	private WebElement VerifyAccDetails;
	
	public WithdrawFromAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	public void clickWithdraw() {
		withdrawtab.click();
	}
	public void clickselectedAccount() throws InterruptedException {
		selectAccount.click();
    	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	public void enterWithdrawalamount(String money) {
		
		withdrawAmount.sendKeys(money);
		
	}
	public void clicksubmit() {
		submit.click();
	}
	public String VerifyAccountMsg() {
		String Message = VerifyAccDetails.getText();
		return Message;
	}
	
	
	

}