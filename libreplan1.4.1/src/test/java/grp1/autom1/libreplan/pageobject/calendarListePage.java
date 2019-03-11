package grp1.autom1.libreplan.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class calendarListePage {
	@FindBy(xpath = "//td[contains(text(),'Create')]")
	WebElement boutonCreer;
	
	@FindBy(xpath = "//div[contains(text(), 'Name')]")
	WebElement colonneNom;
	
	
	@FindBy(xpath = "//div[contains(text(), 'Inherits from date')]")
	public WebElement colonneDate;
	
	@FindBy(xpath = "//div[contains(text(), 'Inherits up to date')]")
	WebElement colonneJour;
	
	@FindBy(xpath = "//div[contains(text(), 'Operations')]")
	WebElement colonneOperations;
	

	
	protected final WebDriver driver;
	
	public calendarListePage(WebDriver driver) {
		super();
		this.driver = driver;

	}
	
	
	public boolean checkTableElement() {
		
		return  colonneDate.isDisplayed() && colonneNom.isDisplayed() && colonneJour.isDisplayed() && colonneOperations.isDisplayed();
	}
	
	public void creerUnCalendrier() {
		boutonCreer.click();		
	}
	
	
	
}
