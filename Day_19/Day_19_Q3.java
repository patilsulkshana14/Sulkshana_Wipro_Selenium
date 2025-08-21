package TestNG_Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_19_Q3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/"); 
		
		WebElement user=driver.findElement(By.name("user-name")); 
		user.sendKeys("standard_user");		
		WebElement pass=driver.findElement(By.name("password")); 		
		pass.sendKeys("secret_sauce"); 		
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);    
		WebElement search = driver.findElement(By.linkText("Sauce Labs Backpack"));
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click(); 
		
		Thread.sleep(2000);
		WebElement clk = driver.findElement(By.xpath("a[data-test=\\\"shopping-cart-link\\\"]"));
		act.click(clk).perform();
		System.out.println("Item Added and Displayed Sucessfully");    
		
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);

		WebElement fname = driver.findElement(By.id("first-name"));
		fname.sendKeys("Sulkshana");
		WebElement lname = driver.findElement(By.id("last-name"));
		lname.sendKeys("Patil");	
		WebElement code = driver.findElement(By.id("postal-code"));
		lname.sendKeys("404508");	
		Thread.sleep(2000);

		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);

		driver.close();
	}
		
		
	}