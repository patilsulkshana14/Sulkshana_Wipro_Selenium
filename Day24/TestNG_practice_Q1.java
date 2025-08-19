package TestNG_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_practice_Q1 
{
	WebDriver driver;
    PageClass pg;
    
  @Test(priority = 1, enabled = true)
  public void signin() throws InterruptedException 
  {
	  driver.findElement(By.xpath("//*[@id=\"gh\"]/nav/div[1]/span[1]/span/a")).click();

      pg = new PageClass(driver);
      pg.username();
      pg.continues();
      Thread.sleep(2000);
      pg.password();
      pg.submit();
      System.out.println("Signin test executed");
  }
  @Test(priority = 2, enabled = false)
  public void addTocard() throws InterruptedException 
  {
	  pg.card();
      System.out.println("Add to Cart test disabled");

  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
      driver = new ChromeDriver();
      driver.get("https://www.ebay.com");
      driver.manage().window().maximize();
      Thread.sleep(2000);
  }
}
