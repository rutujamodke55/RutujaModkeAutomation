package SeleniumDemo.LocatorInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //By the CSS selector with id attribute
        WebElement usernametext = driver.findElement(By.cssSelector("input[id='login1']"));
        //id replace by # //input#login1
        usernametext.sendKeys("rutujamodke");

        //by the css selector with class attribute
        WebElement signBtn = driver.findElement(By.cssSelector("input[class='signinbtn']"));
        // input.signinbtn  // we can also used
        //class replace by.
        signBtn.click();
        Thread.sleep(2000);
        driver.close();

    }
}
