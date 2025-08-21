package TestNG_Project;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_20_Actions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        Actions act = new Actions(driver);

        
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        act.doubleClick(doubleClickBtn).perform();
        System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());

        
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        act.contextClick(rightClickBtn).perform();
        System.out.println(driver.findElement(By.id("rightClickMessage")).getText());

        
        WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        act.click(clickBtn).perform();
        System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());

        
        driver.get("https://demoqa.com/dragabble");
        WebElement dragBox = driver.findElement(By.id("dragBox"));
        act.dragAndDropBy(dragBox, 100, 50).perform();
        System.out.println("Drag performed successfully.");

        driver.quit();
    }
}
