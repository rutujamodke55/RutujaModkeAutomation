package SeleniumDemo.Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://camposcoffee.com/");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement firstAdElement = driver.findElement(By.xpath("//button[@title = 'Close']"));
        wait.until(ExpectedConditions.elementToBeClickable(firstAdElement));
        driver.close();
    }
}
