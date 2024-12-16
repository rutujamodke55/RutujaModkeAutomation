package SeleniumDemo.LocatorInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        WebElement CreateNewAccountLink = driver.findElement(By.partialLinkText("Create a"));
        CreateNewAccountLink.click();
        Thread.sleep(2000);
        driver.close();
    }

}
