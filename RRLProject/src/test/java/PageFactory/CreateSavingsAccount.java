package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSavingsAccount {
	
	
       @FindBy(xpath="(//a[contains(@class,'dropdown-toggle')])[2]")
       private WebElement savings;
       
       @FindBy(id="new-savings-menu-item")
       private WebElement newsavings;
       
       @FindBy(xpath="(//input[contains(@class,'form-check-input')])[1]")
       private WebElement SavingsBtn;
       
       @FindBy(id="Individual")
       private WebElement individual;
       
       @FindBy(id="name")
       private WebElement AccountName;
       
       @FindBy(id="openingBalance")
       private WebElement intialdeposit;
       
       @FindBy(id="newSavingsSubmit")
       private WebElement submit;
       
       @FindBy(id="new-account-msg")
       private  WebElement msg;
       
       
       public  CreateSavingsAccount (WebDriver driver) {
   		PageFactory.initElements(driver, this);
       }
       public void clicksavings() {
    	  savings.click();
       }
       public void clicknewsavings() {
     	  newsavings.click();
       }
     	 public void clicksavingsBtn() {
       	  SavingsBtn.click();
     	 }
     	 public void clickonindividualBtn() {
          	  individual.click();
}

     	public void enterAccountName(String accountname) {
		AccountName.sendKeys(accountname);
}
     	
    	public void enterIntialDeposit(String openingdeposit) {
    		intialdeposit.sendKeys(openingdeposit); 	
}
    	public void clickonSubmit() {
    		submit.click();
    	}
    	public String getMsg() {
    		String Message = msg.getText();
    		return Message;
    	}
}