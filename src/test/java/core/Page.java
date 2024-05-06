package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Page 
{
	public static WebDriver driver = null;
	  
	  public static ExtentSparkReporter spark;
		public static ExtentReports extent;
		public static ExtentTest logger;
		 
		
	  public void openBrowser(String browser,String url,String reportname) 
	  {
		  
			  // extent report..
			  extent = new ExtentReports();
			  spark = new ExtentSparkReporter( System.getProperty("user.dir")+"//src//test//java//reports//"+reportname+".html" );
			  extent.attachReporter(spark);
			  spark.config().setDocumentTitle(reportname);
	          // Name of the report
	spark.config().setReportName(reportname);
	          // Dark Theme
	spark.config().setTheme(Theme.STANDARD);

			  
			  // open browser
			  if(browser.equalsIgnoreCase("chrome"))
				{
					driver = new ChromeDriver();
				}
				else if(browser.equalsIgnoreCase("edge"))
				{
					driver = new EdgeDriver();
				}
				else if(browser.equalsIgnoreCase("firefox"))
				{
					driver = new FirefoxDriver();
				}
				
				driver.navigate().to(url); // recommend -> can go back/forward/refresh
				
				PageFactory.initElements(driver, this); // to read external xpath
				
				// implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				driver.manage().window().maximize();
		  
	  }

	 
	  public void closeBrowser() 
	  {
		  driver.quit();
		  extent.flush();
	  }


}
