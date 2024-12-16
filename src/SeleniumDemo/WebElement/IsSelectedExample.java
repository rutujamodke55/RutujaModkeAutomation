package SeleniumDemo.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement radiobtn = driver.findElement(By.id("bmwradio"));
        System.out.println(radiobtn.isSelected()); //false
        radiobtn.click();
        System.out.println(radiobtn.isSelected());// True
        driver.close();


    }
}
