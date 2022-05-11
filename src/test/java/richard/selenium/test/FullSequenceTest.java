package richard.selenium.test;
import richard.selenium.base.Base;
import richard.selenium.pages.CheckBoxes;
import richard.selenium.pages.DragDropPage;
import richard.selenium.pages.DropDown;
import richard.selenium.pages.FillForm;
import richard.selenium.pages.GetForm;
import richard.selenium.pages.StartPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FullSequenceTest extends Base {
	StartPage startpage;
public FullSequenceTest() throws Exception {
	super();
}
@BeforeMethod
public void sequenceOfActions() throws Exception {
	Base.initialize();
	startpage = new StartPage();
}

@Test
public void sequence1() throws Exception {
	CheckBoxes checkboxes = startpage.startPage(); //start page method lands on check boxes
	DragDropPage ddp = checkboxes.checkboxPage();  // check box page lands on to Drag and drop page
	driver.navigate().refresh();
	ddp.performDragDrop();
	Thread.sleep(1000);
	GetForm gf = new GetForm();
	gf.goToform();
	Thread.sleep(1000);
	FillForm ff = new FillForm();
	ff.fillForm();
}

@AfterMethod
public void teardown() {
	//driver.quit();
}

}
