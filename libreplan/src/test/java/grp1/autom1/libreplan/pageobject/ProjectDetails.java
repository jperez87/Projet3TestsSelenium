package grp1.autom1.libreplan.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectDetails {

	
	@FindBy(xpath="//span[@class='perspective-active order-data z-button']/descendant::td[contains(text(),'D�tail du projet')]")
	public WebElement menuVerticalDetailProjetAffiche;
	
	@FindBy(xpath="//li[@class='z-tab z-tab-seld']/descendant::span[contains(text(),'WBS (t�ches)')]")
	public WebElement ongletHorizontalWbsAffiche;
	
	
	//menu Vertical
	@FindBy(xpath="//span[@class='perspective order-scheduling z-button']/descendant::td[contains(text(), 'Planification de projet')]")
	public WebElement menuVerticalPlanificationprojetsPresent;
	
	@FindBy(xpath="//span[@class='perspective  company-load z-button']/descendant::td[contains(text(), 'Chargement des ressources')]")
	public WebElement menuVerticalChargementRessourcesPresent;
	
	@FindBy(xpath="//span[@class='perspective  limiting-resources z-button']/descendant::td[contains(text(), 'Calendrier des ressources en file')]")
	public WebElement menuVerticalCalendrierRessourcesEnFilePresent;
	//--------------------------------------------------------------
	
	
	//onglets horizontaux
	@FindBy(xpath="//li[@class='z-tab']/descendant::span[contains(text(),'Donn�es g�n�rales')]")
	public WebElement ongletDonneesGenerales;
	//---------------------------------------


	
	//Bouton de l'Edition du projet
	@FindBy(xpath="//span[@title='Enregistrer le projet']")
	public WebElement boutonEnregistrerProjet;
	
	//xpath � am�liorer
	@FindBy(xpath="//span[@title='Enregistrer le projet']/following::span[1]")
	public WebElement boutonAnnulerEdition;
	//-------------------------------------
	
	
	
	protected final WebDriver driver;

	public ProjectDetails(WebDriver driver){
		super();
		this.driver = driver;
	}

	public PopUpConfirmerFenetreSortie annulerEdition() {
		boutonAnnulerEdition.click();
		return PageFactory.initElements(this.driver, PopUpConfirmerFenetreSortie.class);
	}

}
