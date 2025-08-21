package TestNG_Project;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Day_20_Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();
        Alert a1 = driver.switchTo().alert();
        System.out.println("Alert Text: " + a1.getText());
        a1.accept();

        driver.findElement(By.id("confirmButton")).click();
        Alert a2 = driver.switchTo().alert();
        System.out.println("Confirm Alert Text: " + a2.getText());
        a2.dismiss();

        driver.findElement(By.id("promtButton")).click();
        Alert a3 = driver.switchTo().alert();
        System.out.println("Prompt Alert Text: " + a3.getText());
        a3.sendKeys("Neeva Sharma");
        a3.accept();

        driver.findElement(By.id("timerAlertButton")).click();
        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(6));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert a4 = driver.switchTo().alert();
        System.out.println("Timer Alert Text: " + a4.getText());
        a4.accept();

        driver.quit();
    }
}
