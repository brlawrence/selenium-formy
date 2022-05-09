package richard.selenium.pages;
import richard.selenium.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckBoxes extends Base {
	@FindBy(id="checkbox-1")
	WebElement checkbox1;
	@FindBy(id="checkbox-3")
	WebElement checkbox3;
	@FindBy(id="navbarDropdownMenuLink")
	WebElement navawaydropdown;
	@FindBy(xpath="//a[text()='Drag and Drop']")
	WebElement toElement;

public CheckBoxes() throws Exception {
	PageFactory.initElements(driver,this);
}
	public DragDropPage checkboxPage() throws Exception {
	checkbox1.click();
	checkbox3.click();
	navawaydropdown.click();
	dragAndDrop(toElement);
	//making it to wait to be able to see
	Thread.sleep(3000);
	return new DragDropPage();
}
	private void dragAndDrop(WebElement toElement) throws Exception {
		Actions dad = new Actions(driver);
		dad.moveToElement(toElement).click().build().perform();
		return;
	}
}
