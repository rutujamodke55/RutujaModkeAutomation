package SeleniumDemo.LocatorInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //driver.findElement(By.id("login1")).sendKeys("rutuja");
        WebElement usernameTextBox = driver.findElement(By.id("login1"));
        usernameTextBox.sendKeys("rutujamodke@gmail.com");
        Thread.sleep(1000);
        driver.close();


    }
}
