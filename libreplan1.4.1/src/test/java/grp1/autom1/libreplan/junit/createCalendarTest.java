package grp1.autom1.libreplan.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import grp1.autom1.libreplan.pageobject.calendarListePage;
import grp1.autom1.libreplan.pageobject.homePage;
import grp1.autom1.libreplan.pageobject.loginPage;

public class createCalendarTest {
	



	WebDriver driver;

	public String navig = System.getProperty("navigateur");
	public String port = System.getProperty("port");


	@Before
	public void openBrowser() {

			
		if (navig.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\formation\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			
			else if(navig.equals("IE")) {
				System.setProperty("webdriver.ie.driver", "C:\\Users\\formation\\IEDriverServer.exe");
				driver = new IEDriver();
			}
				
			else if(navig.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\formation\\Desktop\\SUT\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\formation\\chromedriver.exe");
	 //  driver = new ChromeDriver();

		driver.get("http://localhost:8080/libreplan");


	}
	@Ignore
	@After
public void closeBrowser() {
	
	driver.quit();
	
	}

	@Test
	public void Navigation() throws InterruptedException {
	
		loginPage l = PageFactory.initElements(driver, loginPage.class);
		WebElement accesApplication = (new WebDriverWait(driver, 40)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//td[@class='identificacion'][2]")));
		homePage h = l.connexion("admin", "admin");
		WebElement accesCalendrier = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div//span[contains(text(),'Projects Planning')]")));
		calendarListePage c = h.accesAlaPageCalendrier();
		
		WebElement creationCalendrier = (new WebDriverWait(driver, 20)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'Create')]")));
		c.creerUnCalendrier();

		
		assertTrue("la colonne Date n'est pas visible", c.colonneDate.isDisplayed());
		
	}

}
