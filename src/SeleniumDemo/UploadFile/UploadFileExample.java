package SeleniumDemo.UploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement browsBtn = driver.findElement(By.id("file-upload"));
        browsBtn.sendKeys("C:\\Users\\admin\\Documents");

        WebElement uploadedMsg = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        if(uploadedMsg.getText().equalsIgnoreCase("File Uploaded")){
            System.out.println("File is uploaded successfully");
        }else {
            System.out.println("File is not uploaded");
        }
        driver.close();
    }
}
