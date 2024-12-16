package SeleniumDemo.Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class FetchSingleCookiesExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();
        Cookie adCookie = new Cookie("Company,", "Edso Services");
        driver.manage().addCookie(adCookie);
        System.out.println("//-----------fetch the single Cookie of company-------//");
        driver.manage().getCookieNamed("Company");
       /* Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie c : allCookies)
            System.out.println(c)*/;
        driver.close();
    }
}
