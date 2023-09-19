package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox {
	 @FindBy  (xpath ="//*[@id=\"transactionTable_filter\"]/label/input")
 	private WebElement searchboxbutton;
     
   
 	public SearchBox(WebDriver driver) {
 		PageFactory.initElements(driver, this);
 	}
 		
 		public void searchboxButton1(String trn) {
 			
 			searchboxbutton.sendKeys(trn);
 		}
 		
	
	

}
