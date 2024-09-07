package StepDefinition;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.Areaunitconverter;
import Pages.ArticlePages;
import Pages.Checkeligibility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
	
	WebDriver driver;
	JavascriptExecutor js;
	
	ArticlePages art;
	Areaunitconverter acu;
	Checkeligibility che;
	
	// Area unit converter
	
	@Given("user is on the 99acres homepage")
	public void user_is_on_the_99acres_homepage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.99acres.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		art = new ArticlePages(driver);
		acu = new Areaunitconverter(driver);
		che = new Checkeligibility(driver);
	}
	
	@When("user navigate to For Owners tab")
	public void user_navigate_to_for_owners_tab() {
		acu.clickOwners();
	   
	}

	@When("user click the area unit converter option under insights")
	public void user_click_the_area_unit_converter_option_under_insights() {
		acu.clickInsights();
		acu.clickArea();
		
	   
	}

	@When("user click state details")
	public void user_click_state_details() {
	    acu.clickState();
	    acu.clickWhichState();
	}

	@When("user click select unit for From")
	public void user_click_select_unit_for_from() {
		acu.enterKeyword("15");
		acu.clickUnitDrop();
	    
	}

	@When("user enter value for From")
	public void user_enter_value_for_from() {
		acu.clickWhichUnit();
		acu.clickConvertTo();
	   
	}

	@When("user click select unit for To")
	public void user_click_select_unit_for_to() {
		acu.clickValue(); 
	}

	@Then("results should be displayed")
	public void results_should_be_displayed() {
		acu.clickExchangeConverter();
	     
	}
	
	// Reading article and posting a comment
	
	@When("user navigates to the For Owners tab")
	public void user_navigates_to_the_for_owners_tab() {
	    art.ForOwners();
	}

	@When("user click articles and news")
	public void user_click_articles_and_news() {
		art.ArticlesandNews();
	    
	}

	@When("user click seller guide under articles")
	public void user_click_seller_guide_under_articles() {
		art.SellerGuide();
	    
	}

	@When("user enter comment")
	public void user_enter_comment() throws InterruptedException {
		art.TypeOfIssue();
	   
	}

	@When("user enter name and email")
	public void user_enter_name_and_email() {
		art.AuthorName();
		art.EnterEmail();
	    
	}

	@Then("Alert message should be displayed")
	public void alert_message_should_be_displayed() {
		art.PostComment();
	    
	}
	
	// check eligibility for home loans
	
	@When("user navigate to the For Owners tab")
	public void user_navigate_to_the_for_owners_tab() {
		che.clickForOwners();
	    
	}

	@When("user click the Home loan tools option under the Insights")
	public void user_click_the_home_loan_tools_option_under_the_insights() {
		che.clickInsights();
		che.clickHomeLoan();
	    
	}

	@When("user click check eligibility")
	public void user_click_check_eligibility() {
		che.clickCheckEligibility();
	    
	}

	@When("user enter age as <{string}>")
	public void user_enter_age_as(String YourAge) {
		che.enterAge(YourAge);
	    
	}

	@When("user enter income as <{string}>")
	public void user_enter_income_as(String NetIncome) {
		che.enterNetIncome(NetIncome);
	    
	}

	@When("user enter existing emi as <{string}>")
	public void user_enter_existing_emi_as(String ExistingEMI) {
		che.enterExistingEMI(ExistingEMI);
	    
	    
	}

	@When("user enter interest as <{string}>")
	public void user_enter_interest_as(String RateOfInterest) {
		che.enterRateOfInterst(RateOfInterest);
	    
	}

	@When("user enter tenture as <{string}>")
	public void user_enter_tenture_as(String Tenure) {
		che.enterTenture(Tenure);
	    
	}
	
	@Then("Estimated results should be displayed after calculating")
	public void estimated_results_should_be_displayed_after_calculating() {
		che.enterCalculate();
	    
	}
}
