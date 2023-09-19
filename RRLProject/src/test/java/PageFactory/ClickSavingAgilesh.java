package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickSavingAgilesh {
	@FindBy(xpath = "//*[@id=\"savings-menu\"]")
	private WebElement savings;
	
	@FindBy(xpath = "//*[@id=\"view-savings-menu-item\"]")
	private WebElement viewsavings;
	
	public ClickSavingAgilesh (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ClickSavings() {
		savings.click();
	}

	public void ClickviewSavings() {
		viewsavings.click();
	}

}