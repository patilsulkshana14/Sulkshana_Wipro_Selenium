package TestNG_Project;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day_20_Combined {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions act = new Actions(driver);

        driver.get("https://demoqa.com/dragabble");
        WebElement dragBox = driver.findElement(By.id("dragBox"));
        act.dragAndDropBy(dragBox, 150, 100).perform();
        System.out.println("Drag successful.");

        driver.get("https://demoqa.com/select-menu");
        Select multiSelect = new Select(driver.findElement(By.id("cars")));
        multiSelect.selectByVisibleText("Volvo");
        multiSelect.selectByVisibleText("Saab");
        System.out.println("Selected multiple cars.");

        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("promtButton")).click();
        Alert a1 = driver.switchTo().alert();
        a1.sendKeys("Automation Test");
        System.out.println("Prompt Text: " + a1.getText());
        a1.accept();

        driver.quit();
    }
}
