package richard.selenium.pages;
import richard.selenium.base.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDown extends Base {
	@FindBy(id="dropdownMenuButton")
	WebElement dropdownMenuButton;
	@FindBy(xpath="//div/a[5][text()='Drag and Drop']")
	WebElement toElement;
	
	public DropDown() throws Exception {
		PageFactory.initElements(driver,this);
	}
	
	//click dropdown move to element "drag and drop" to navigate to the
	// drag and drop page
	public DragDropPage dd(WebElement toElement) throws Exception {
		dropdownMenuButton.click();
		Thread.sleep(2000);
		Actions dm = new Actions(driver);
		dm.moveToElement(toElement).click().build().perform();
		return new DragDropPage();
	}
}