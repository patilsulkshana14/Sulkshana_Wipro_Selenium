package TestNG_Project;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Day_20_Select {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");

        
        Select oldSelect = new Select(driver.findElement(By.id("oldSelectMenu")));
        oldSelect.selectByVisibleText("Blue");
        System.out.println("Selected: " + oldSelect.getFirstSelectedOption().getText());

        Select multiSelect = new Select(driver.findElement(By.id("cars")));
        multiSelect.selectByVisibleText("Green");
        multiSelect.selectByIndex(3); // Yellow
        multiSelect.selectByVisibleText("Black");

        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.print("Selected multiple: ");
        for (WebElement opt : selectedOptions) {
            System.out.print(opt.getText() + " ");
        }

        driver.quit();
    }
}
