package richard.selenium.pages;
import richard.selenium.base.Base;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillForm extends Base {
	@FindBy(xpath="//input[@id='autocomplete']")
	WebElement address;
	@FindBy(xpath="//input[@id='street_number']")
	WebElement streetNumber;
	@FindBy(xpath="//input[@id='route']")
	WebElement street;
	@FindBy(xpath="//input[@id='locality']")
	WebElement city;
	@FindBy(xpath="//input[@id='administrative_area_level_1']")
	WebElement state;
	@FindBy(xpath="//input[@id='postal_code']")
	WebElement zipCode;
	@FindBy(xpath="//input[@id='country']")
	WebElement country;
	
	public FillForm() throws Exception {
		PageFactory.initElements(driver,this);
	}
	String address1 = "Richard Bernard";
	String streetNumber1 = "9712";
	String street1 = "E Oakridge Drive";
	String city1 = "Berkley";
	String state1 = "CA";
	String zipCode1 = "94720";
	String country1 = "USA";

	public void fillForm() {
	address.sendKeys(address1);
	streetNumber.sendKeys(streetNumber1);
	street.sendKeys(street1);
	city.sendKeys(city1);
	state.sendKeys(state1);
	zipCode.sendKeys(zipCode1);
	country.sendKeys(country1);
	}
}