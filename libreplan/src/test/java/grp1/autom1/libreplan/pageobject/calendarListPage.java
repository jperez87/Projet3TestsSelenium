package grp1.autom1.libreplan.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class calendarListPage {
	@FindBy(xpath = "//td[contains(text(),'Cr�er')]")
	WebElement boutonCreer;
	
	@FindBy(xpath = "//div[contains(text(), 'Nom')]")
	WebElement colonneNom;
	
	
	@FindBy(xpath = "//div[contains(text(), 'H�rit� de la date')]")
	public WebElement colonneDate;
	
	@FindBy(xpath = "//div[contains(text(), 'H�ritages � jour')]")
	WebElement colonneJour;
	
	@FindBy(xpath = "//div[contains(text(), 'Op�rations')]")
	WebElement colonneOperations;
	

	
	protected final WebDriver driver;
	
	public calendarListPage(WebDriver driver) {
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
