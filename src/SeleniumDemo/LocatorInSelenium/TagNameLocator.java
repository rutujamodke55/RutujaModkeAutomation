package SeleniumDemo.LocatorInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
       List<WebElement> alltag = driver.findElements(By.tagName("input"));
       System.out.println(alltag.size());
       Thread.sleep(2000);
       driver.close();

    }
}
