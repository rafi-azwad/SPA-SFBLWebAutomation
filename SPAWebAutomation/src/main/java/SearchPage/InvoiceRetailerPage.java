package SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static SearchPage.OrderRetailerPage.deliveryDate;
import static SearchPage.OrderRetailerPage.srName;

public class InvoiceRetailerPage {
   public WebDriver driver;

    public InvoiceRetailerPage(WebDriver driver){
        this.driver = driver;
    }
    public void selectInvoiceRetailer(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement invoiceRetailer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Invoice Retailer')]")));
        JavascriptExecutor js = (JavascriptExecutor)driver; //org.openqa.selenium.ElementClickInterceptedException
        js.executeScript("arguments[0].click()", invoiceRetailer);
    }

    public void selectDeliveryDateAndSRName() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='DeliveryDate']")).click();
        driver.findElement(By.xpath("//a[contains(text(),"+deliveryDate+")]")).click();

        Select employeeName = new Select(driver.findElement(By.xpath("//select[@id='SalesRepresentative']")));
        Thread.sleep(1000);
        employeeName.selectByVisibleText(srName);

    }
    public void viewDetails(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement view = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnView']")));
        view.click();


    }
    public void allPosting(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement allPosting = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnAllPosting']")));
        JavascriptExecutor js = (JavascriptExecutor)driver; //org.openqa.selenium.ElementClickInterceptedException
        js.executeScript("arguments[0].click()", allPosting);
    }
}
