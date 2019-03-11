package grp1.autom1.libreplan.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopUpProjet {

	@FindBy(xpath="//div[@id='_z_8-c']")
	public WebElement close1;
	
	
	@FindBy(xpath="//div[contains(text(),'Create new project')]")
	public	WebElement headPopUp;
	
//	- Nom : Champ de saisie non renseign�
	@FindBy(xpath="//span[contains(text(),'Name')]")
	public	WebElement nom;
	
	@FindBy(xpath="//span[contains(text(),'Name')]/following::input[@type='text'][1]")
	public WebElement nomField;
//-----------------------------

	
//	- Mod�le : Liste d�roulante non renseign�e
	@FindBy(xpath="//span[contains(text(),'Template')]")
	public	WebElement modele;
	
	@FindBy(xpath="//span[contains(text(),'Template')]/following::input[@type='text'][1]")
	public	WebElement modeleField;
//-------------------------------------
	
	
//	- Code : Champ de saisie renseign� avec une valeur par d�faut non modifiable et gris�. La case "G�n�rer le code" associ�e � ce champ est coch�e par d�faut
	@FindBy(xpath="//span[contains(text(),'Code')]")
	public	WebElement code;
	
	@FindBy(xpath="//span[contains(text(),'Code')]/following::input[@type='text'][1]")
	public	WebElement codeField;
	
	@FindBy(xpath="//span[contains(text(),'Code')]/ancestor::tr/descendant::input[@type ='checkbox'][1]")
	public WebElement caseCode;
	
	@FindBy(xpath="//label[contains(text(), 'G�n�rer le code')]")
	public WebElement caseCodeText;
//-------------------------------------
	
	
//	- Date de d�but : champ de saisie de date associ� � un calendrier. Par d�faut, la date affich�e est la date du jour. Le format de la date correspond � l'exemple suivant : "25 janv. 2017"
	@FindBy(xpath="//span[contains(text(),'Starting date')]")
	public	WebElement dateDebut;
	
	@FindBy(xpath="//span[contains(text(),'Starting date')]/following::input[@type='text'][1]")
	public WebElement dateDebutField;
	
	@FindBy(xpath="//table[@id ='_z_4-mid']")
	public WebElement calendrierDateDebut;
//-----------------------------------
	
	
//	- Ech�ance : champ de saisie de date associ� � un calendrier. Par d�faut, le champ n'est pas renseign�.
	@FindBy(xpath="//span[contains(text(),'Deadline')]")
	public	WebElement echeanche;
	
	@FindBy(xpath="//span[contains(text(),'Deadline')]/following::input[@type='text'][1]")
	public	WebElement echeancheField;
	
	
	@FindBy(xpath="//table[@id ='_z_6-mid']")
	public WebElement calendrierEcheance;
//------------------------------------
	
	
//	- Client : Champ de saisie non renseign�
	@FindBy(xpath="//span[contains(text(),'Customer')]")
	public	WebElement client;
	
	@FindBy(xpath="//span[contains(text(),'Customer')]/following::input[@type='text'][1]")
	public	WebElement clientField;
//---------------------------------
	
	
//	- Calendrier : Liste d�roulante avec pour valeur par d�faut "Default"
	@FindBy(xpath="//div/span[contains(text(),'Calendar')]")
	public	WebElement calendrier;
	
	@FindBy(xpath="//div/span[contains(text(),'Calendar')]/following::input[@type='text'][1]")
	public	WebElement calendrierField;
//---------------------------------
	
	
//	- Boutons [Accepter] 
	@FindBy(xpath="//td[contains(text(),'Accept')]")
	public	WebElement boutonAccepter;
//------------------------------------
	
	
//  - [Annuler]
	@FindBy(xpath="//td[contains(text(),'Cancel')]")
	public	WebElement boutonAnnuler;
//-----------------------------------
	
	
	@FindBy(xpath="//table[@id='_z_4-mid']/descendant::td[@class='z-calendar-wkday z-calendar-seld']")
	public WebElement dateDuJourCalendrierDateDebut;	
	
	@FindBy(xpath="//table[@id='_z_6-mid']/descendant::td[@class='z-calendar-wkday z-calendar-seld']")
	public WebElement dateDuJourCalendrieEcheance;	
	
	
	
	//Calendrier Echeance
	@FindBy(xpath="//div[@id='_z_4-ry']")
	WebElement boutonMoisSuivant;
	
	@FindBy(xpath="//table[@id='_z_4-mid']/descendant::td[@class='z-calendar-wkday z-calendar-seld']")
	WebElement dateDuJour;

	
	
protected final WebDriver driver;
	
	public PopUpProjet(WebDriver driver){
		super();
		this.driver = driver;
	}
		
		
	
	
	public void fermerAvertissement() {
		close1.click();
	}
	
	
	public void remplirLesChamps(String nom, String modele, String code, String dateDeDebut, String echeance, String client, String calendrier) {
		nomField.sendKeys(nom);
		modeleField.sendKeys(modele);
		codeField.sendKeys(code);
		dateDebutField.sendKeys(dateDeDebut);
		echeancheField.sendKeys(echeance);
		clientField.sendKeys(client);
		calendrierField.sendKeys(calendrier);
	}
	
	public ProjectDetails validerProjet() {
		boutonAccepter.click();
		return PageFactory.initElements(driver, ProjectDetails.class);
	}
	
	public void annulerProjet() {
		boutonAnnuler.click();
	}
	
	public String ajouterNJour(int jourPlus) {
		String dateFinale = "";
		int nbLignes = this.driver.findElements(By.xpath("//table[@id='_z_4-mid']/tbody/tr")).size();
		int nbColonnes = driver.findElements(By.xpath("//table[@id='_z_4-mid']/tbody/tr/td")).size();
		
		
		return dateFinale;
	}
}
