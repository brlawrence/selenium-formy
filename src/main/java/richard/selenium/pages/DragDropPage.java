package richard.selenium.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import richard.selenium.base.Base;

public class DragDropPage extends Base {
@FindBy(id="image")
WebElement start;
@FindBy(id="box")
WebElement destination;

public DragDropPage() throws Exception {
	PageFactory.initElements(driver,this);
}
	public void performDragDrop() throws Exception {
		Actions pdd = new Actions(driver);
		System.out.println("Inside Drag and Drop");
		pdd.dragAndDrop(start, destination).build().perform();
		return;
	}

}
