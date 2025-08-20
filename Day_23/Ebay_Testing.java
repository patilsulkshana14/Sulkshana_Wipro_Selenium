package TestNG_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Ebay_Testing 
{
	WebDriver driver;
	PageClass pg;
	  @Test(priority=1)
	  
	  public void signin() throws InterruptedException 
	  {
		
		driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a")).click();
		
		
		pg=new PageClass(driver);
		pg.username();
		pg.continues();
		
		
		pg.password();
		pg.submit();
		
	 }
	
//	  @Test(priority=2)
//	    public void search() throws InterruptedException //to search product like Watch, Phone, Laptop
//		{
//			 pg.search();
//		}
	
	  @Test(priority=3)
	  public void addTocard() throws InterruptedException  
		{
		  pg.card();
		}
	  
	  @Test(priority=4)
	  public void shopbycategory() throws InterruptedException
	  {
		  pg.shopcate();
      }
  
	  @Test(priority=5)
	  public void allcategory() throws InterruptedException {
		  pg.allcateg();
		  
	  }

//		 @Test(priority=4)
//		  public void language() throws InterruptedException 
//		 {
//			 pg.lan();
//		 }
		 @Test(priority=6)
		  public void description() throws InterruptedException {
			 Actions act=new Actions(driver); 
			 WebElement desc=driver.findElement(By.id("gh-ac"));
			 desc.sendKeys("Lipstick");
			 desc.sendKeys(Keys.ENTER);
			 WebElement productImage=driver.findElement(By.cssSelector("img[alt=\"Tenue Ultrawear CHOOSE COLOR Duo Ultra New In Box Le Rouge Liquid Lip Colour\"]"));
			 productImage.click();
			 act.contextClick(productImage).perform();
			 //pg.descr();
		  }

	  		@Test(priority=7)
			  public void address_Username() throws InterruptedException {
	  			
	  			driver.get("https://accountsettings.ebay.com/uas");
	  			
	  			WebElement user=driver.findElement(By.id("userid"));
	  			user.click();
	  			user.sendKeys("patilsulkshana1414@gmail.com");
	  			
	  			driver.findElement(By.id("signin-continue-btn")).click();
	  			Thread.sleep(2000);
	  			WebElement pass=driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	  			
	  			pass.sendKeys("Sulkshana@14");
	  			
	  			driver.findElement(By.id("sgnBt")).click();
	  			new WebDriverWait(driver, Duration.ofMinutes(1)).until(ExpectedConditions.urlContains("https://accountsettings.ebay.com/uas"));
	  			
	  			driver.findElement(By.cssSelector("a[href=\"https://accountsettings.ebay.com/profile\"]")).click();
	  			driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
	  			
	  			JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,2500)");
	  			WebElement add1=driver.findElement(By.id("addressLine1"));
	  			add1.click();
	  			add1.clear();
	  			add1.sendKeys("ABCD");
	  			
	  			WebElement city=driver.findElement(By.id("city"));
	  			city.click();
	  			city.clear();
	  			city.sendKeys("Pune");
	  			WebElement stateDropdown = driver.findElement(By.id("stateOrProvince"));
	
	  		    
	  		    Select select = new Select(stateDropdown);
	  		    
	  		    select.selectByVisibleText("Maharashtra");
	  		    
	  		    WebElement pin=driver.findElement(By.id("postalCode"));
	  		    pin.click();
	  		    pin.clear();
				pin.sendKeys("411028");
				
				driver.findElement(By.id("address_edit_submit_button")).click();
				
				//username
				
				driver.findElement(By.id("user-name")).click();
				driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/div[2]/div/div[2]/button/span[2]")).click();
				driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/div[1]/button")).click();
				
				
				WebElement uname=driver.findElement(By.id("user_name"));
				uname.click();
				uname.clear();
				uname.sendKeys("SPatil_14");
				driver.findElement(By.id("username_submit_edit_btn")).click();
			}
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://www.ebay.com");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

  @AfterTest
  public void afterTest() {
  }

}
