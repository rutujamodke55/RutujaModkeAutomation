package SeleniumDemo.ScreenshotDemo;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.logging.FileHandler;

public class ScreenshotExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      //  FileHandler.copy(f,new File("C:\\Users\\admin\\Documents\\RutujaM"));
        driver.close();

    }
}
