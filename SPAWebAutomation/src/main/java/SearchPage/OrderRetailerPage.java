package SearchPage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;

public class OrderRetailerPage {
    WebDriver driver;


    public static String deliveryDate ="15";
    public static String srName ="Md. Mamun Shekh | 00004195";
    public static String orderQty ="3";
    public OrderRetailerPage (WebDriver driver){
        this.driver = driver;
    }
    public void clickTransaction(){
        //driver.findElement(By.xpath("//span[contains(text(),'Transaction')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement transaction = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Transaction')]")));
        JavascriptExecutor js = (JavascriptExecutor)driver; //org.openqa.selenium.ElementClickInterceptedException
        js.executeScript("arguments[0].click()", transaction);
    }
    public void selectOrderRetailer(){
        WebElement orderRetailer =  driver.findElement(By.xpath("//span[text()='Order Retailer']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; //org.openqa.selenium.ElementClickInterceptedException
        js.executeScript("arguments[0].click()", orderRetailer);

        //driver.findElement(By.xpath("//span[text()='Order Retailer']")).click();
    }

    public void selectRequiredInformation() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='OrderDate']")).click();
        driver.findElement(By.xpath("//a[text()="+deliveryDate+"]")).click(); //delivery date

        Select orderType = new Select(driver.findElement(By.xpath("//select[@id='InvoiceType']")));
        Thread.sleep(1000);
        orderType.selectByVisibleText("Normal");

        Select marketName = new Select(driver.findElement(By.xpath("//select[@id='MarketCode']")));
        Thread.sleep(1000);
        marketName.selectByVisibleText("Mirpur-1 (Radhuni) | 0803");

        Select employeeName = new Select(driver.findElement(By.xpath("//select[@id='EmployeeCode']")));
        Thread.sleep(1000);
        employeeName.selectByVisibleText(srName);

        Select routeName = new Select(driver.findElement(By.xpath("//select[@id='RouteCode']")));
        Thread.sleep(1000);
        routeName.selectByVisibleText("Nobaber bug | 008288");

        Select retailerName = new Select(driver.findElement(By.xpath("//select[@id='RetailerCode']")));
        Thread.sleep(1000);
        retailerName.selectByValue("026261");

        //add item

        driver.findElement(By.xpath("//a[text()='Add Items']")).click();

        driver.findElement(By.xpath("//input[@name='ProductCode']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='ProductCode']")).sendKeys(Keys.F9);

        Thread.sleep(3000);
        WebElement scroll= driver.findElement(By.xpath("//div[@id='ProductPopupListWindow']"));
        scroll.sendKeys(Keys.PAGE_DOWN);

        Thread.sleep(1000);
        driver.findElement(By.xpath("//li//a[text()='7']")).click();



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[contains(text(),'BC0350')]")));
        JavascriptExecutor js1 = (JavascriptExecutor)driver; //org.openqa.selenium.ElementClickInterceptedException
        js1.executeScript("arguments[0].click()", product);

        Actions actions1 = new Actions(driver);
        actions1.moveToElement(product).doubleClick().build().perform();
        //actions1.moveToElement(we).doubleClick().build().perform();

        try {

            driver.findElement(By.name("OrderQty")).click();
            driver.findElement(By.name("OrderQty")).sendKeys(orderQty);
        }
        catch (Exception e) {

           /* Thread.sleep(2000);
            WebElement orderQty = driver.findElement(By.xpath("//input[@name='OrderQty']"));
            JavascriptExecutor js = (JavascriptExecutor) driver; //org.openqa.selenium.ElementClickInterceptedException
            js.executeScript("arguments[0].click()", orderQty);*/
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@name='OrderQty']")).sendKeys(orderQty);
        }
    }

    public void saveInformation() {



        try{
            driver.findElement(By.xpath("//button[@id='btnSave']")).click();
    }
        catch (Exception e){
            WebElement save = driver.findElement(By.xpath("//button[@id='btnSave']"));
            JavascriptExecutor js1 = (JavascriptExecutor) driver; //org.openqa.selenium.ElementClickInterceptedException
            js1.executeScript("arguments[0].click()", save);
        }

    }
}
