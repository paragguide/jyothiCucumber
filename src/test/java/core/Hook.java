package core;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hook extends Page
{
	public void openBrowser(String browser,String url,String reportname)
	{
		super.openBrowser(browser, url, reportname);
	}
      // login
	@FindBy(xpath = externalxpath.AmazonXpath.signin)
	public static WebElement signin;
	
	@FindBy(xpath = externalxpath.AmazonXpath.uid)
	public static WebElement uid;
	
	@FindBy(xpath = externalxpath.AmazonXpath.ctnbtn)
	public static WebElement ctnbtn;
	
	@FindBy(xpath = externalxpath.AmazonXpath.err1)
	public static WebElement err1;
	
	@FindBy(xpath = externalxpath.AmazonXpath.pwd)
	public static WebElement pwd;
	
	@FindBy(xpath = externalxpath.AmazonXpath.submit)
	public static WebElement submit;
	
	@FindBy(xpath = externalxpath.AmazonXpath.err2)
	public static WebElement err2;
	
	// search
	@FindBy(xpath = externalxpath.AmazonXpath.searchbox)
	public static WebElement searchbox;
	
	@FindBy(xpath = externalxpath.AmazonXpath.searchresult)
	public static List <WebElement> searchresult;
	
	// forget
	@FindBy(xpath = externalxpath.AmazonXpath.help)
	public static WebElement help;
	
	@FindBy(xpath = externalxpath.AmazonXpath.forgetpwd)
	public static WebElement forgetpwd;
	
}
