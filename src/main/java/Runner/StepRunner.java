package Runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepRunner {
	
	WebDriver driver;
	
	@Given("^User is on amazon Home Page$")
	public void user_is_on_amazon_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\T\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	   driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&switch_account=");
	   String title=driver.getTitle();
	   Assert.assertEquals("Amazon Sign In", title);
	
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("meravali143@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("valimeera");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	   String title= driver.getTitle();
	   Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more", title);
	   System.out.println(title);
		
	}

	@Then ("^user search books and click on Search button$")
	public void user_search_books_and_click_on_Search_button() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("books");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
	
	}

}
