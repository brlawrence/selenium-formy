package richard.selenium.pages;
import richard.selenium.base.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetForm extends Base {
	@FindBy(xpath="//li/a[contains(text(),'Components')]")
	WebElement topDropDown;
	@FindBy(xpath="//div/a[text()='Autocomplete']")
	WebElement toElement;
	
	public GetForm() throws Exception {
		PageFactory.initElements(driver,this);
	}
	
	//click dropdown move to element "auto complete" to navigate to the form
	
	public FillForm goToform() throws Exception {
		topDropDown.click();
		Thread.sleep(2000);
		Actions dm = new Actions(driver);
		dm.moveToElement(toElement).click().build().perform();
		return new FillForm();
	}
}