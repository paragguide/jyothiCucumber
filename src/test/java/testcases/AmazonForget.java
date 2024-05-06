package testcases;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonForget extends Hook
{
	@Given("browser {string} is open with url {string}")
	public void browser_is_open_with_url(String string, String string2) {
	    
		openBrowser(string,string2,"ForgetReport");
	}
	@Given("click signin")
	public void click_signin() 
	{
	    signin.click();
	}
	@When("click help and click forget")
	public void click_help_and_click_forget() 
	{
	    help.click();
	    forgetpwd.click();
	}
	@When("enter email in textbox")
	public void enter_email_in_textbox() 
	{
	    uid.sendKeys("paragguide@yahoo.co.in");
	}
	@When("click button")
	public void click_button() 
	{
	    ctnbtn.click();
	}
	@Then("recover password")
	public void recover_password() 
	{
	    System.out.println("done");
	}




}
