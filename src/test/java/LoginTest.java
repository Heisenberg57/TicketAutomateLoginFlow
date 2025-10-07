import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

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

        try {
            driver.get("https://www.demoblaze.com/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for the login button and click
            WebElement loginButton = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("login2"))
            );
            loginButton.click();
            //driver.findElement(By.id("login2")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys("suyognim");
            driver.findElement(By.id("loginusername")).sendKeys("suyognim");
            driver.findElement(By.id("loginpassword")).sendKeys("mypass123");
            driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();

            // Wait for the user welcome text
            WebElement welcomeText = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser"))
            );
            Assert.assertEquals(welcomeText.getText(), "Welcome suyognim", "Login succesfull");
            System.out.println();
        } catch (Exception e) {
            Assert.fail("Login test failed: " + e.getMessage());
        } finally {
            driver.quit();


        }

    }
}
