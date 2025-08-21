package TestNG_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class Day_19_Q4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.saucedemo.com/"); 
		
		WebElement user=driver.findElement(By.name("user-name")); 
		user.sendKeys("standard_user");
		
		WebElement pass=driver.findElement(By.name("password")); 		
		pass.sendKeys("secret_sauce"); 
		
		driver.findElement(By.name("login-button")).click();
		
		Assert.assertTrue(true, "Login Failed!");
		
		driver.findElement(By.className("bm-burger-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();
        
	}

}