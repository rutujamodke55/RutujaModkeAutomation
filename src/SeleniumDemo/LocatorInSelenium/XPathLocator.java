package SeleniumDemo.LocatorInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //RelativeXPath with id attribute
        // WebElement username = driver.findElement(By.xpath("//input[@id='login1']"));
        //username.sendKeys("rutujamodke");

        //RelativeXPath Text function
        //WebElement rediffmailLink = driver.findElement(By.xpath("//a[text()='rediff.com']"));
        //  rediffmailLink.click();

        //RelativeXPath with and/or attribute
        //WebElement username = driver.findElement(By.xpath("//input[@id='login1' and @name='login']"));
        //username.sendKeys("rutujamodke");

        // WebElement username = driver.findElement(By.xpath("//input[@id='login1' or @name='lo']"));
        //   username.sendKeys("rutujamodke");

        //RelativeXPath Starts-With function
        WebElement createNewAccount = driver.findElement(By.xpath("//u[starts-with(text(), 'Create a')]"));
        createNewAccount.click();
        Thread.sleep(2000);
        driver.close();
    }
}

