import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-save-password-bubble");
//        options.addArguments("--disable-popup-blocking");
//        options.addArguments("--disable-notifications");
//        options.addArguments("--disable-blink-features=AutomationControlled");
//        options.addArguments("--password-store=basic");
//        options.addArguments("--no-default-browser-check");
//        options.addArguments("--disable-features=PasswordLeakDetection");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");
        driver.findElement(By.id("login2")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("loginusername")).sendKeys("suyognim");
        driver.findElement(By.id("loginpassword")).sendKeys("mypass123");
        driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
        Thread.sleep(3000);


        try {
            Assert.assertEquals("Welcome suyognim", driver.findElement(By.id("nameofuser")).getText(), "Login succesfull");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }

}
