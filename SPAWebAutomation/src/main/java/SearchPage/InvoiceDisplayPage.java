package SearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static SearchPage.OrderRetailerPage.deliveryDate;

public class InvoiceDisplayPage {

    WebDriver driver;

    public static String invoiceNumber = "";
    public InvoiceDisplayPage(WebDriver driver){
        this.driver= driver;
    }

    public void clickInvoiceDisplay(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement invoiceDisplay = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Invoice Display')]")));
        JavascriptExecutor js = (JavascriptExecutor)driver; //org.openqa.selenium.ElementClickInterceptedException
        js.executeScript("arguments[0].click()", invoiceDisplay);
    }
    public void checkAndSelectDeliveryDate(){
        driver.findElement(By.xpath("//input[@id='chkDate']")).click();

        driver.findElement(By.xpath("//input[@id='DeliveryDate']")).click();
        driver.findElement(By.xpath("//a[text()="+deliveryDate+"]")).click(); //delivery date



    }
    public void viewInvoiceDisplay(){
        driver.findElement(By.xpath("//button[@id='btnView']")).click();

        WebElement invoiceNo = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='InvoiceNo']")));
        invoiceNumber = invoiceNo.getText();
        System.out.println("Invoice number is: "+invoiceNumber);

    }

}
