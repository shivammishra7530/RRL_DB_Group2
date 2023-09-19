package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgilsearchTRN {
	@FindBy(xpath = "//*[@id=\"transactionTable_filter\"]/label/input")
	private WebElement searchTRN;
	
	public AgilsearchTRN (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ClicksearchTRN() {
		searchTRN.sendKeys("845549176");
	}


}
