package grp1.autom1.libreplan.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListeProjetsPage {

	@FindBy(xpath="//span[@class='perspective-active  orders z-button']/descendant::td[contains(text(), 'Liste des projets')]")
	public WebElement menuVerticalDetailProjetAffiche;
	
	@FindBy(xpath="//span[contains(text(), 'PROJET_TEST1')]")
	public WebElement projetTestCree;
	
	@FindBy(xpath="//div//td/img[@src='/libreplan/common/img/ico_borrar1.png']")
	public WebElement boutonSuppressionProjet1;
	
	@FindBy(xpath="(//span[@class='z-messagebox-btn z-button']//tbody/tr[2]/td)[2]")
	public WebElement boutonPopOkSuppressionProjet;

	@FindBy(xpath="//span[contains(text(),'Suppression de PROJET_TEST1. Êtes-vous sûr ?')]")
	public WebElement PopUpSuppressionProjet;
	
	@FindBy(xpath="//div//span[contains(text(), 'PROJET_TEST1 supprimé')]")
	public WebElement confirmationSuppressionProjet1;
	
	protected final WebDriver driver;

	public ListeProjetsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void cliquerBoutonSuppressionProjet1() {
		boutonSuppressionProjet1.click();
	}
	
	public void cliquerOkPopUpSuppressionProjet() {
		boutonPopOkSuppressionProjet.click();
	}
}
