package SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;

import static SearchPage.InvoiceDisplayPage.invoiceNumber;
import static SearchPage.OrderRetailerPage.deliveryDate;

public class InvoiceReturnFromRetailerPage {

   // public static String invoiceNo = "2402050000015";
    public static String returnQuantity = "1";
    WebDriver driver;
    public InvoiceReturnFromRetailerPage(WebDriver driver){

        this.driver = driver;
    }
    public void selectInvoiceReturn(){
        try {

                driver.findElement(By.xpath("//a//span[text()='Invoice Return From Retailer']")).click();
            }
            catch(Exception e){
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
                WebElement selectInvoice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a//span[text()='Invoice Return From Retailer']")));
                JavascriptExecutor js = (JavascriptExecutor)driver; //org.openqa.selenium.ElementClickInterceptedException
                js.executeScript("arguments[0].click()", selectInvoice);

            }
    }
    public void writeInvoiceNumber() {

        driver.findElement(By.xpath("//input[@id='InvoiceNo']")).sendKeys(invoiceNumber);

    }
    public void returnDate(){
        driver.findElement(By.xpath("//input[@id='ReturnDate']")).click();

        WebElement returnDate = driver.findElement(By.xpath("//a[text()="+deliveryDate+"-1]")); //return date = deliveryDate-1
        JavascriptExecutor js1 = (JavascriptExecutor) driver; //org.openqa.selenium.ElementClickInterceptedException
        js1.executeScript("arguments[0].click()", returnDate);
    }
    public void selectFullOrPartialButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement selectRadioBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='rdbPartialReturn']")));
        JavascriptExecutor js1 = (JavascriptExecutor) driver; //org.openqa.selenium.ElementClickInterceptedException
        js1.executeScript("arguments[0].click()", selectRadioBtn);
    }
    public void writeReturnQty() throws InterruptedException {


/*        WebElement returnQty = new WebDriverWait(driver, Duration.ofSeconds(40)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='ReturnQty']//parent::td")));
        returnQty.click();*/

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement returnQty1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()='0'][2]")));

        returnQty1.click();


        driver.findElement(By.xpath("//input[@name='ReturnQty']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='ReturnQty']")).sendKeys(returnQuantity);


    }
        public void saveReturnQty() {
            driver.findElement(By.xpath("//button[@id='btnSave']")).click();
            driver.findElement(By.xpath("//input[@id='btnSaveConfirmationYes']")).click();

        }


    }
