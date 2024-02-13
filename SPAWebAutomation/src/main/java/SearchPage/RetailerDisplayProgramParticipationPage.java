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

    public void displayProgramName(){

        WebElement program = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='DisplayProgramNameForReport']")));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()",program);
        program.sendKeys(Keys.F9);

        WebElement programCode = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()='44']")));

        Actions actions = new Actions(driver);
        actions.doubleClick(programCode).build().perform();

    }
    public void displayParticipationDetails() throws InterruptedException {


        //Retailer
        WebElement retailer = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='RetailerName']")));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()",retailer);
        retailer.sendKeys(Keys.F9);

        Thread.sleep(2000);

        WebElement retailerCode = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()='004670']")));

        Actions actions = new Actions(driver);
        actions.doubleClick(retailerCode).build().perform();



        //Display Program
        WebElement program = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='DisplayProgramName']")));
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()",program);
        program.sendKeys(Keys.F9);

        WebElement pCode = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()='47']")));

        actions.doubleClick(pCode).build().perform();

    }
}
