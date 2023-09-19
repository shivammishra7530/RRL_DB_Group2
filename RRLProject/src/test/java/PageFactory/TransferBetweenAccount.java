package PageFactory;

import java.time.Duration;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferBetweenAccount {

	 WebDriverWait wait;
	    Actions actions;

	    @FindBy(id = "fromAccount")
	    private WebElement selectAccountFromType;

	    @FindBy(id = "toAccount")
	    private WebElement toSelectToAccountType;

	    @FindBy(xpath = "//*[@id=\"amount\"]")
	    private WebElement amount;

	    @FindBy(xpath = "//*[@id=\"right-panel\"]/div[2]/div/div/div/div/form/div[1]/div[1]/div/span[2]")
	    private WebElement errorMessage;

	    @FindBy(xpath = "//*[@id=\"right-panel\"]/div[2]/div/div/div/div/form/div[2]/button[1]")
	    private WebElement submit;

	    public TransferBetweenAccount(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	        actions = new Actions(driver);
	        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	    }

	    public void ClickSelectAccountType() {
	    	//selectAccountFromType.clear();
	    	selectAccountFromType.click();
	    	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    }

	    public void ClickSelectAccountToType() {
	    	//toSelectToAccountType.clear();
	    	    	toSelectToAccountType.click();
	    	    	actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();  
	    	    	
	    	    	}    

	    public void EnterAmount(String amt) {
	    	amount.clear();
	        amount.sendKeys(amt);
	    }

	    public void ClickSubmit() {
	        submit.click();
	    }

	    public String getErrMsg() {
	        return errorMessage.getText();
	    }
}
