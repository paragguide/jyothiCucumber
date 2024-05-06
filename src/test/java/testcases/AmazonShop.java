package testcases;

import java.util.Iterator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonShop 
{
	public boolean flag = false;
	
	@Given("user in logged in")
	public void user_in_logged_in()
	{
		if(AmazonPasswordTest.login == true)
		{
			flag = true;
		}
	}
	
	@When("^i search product (.*) in range (.*)")
	public void i_search_product_in_range(String product,int price)
	{
		if(flag == true)
		{
			Hook.searchbox.clear();
			Hook.searchbox.sendKeys(product);
			  Actions a = new Actions(Hook.driver);
			  a.sendKeys(Keys.ENTER).perform();
			  
			  Hook.logger.log(Status.PASS, MarkupHelper.createLabel( " searching   "+product, ExtentColor.GREEN));
		      
		}
	}
	
	@Then("results come")
	public void results_come()
	{
		Iterator <WebElement> it =  Hook.searchresult.iterator();
		 
		 while(it.hasNext())
		 {
			WebElement e = it.next();
			System.out.println(e.getText());
			Hook.logger.log(Status.INFO, MarkupHelper.createLabel( e.getText(), ExtentColor.ORANGE));
		      
		 }
		
		// Hook.driver.quit();
		//  Hook.extent.flush();
	}

}
