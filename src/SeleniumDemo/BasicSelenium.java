package SeleniumDemo;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.ENTER;

public class BasicSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
       driver.findElement(By.id("nav-cart-count-container")).click();
      // driver.findElement(By.id("a-autoid-0-announce")).click();
    //   driver.findElement(By.id("ap_email")).sendKeys("rutuja@gmail.com");
       driver.findElement(By.linkText("Shop today's deals")).click();
       //driver.findElement(By.id("continue")).click();

       // driver.close();
    }
}
