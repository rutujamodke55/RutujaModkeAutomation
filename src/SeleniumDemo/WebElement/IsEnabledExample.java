package SeleniumDemo.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement textbox = driver.findElement(By.id("enabled-example-input"));
        WebElement enablebtn = driver.findElement(By.id("enabled-button"));
        WebElement disablebtn = driver.findElement(By.id("disabled-button"));

        System.out.println(textbox.isEnabled());  //True
        disablebtn.click();
        System.out.println(textbox.isEnabled());//False
        enablebtn.click();
        System.out.println(textbox.isEnabled());//True
        driver.close();


    }
}
