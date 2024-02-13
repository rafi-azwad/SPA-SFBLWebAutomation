package SearchPage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DamageStockTransferForReplacementPage {

    String transferQty = "2";
    WebDriver driver;
    public DamageStockTransferForReplacementPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectDamageReplacementSummarySheet(){

        WebElement replacementSummarySheet =  driver.findElement(By.xpath("//span[contains(text(),'Damage Stock Transfer For Replacement')]"));
        JavascriptExecutor js = (JavascriptExecutor)driver; //org.openqa.selenium.ElementClickInterceptedException
        js.executeScript("arguments[0].click()", replacementSummarySheet);
    }

    public void addItem() throws InterruptedException {

        driver.findElement(By.xpath("//a[text()='Add Items']")).click();

        driver.findElement(By.xpath("//input[@name='ProductCode']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='ProductCode']")).sendKeys(Keys.F9);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'AC0105')]")));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; //org.openqa.selenium.ElementClickInterceptedException
        js1.executeScript("arguments[0].click()", we);

        Actions actions1 = new Actions(driver);
        actions1.moveToElement(we).doubleClick().build().perform();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//td//input[@name='Qty']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//td//input[@name='Qty']")).sendKeys(transferQty);
        driver.findElement(By.xpath("//td//input[@name='Qty']")).sendKeys(Keys.ENTER);
    }

    public void addDamagePolicy() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//td[text()='Press (F9)']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//td//input[@name='Remarks']")).sendKeys(Keys.F9);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement we = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()='Less Air']")));
        JavascriptExecutor js1 = (JavascriptExecutor) driver; //org.openqa.selenium.ElementClickInterceptedException
        js1.executeScript("arguments[0].click()", we);


        Actions actions1 = new Actions(driver);
        actions1.moveToElement(we).doubleClick().build().perform();


    }

    public void saveInformation() {

        WebElement saveButton = new WebDriverWait(driver, Duration.ofSeconds(30)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnSave']")));
        saveButton.click();



        
    }

}
