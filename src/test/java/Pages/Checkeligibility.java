package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkeligibility {
	
    WebDriver driver;
    JavascriptExecutor js;
	
	public Checkeligibility(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='For Owners']")
	WebElement forowners;
	
	public void clickForOwners() {
        forowners.click();
    }
	
	@FindBy(xpath = "(//span[@data-label='INSIGHTS'])[3]")
	WebElement insights;
	
	public void clickInsights() {
        insights.click();
    }
	
	@FindBy(xpath = "//div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[2]/ul[1]/li[1]/div[1]/ul[1]/li[5]/a[1]")
	WebElement homeloan;
	
	public void clickHomeLoan() {
        homeloan.click();
        
        Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
		    if (!handle.equals(driver.getWindowHandle())) {
		        driver.switchTo().window(handle);
		        break;
		    }
		}
    }
	
	@FindBy(xpath = "//div[normalize-space()='CHECK ELIGIBILITY']")
	WebElement eligibility;
	
	public void clickCheckEligibility() {
        eligibility.click();
    }
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/div/div[2]/form/div[1]/div[4]/div[1]/input")
	WebElement age;
	
	public void enterAge(String YourAge) {
		age.click();
		age.sendKeys(Keys.BACK_SPACE);
		age.sendKeys(Keys.BACK_SPACE);
		age.sendKeys(YourAge);
    }
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/div/div[2]/form/div[1]/div[4]/div[3]/input")
	WebElement income;
	
	public void enterNetIncome(String NetIncome) {
		income.click();
		income.sendKeys(Keys.BACK_SPACE);
		income.sendKeys(Keys.BACK_SPACE);
		income.sendKeys(Keys.BACK_SPACE);
		income.sendKeys(Keys.BACK_SPACE);
		income.sendKeys(Keys.BACK_SPACE);
		income.sendKeys(Keys.BACK_SPACE);
		income.sendKeys(NetIncome);	
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/div/div[2]/form/div[1]/div[4]/div[4]/input")
	WebElement existingemi;
	
	public void enterExistingEMI(String ExistingEMI) {
		existingemi.click();
		existingemi.sendKeys(Keys.BACK_SPACE);
		existingemi.sendKeys(Keys.BACK_SPACE);
		existingemi.sendKeys(Keys.BACK_SPACE);
		existingemi.sendKeys(Keys.BACK_SPACE);
		existingemi.sendKeys(Keys.BACK_SPACE);
		existingemi.sendKeys(ExistingEMI);
    }
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/div/div[2]/form/div[1]/div[5]/div[1]/input")
	WebElement interest;
	
	 public void enterRateOfInterst(String RateOfInterest) {
		    interest.click();
		    interest.sendKeys(Keys.BACK_SPACE);
		    interest.sendKeys(Keys.BACK_SPACE);
		    interest.sendKeys(Keys.BACK_SPACE);
		    interest.sendKeys(RateOfInterest);
	}
	 
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[4]/div/div[2]/form/div[1]/div[5]/div[2]/input")
	WebElement tenture;
	 
	public void enterTenture(String Tenure) {
		tenture.click();
		tenture.sendKeys(Keys.BACK_SPACE);
		tenture.sendKeys(Keys.BACK_SPACE);
		tenture.sendKeys(Tenure);
	}
	 
	@FindBy(xpath = "//*[text()='Calculate']")
	WebElement calculate;
	 
	public void enterCalculate() {
		WebElement a = driver.findElement(By.xpath("//*[text()='Calculate']"));
		a.click();
		
	 } 
}
