package SeleniumDemo.DatePickerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePickerExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.className("demo-picker")));

        driver.findElement(By.id("datepicker")).click();
        Thread.sleep(2000);
        String date = "10";

        List<WebElement> allElements = driver.findElements(By.xpath("//table[@class='ui-datepicker-calender']//following::td//a"));
        for (WebElement e : allElements) {
            if (e.getText().equals(date)) {
                e.click();
                break;
            }
        }
        Thread.sleep(3000);
        driver.close();
    }
}

