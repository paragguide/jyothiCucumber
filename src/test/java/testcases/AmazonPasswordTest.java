package testcases;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonPasswordTest 
{
	public static boolean flag,login = false;
	
	@Given("userid is valid")
	public void userid_is_valid() 
	{
	    if(AmazonUidTest.email == true)
	    {
	    	flag = true;
	    }
	}
	@When("i enter password {string}")
	public void i_enter_password(String pd) 
	{
	    if(flag == true)
	    {
	    	Hook.pwd.sendKeys(pd);
	    	Hook.submit.click();
	    	Hook.logger.log(Status.PASS, MarkupHelper.createLabel( " entered password  ", ExtentColor.GREEN));

	    }
	}
	@Then("i should login")
	public void i_should_login() 
	{
		  try {
	   String e2 =  Hook.err2.getText();
		  }
		  catch(Exception e)
		  {
			  login = true;
			  Hook.logger.log(Status.PASS, MarkupHelper.createLabel( " logged in  ", ExtentColor.GREEN));

		  }
	}

}
