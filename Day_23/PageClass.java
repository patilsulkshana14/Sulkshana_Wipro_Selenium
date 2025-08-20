package TestNG_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {
	WebDriver driver;
	By email=By.id("userid");
	By pass=By.id("pass");
	By cont=By.id("signin-continue-btn");
	By sub=By.id("sgnBt");
	By search=By.id("gh-ac");
	By prod=By.id("atcBtn_btn_1");
	By allcat=By.id("gh-cat");
	By search1=By.id("gh-search-btn");
	By desc=By.id("gh-ac");
	//By productImage=By.cssSelector("img[src=\"https://i.ebayimg.com/images/g/6u4AAOSwJBRnx-9S/s-l500.webp\"]");
	By acc=By.cssSelector("a[href=\"https://accountsettings.ebay.com/profile\"]");
	By editb=By.id("individual_personal_info_address_edit_button");
	By add1=By.id("addressLine1");
	By city=By.id("city");
	By pin=By.id("postalCode");
	By addsubb=By.id("address_edit_submit_button");    
	By uname=By.id("user-name");
	By editbt=By.xpath("/html/body/div[6]/div/div[3]/div[2]/div/div[2]/button/span[2]");
	By accname=By.xpath("/html/body/div[6]/div/div[3]/div[1]/button");
	By usubmitb=By.id("username_submit_edit_btn");
	
	public PageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void username()
	{
		driver.findElement(email).click();
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys("patilsulkshana1414@gmail.com");
	}
	public void password()
	{
		driver.findElement(pass).click();
		driver.findElement(pass).sendKeys("Sulkshana@14");
	}
	public void continues()
	{
		driver.findElement(cont).click();
	}
	public void submit()
	{
		driver.findElement(sub).click();
	}
	
	public void search() throws InterruptedException
	{
		driver.findElement(search);
		String[] produ= { "Watch", "Phone", "Laptop"};
		for(String s:produ)
		{
			driver.findElement(search).sendKeys(s);
			driver.findElement(search).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(search);
			driver.findElement(search).clear();
		}
	}
	public void card() throws InterruptedException
	{
		  driver.findElement(search);
		  driver.findElement(search).sendKeys("TV");
		  driver.findElement(search).sendKeys(Keys.ENTER); 
		  
		  driver.navigate().to("https://www.ebay.com/itm/134667902375?_skw=tv&itmmeta=01K2XQ66K80K31EG7956MPEFDP&hash=item1f5ad51da7:g:bOcAAOSwdHNl80X9&itmprp=enc%3AAQAKAAAA4FkggFvd1GGDu0w3yXCmi1cnb5%2Bi7IPlhCp49tXK6ObMh97%2BB7%2FA9pDk%2B4hsmxZgm%2F%2BU7F6PDwaG6qg9DSLs2s%2Bx%2B08G3A7Qon%2FJXlOVbE4KFmAOluVJG1fFQ1MO30IDOPjUIsIh%2BBZBnyA5Z%2Bw0BEKvGCm7IW9Vx37bZtiHD4Io82wm8eJHu9vIhSrj31QJ4J99uqb7E0LOc4IvlZh6awEkXxyV1sd1YMp50oQ%2B%2BkcPu7gytZiqGk92ngNl6U0iQ9k9Rz9ou4lppeLJKad7jZ4dPKpi2kfgk%2BGFPKvMxy9w%7Ctkp%3ABFBM3OqYt5dm");
		  
		  driver.findElement(prod).click();
		  
		  driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[6]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[1]/a")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\\\"mainContent\\\"]/div/div[3]/div[1]/div[1]/div[1]/ul/li/div/div/div/div[2]/span[3]/button")).click();
	}
	
	public void shopcate()
	{
		driver.findElement(By.cssSelector("button[aria-controls=\"s0-1-4-12-0-1-dialog\"]")).click();
		  driver.findElement(By.cssSelector("a[href=\"https://www.ebay.com/b/Luxury-Watches/31387/bn_36841947\"]")).click();

	}
	public void allcateg()
	{
		   driver.findElement(allcat).click();
		   By option = By.xpath("//*[@id=\"gh-cat\"]/option[5]");
		    driver.findElement(option).click();
		    driver.findElement(search1).click();
		
	}
	public void lan()
	{
		//driver.navigate().to("https://www.ebay.com");
		Actions act=new Actions(driver); 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2500)");
			
		  WebElement lang=driver.findElement(By.xpath("//*[@id=\"glbfooter\"]/footer/div[1]/div[5]/div[3]/div/div/button"));
		  act.moveToElement(lang).perform();
		  driver.findElement(By.xpath("//*[@id=\"s0-1-5-1-1-18[2[4]]-7-dialog\"]/div/ul/li[41]/a/span")).click();

	}
	public void descr()
	{
		driver.findElement(desc);
		 Actions act=new Actions(driver); 
		 driver.findElement(search).click();;
		 driver.findElement(desc).sendKeys("Lipstick");
		 driver.findElement(desc).sendKeys(Keys.ENTER);
		 
		 WebElement productImage=driver.findElement(By.cssSelector("img[alt=\"Tenue Ultrawear CHOOSE COLOR Duo Ultra New In Box Le Rouge Liquid Lip Colour\"]"));
		 productImage.click();
		 act.contextClick(productImage).perform();
	}
	public void add_username() throws InterruptedException
	{
		
  			driver.get("https://accountsettings.ebay.com/uas");
  			
  			username();
  			Thread.sleep(2000);
  			password();
  			new WebDriverWait(driver, Duration.ofMinutes(1)).until(ExpectedConditions.urlContains("https://accountsettings.ebay.com/uas"));
  			
  			driver.findElement(acc).click();
  			driver.findElement(editb).click();
  			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,2500)");
			
			 
  			driver.findElement(add1);
  			driver.findElement(add1).click();
  			driver.findElement(add1).clear();
  			driver.findElement(add1).sendKeys("ABCD");
  			
  			driver.findElement(city);
  			driver.findElement(city).click();
  			driver.findElement(city).clear();
  			driver.findElement(city).sendKeys("Pune");
  			WebElement stateDropdown = driver.findElement(By.id("stateOrProvince"));

  		    
  		    Select select = new Select(stateDropdown);
  		    
  		    select.selectByVisibleText("Maharashtra");
  		    
  		    driver.findElement(pin);
  		    driver.findElement(pin).click();
  		    driver.findElement(pin).clear();
  		    driver.findElement(pin).sendKeys("411028");
			
			driver.findElement(addsubb).click();
			
			//username
			
			driver.findElement(By.id("user-name")).click();
			driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/div[2]/div/div[2]/button/span[2]")).click();
			driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/div[1]/button")).click();
			
			driver.findElement(uname).click();
			driver.findElement(editbt).click();
			driver.findElement(accname).click();
			
			driver.findElement(uname).click();
			driver.findElement(uname).clear();
			driver.findElement(uname).sendKeys("SPatil_14");
			
			driver.findElement(usubmitb).click();
		
	}
}
