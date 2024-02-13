package SearchPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    public void userNameAndPassword(String userName, String password) {

        driver.findElement(By.xpath("//input[@id='UserID']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);


    }

    public void loginButton() {

       driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
    }

    public void successfullyLogin()  {

        String expect = "Square Food & Beverages Ltd.";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[contains(text(),'Square Food & Beverages Ltd.')]")));
        //WebElement we= driver.findElement(By.xpath("//div[contains(text(),'Welcome to the SPA')]"));
        String actual = we.getText();
        Assert.assertEquals(actual,expect);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual,expect,"Login failed");

        System.out.println("Successfully login -->>>>");

        softAssert.assertAll();
    }

    }




