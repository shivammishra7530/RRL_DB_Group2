package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositMoney {
	private Actions actions;
@FindBy(id="deposit-menu-item")
private WebElement depositBtn;

@FindBy(id="selectedAccount")
private WebElement SelectAccountforDeposit;

@FindBy(id="amount")
private WebElement depositamount;

@FindBy(xpath="//button[contains(@class,'btn btn-primary btn-sm')]")
private WebElement submitBtn;

@FindBy(xpath="(//small[contains(@class,'text-light')])[3]")
private WebElement accountmsg;



public DepositMoney(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions=new Actions(driver);

}
public void clickonDeposit() {
	depositBtn.click();
}
public void selectAccount() {
	SelectAccountforDeposit.click();
	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
}
public void enterAccountdepositMoney(String DepositMoney) {
	depositamount.sendKeys(DepositMoney);
}
public void clickonsubmit() {
	submitBtn.click();
}
public String getAccountMsg() {
	String Message = accountmsg.getText();
	return Message;
}

}