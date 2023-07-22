package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver ;
	
	@FindBy(xpath="//*[text()='Women']")WebElement women ;
	@FindBy(xpath="(//*[text()='Tops'])[1]")WebElement tops;
	@FindBy(xpath="(//*[text()='Jackets'])[1]")WebElement jackets ;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public void validateWomen() throws InterruptedException
	{
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.elementToBeClickable(women));
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();
		
	}
	
	public void validateTops()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(tops));
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		act.moveToElement(tops).perform();
	}
	
	public void validateJackets()
	{
		jackets.click();
	}

}
