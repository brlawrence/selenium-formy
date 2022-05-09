package richard.selenium.pages;
import richard.selenium.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StartPage extends Base {
	@FindBy(xpath="//li/a[text()='Checkbox']")
	WebElement checkboxMain;

public StartPage() throws Exception {
	PageFactory.initElements(driver,this);
}
	public CheckBoxes startPage() throws Exception {
		checkboxMain.click();
	return new CheckBoxes();
}
	
}
