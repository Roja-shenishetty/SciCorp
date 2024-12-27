package stepDefinations;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sciCorp {
	
	public static WebDriver driver;
	String expUrl="https://www.sci-corp.com/";
	@Given("I want to open the browser")
	public void i_want_to_open_the_browser() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("I goto the given url")
	public void i_goto_the_given_url() {
	     driver.get(expUrl);
	}

	@Then("system should redirect to the expected page")
	public void system_should_redirect_to_the_expected_page() {
	
	    String actUrl=driver.getCurrentUrl();
	    try {
			Assert.assertEquals(actUrl, expUrl);
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}

	@When("I click the link DignityMemorial")
	public void i_click_the_link_dignity_memorial() {
	     driver.findElement(By.xpath("(//a[contains(text(),'Dignitymemorial.com')])[1]")).click();
	}

	@Then("System should goto DignityMemeorial")
	public void system_should_goto_dignity_memeorial() {
	Set<String> allWindows=driver.getWindowHandles();
	Object[] windows=allWindows.toArray();
      //  String window1=windows[0].toString();
        String window2=windows[1].toString();
        driver.switchTo().window(window2);
		String exp="https://www.dignitymemorial.com/";
	
	String act=driver.getTitle();
	try {
		Assert.assertEquals(act, exp);
	} catch (AssertionError e) {
		System.out.println(e.getMessage());
	}
	}

	@When("I enter firstName as {string}")
	public void i_enter_first_name_as(String fname) {
	    driver.findElement(By.name("First Name")).sendKeys(fname);
	}

	@When("I enter lastName as {string}")
	public void i_enter_last_name_as(String lname) {
	    driver.findElement(By.name("Last Name")).sendKeys(lname);
	 
	}

	@When("I enter email as {string}")
	public void i_enter_email_as(String email) {
	    driver.findElement(By.name("Email")).sendKeys(email);
	}

	@When("I enter phno as {string}")
	public void i_enter_phno_as(String phno) {
	    driver.findElement(By.name("Phone Number")).sendKeys(phno);
	}
	

	@When("I enter zipcode as {string}")
	public void i_enter_zipcode_as(String zip) {
	   driver.findElement(By.name("ZipCode")).sendKeys(zip);
	}

	@When("I click GetFreeTrial button")
	public void i_click_get_free_trial_button() {
	   driver.findElement(By.xpath("//button[contains(.,'GET A FREE GUIDE & QUOTE')]")).click();
	}

	@Then("I should see the expected page")
	public boolean i_should_see_the_expected_page() {
	   String exp_Title="https://www.dignitymemorial.com/form/pre-need/thank-you-insiders-guide";
	   String act_Title=driver.getCurrentUrl();
	   if (exp_Title.equalsIgnoreCase(act_Title))
	   {
		   return true;
	   }
	   
	else
	{
		
		System.out.println("not matching");
	
	return false;
	}
	}
	   
	}





