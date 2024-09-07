package Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Areaunitconverter {
	
    WebDriver driver;
	
	public Areaunitconverter(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='For Owners']")
	WebElement owners;
	
	public void clickOwners() {
        owners.click();
    }
	
	@FindBy(xpath = "(//span[@data-label='INSIGHTS'])[3]")
	WebElement insights;
	
	public void clickInsights() {
        insights.click();
    }
	
	@FindBy(xpath = "//div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/ul[1]/li[2]/div[2]/ul[1]/li[1]/div[1]/ul[1]/li[6]/a[1]")
	WebElement areaunitcheck;
	
	public void clickArea() {
		areaunitcheck.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
		    if (!handle.equals(driver.getWindowHandle())) { 
		        driver.switchTo().window(handle);
		        break;
		    }
		}
    }
	
	@FindBy(xpath = "//input[@class='pageComponent']")
	WebElement state ;
	
	public void clickState() {
        state.click();
    }
	
	@FindBy(xpath = "//div[23]")
	WebElement whichstate;
	
	public void clickWhichState() {
        whichstate.click();
    }
	
	@FindBy(xpath = "//input[@label='From']")
	WebElement entervalue;
	
	public void enterKeyword(String keyword) {
        entervalue.sendKeys("15");
    }
	
	@FindBy(xpath = "//div[@class='comp__dropdownDisplay ']")
	WebElement unitdrop;
	
	public void clickUnitDrop() {
        unitdrop.click();
    }
	
	@FindBy(xpath = "//div[contains(@class,'comp__dropdownList')]//div[1]")
	WebElement whichunit;
	
	public void clickWhichUnit() {
		whichunit.click();
	}
	
	@FindBy(xpath = "(//div[contains(@class,'comp__dropdownDisplay ')])[2]")
	WebElement convertto;
	
	public void clickConvertTo() {
		convertto.click();
    }
	
	@FindBy(xpath = "//div[32]")
	WebElement a;
	
	public void clickValue() {
		a.click();
    }

	@FindBy(xpath = "//div[contains(@class,'acs__exchangeValue')]//img")
	WebElement exchange;
	
	public void clickExchangeConverter() {
        exchange.click();
    }
}
