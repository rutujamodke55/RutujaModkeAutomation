package SeleniumDemo.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement textbox = driver.findElement(By.id("displayed-text"));
        WebElement showbtn = driver.findElement(By.id("show-textbox"));
        WebElement hidebtn = driver.findElement(By.id("hide-textbox"));

        System.out.println(textbox.isDisplayed());//True
        hidebtn.click();
        System.out.println(textbox.isDisplayed());//False
        showbtn.click();
        System.out.println(textbox.isDisplayed());//True
        driver.close();
    }
}
