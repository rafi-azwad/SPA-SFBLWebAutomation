package SearchPage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RetailerDisplayProgramParticipationPage {
    WebDriver driver;

    public RetailerDisplayProgramParticipationPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectRetailerDisplayProgramParticipation(){
        WebElement participation = new WebDriverWait(driver, Duration.ofSeconds(30)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//a//span[text()='Retailer Display Program Participation']")));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()",participation);
    }

    public void displayParticipationDetails() {

        //Retailer
        WebElement retailer = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='RetailerName']")));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()",retailer);
        retailer.sendKeys(Keys.F9);



        WebElement retailerCode = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()='004670']")));

        Actions actions = new Actions(driver);
        retailerCode.click();
        actions.moveToElement(retailerCode).doubleClick().build().perform();


        //Display Program
        WebElement program = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='DisplayProgramName']")));

        jse.executeScript("arguments[0].click()",program);
        program.click();
        program.sendKeys(Keys.F9);

        WebElement pName = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()='Chopstick lnstant Noodles Display Program 2024']")));
        pName.click();
        actions.doubleClick(pName).build().perform();


        //Participation for month
        WebElement participation = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ParticipationMonthName']")));

        jse.executeScript("arguments[0].click()",participation);
        participation.click();
        participation.sendKeys(Keys.F9);

        WebElement month = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()='January  ']")));

        month.click();
        actions.doubleClick(month).build().perform();


        //Invoice number
        WebElement invoice = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='InvoiceNo']")));

        jse.executeScript("arguments[0].click()",invoice);
        invoice.click();
        invoice.sendKeys(Keys.F9);

       /* WebElement selectInvoice = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()='January  ']")));

        selectInvoice.click();
        actions.doubleClick(selectInvoice).build().perform();*/

    }

    public void displayProgramForSearchAndReport(){

        WebElement program = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='DisplayProgramNameForReport']")));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()",program);


        WebElement programCode = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[text()='44']")));
        // programCode.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(programCode).doubleClick().build().perform();

    }
}
