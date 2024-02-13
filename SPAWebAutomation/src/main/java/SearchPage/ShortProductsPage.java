package SearchPage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShortProductsPage {

    String shortQty = "2";
    WebDriver driver;
    public ShortProductsPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectShortProducts(){
        WebElement shortProducts = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//a//span[text()='Short Products']")));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", shortProducts);
    }
    public void addItems() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Add Items']")).click();

        driver.findElement(By.xpath("//input[@name='ProductCode']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='ProductCode']")).sendKeys(Keys.F9);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'BC0350')]")));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; //org.openqa.selenium.ElementClickInterceptedException
        js1.executeScript("arguments[0].click()", product);

        Actions actions1 = new Actions(driver);
        actions1.moveToElement(product).doubleClick().build().perform();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='Qty']")).sendKeys(shortQty);
    }

    public void saveShortProducts(){
        WebElement save = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnSave']")));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", save);
    }

}
