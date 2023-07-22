package execution;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class AppHooks {
	
	WebDriver driver;
	@Before
	public void init()
	{
		DriverFactory df=new DriverFactory();
		driver=df.initBrowser();
		driver.manage().window().maximize();
		
	}
	
	@After(order=2)
	public void tearDown()
	{
		System.out.println("hi");
	}
	
	@After(order=1)
	public void quitBrowser()
	{
		driver.quit();
	}

}
