package testcases;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonUidTest extends Hook
{
	public static boolean email = false;
	
	@Given("I open {string} browser wuth url {string} make report {string}")
	public void i_open_browser_wuth_url_make_report(String browser, String url,String report) 
	{
		
	    openBrowser(browser,url,report);
	    logger = extent.createTest("Login Test");

	}
	@Given("i click sign in link")
	public void i_click_sign_in_link() 
	{
	   signin.click();
	}
	@When("I enter valid userid {string}")
	public void i_enter_valid_userid(String username) 
	{
	    uid.sendKeys(username);
	}
	@When("click continue button")
	public void click_continue_button() 
	{
	    ctnbtn.click();
	}
	@Then("I validate the userid is correct")
	public void i_validate_the_userid_is_correct() 
	{
		   try {
	 String e =   err1.getText();
	    logger.log(Status.FAIL, MarkupHelper.createLabel( " userid is valid but error showing "+e, ExtentColor.RED));

		   }
		   catch(Exception e)
		   {
			   logger.log(Status.PASS, MarkupHelper.createLabel( " userid is valid ", ExtentColor.GREEN));
	            email = true;
		   }
	}

}
