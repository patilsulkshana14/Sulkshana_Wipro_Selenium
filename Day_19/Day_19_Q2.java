package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_19_Q2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/"); 
			
		WebElement user=driver.findElement(By.name("user-name")); 
		user.sendKeys("standard_user");		
		WebElement pass=driver.findElement(By.name("password")); 		
		pass.sendKeys("secret_sauce"); 		
		driver.findElement(By.name("login-button")).click();
		
		WebElement search = driver.findElement(By.linkText("Sauce Labs Backpack"));
		search.sendKeys(Keys.ENTER);
		
		Actions act = new Actions(driver);    
		driver.findElement(By.id("add-to-cart")).click(); 
		
		WebElement clk = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
		act.click(clk).perform();
		
		driver.close();

	}

}