package Pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArticlePages {
	
    WebDriver driver;
    JavascriptExecutor js;
	
	public ArticlePages(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='For Owners']")
	WebElement owners;
	
	public void ForOwners() {
        owners.click();
    }
	
	@FindBy(xpath = "(//span[@data-label='ARTICLES & NEWS'])[3]")
	WebElement news;
	
	public void ArticlesandNews() {
        news.click();
    }
	
	@FindBy(xpath = "//a[text()='Seller Guide']")
	WebElement guide;
	
	public void SellerGuide() {
		guide.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
		    if (!handle.equals(driver.getWindowHandle())) {
		        driver.switchTo().window(handle);
		        break;
		    }
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
	
	@FindBy(xpath = "//a[normalize-space()='How to price your property right?']")
	WebElement search;
	
	public void SearchAny() {
		js.executeScript("arguments[0].click();", search);
	}
	
	@FindBy(xpath = "//div[@id='respond187167']//textarea[@id='comment']")
	WebElement issue;
	
	@FindBy(xpath = "//a[normalize-space()='How to price your property right?']")
	WebElement select;
	
	public void TypeOfIssue() throws InterruptedException {
		
		driver.manage().deleteAllCookies();
		select.click();
	Thread.sleep(2000);
	js.executeScript("arguments[0].scrollIntoView(true);", issue);
		issue.sendKeys("This website is totally a waste of time so don't try to post anything");
	}
	
	@FindBy(xpath = "//div[@id='respond187167']//input[@id='author']")
	WebElement author;
	
	public void AuthorName() {
		author.sendKeys("Pranesh Kumar");
	}
	
	@FindBy(xpath = "//div[@id='respond187167']//input[@id='email']")
	WebElement email;
	
	public void EnterEmail() {
		email.sendKeys("praneshkumar@gmail.com");
	}
	
	@FindBy(xpath = "//div[@class='text-right']//button")
	WebElement post;
	
	public void PostComment() {
		js.executeScript("arguments[0].click()", post);
		
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		System.out.println(s);
		a.accept();
	}
}
