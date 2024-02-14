package SearchPage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReplacementSummarySheetPage {
    String replacementQty = "1";

    WebDriver driver;
    public ReplacementSummarySheetPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectReplacementSummarySheet(){

        WebElement replacementSummarySheet =  driver.findElement(By.xpath("//a//span[text()='Replacement Summary Sheet']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; //org.openqa.selenium.ElementClickInterceptedException
        js.executeScript("arguments[0].click()", replacementSummarySheet);
    }
    public void selectMarketName() throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='MarketName']")).sendKeys(Keys.F9);

        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.doubleClick(driver.findElement(By.xpath("//td[text()='Mirpur-2 (Radhuni)']"))).build().perform();


    }
    public void selectReplacementCause(){

        WebElement marketName = new WebDriverWait(driver, Duration.ofSeconds(30)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='CauseType']")));

        Select select = new Select(marketName);
        select.selectByVisibleText("Regular Policy");
    }

    public void selectProduct() throws InterruptedException {

        WebElement marketName = new WebDriverWait(driver, Duration.ofSeconds(30)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnAddSingle']")));
        marketName.click();

        driver.findElement(By.xpath("//input[@name='ProductCode']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='ProductCode']")).sendKeys(Keys.F9);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement item = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'Radhuni Kasundi')]")));
        JavascriptExecutor js = (JavascriptExecutor)driver; //org.openqa.selenium.ElementClickInterceptedException
        js.executeScript("arguments[0].click()", item);

        Actions actions = new Actions(driver);
        actions.moveToElement(item).doubleClick().build().perform();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//td[@class='CalculationNeeded']")).click();
        driver.findElement(By.xpath("//td//input[@name='Qty']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//td//input[@name='Qty']")).sendKeys(replacementQty);

    }

    public void saveInformation() {

        WebElement saveSelective = new WebDriverWait(driver, Duration.ofSeconds(30)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Save Selective']")));
        saveSelective.click();

        
    }

}
