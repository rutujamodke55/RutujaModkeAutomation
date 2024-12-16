package SeleniumDemo.LocatorInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        //SendKeys method
        WebElement usernametext = driver.findElement(By.cssSelector("input[id='login1']"));
        usernametext.sendKeys("rutujamodke");

        //tagName Method
        System.out.println(usernametext.getTagName());

        //GetAttributeMethod
        System.out.println(usernametext.getAttribute("id"));
        Thread.sleep(2000);

        //clear method
       usernametext.clear();
        Thread.sleep(2000);

        //Submit method
        WebElement signinBtn = driver.findElement(By.className("signinbtn"));
        signinBtn.submit();
        Thread.sleep(2000);



    }
}
