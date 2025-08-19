package TestNG_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_practice_Q2 {
    WebDriver driver;
    PageClass pg;

    @BeforeTest
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        pg = new PageClass(driver);
    }

    @Test(invocationCount = 3)
    public void runSearchMultipleTimes() throws InterruptedException {
        pg.search();   
        System.out.println("Search test executed");
    }
}
