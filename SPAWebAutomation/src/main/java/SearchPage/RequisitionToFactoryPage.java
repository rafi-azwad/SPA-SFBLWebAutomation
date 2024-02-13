package SearchPage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RequisitionToFactoryPage {

    String boxes = "2";
    WebDriver driver;
    public RequisitionToFactoryPage(WebDriver driver){
        this.driver = driver;
    }
    public void selectRequisitionToFactory(){
        WebElement requisitionToFactory =  driver.findElement(By.xpath("//span[text()='Requisition To Factory']"));
        JavascriptExecutor js = (JavascriptExecutor)driver; //org.openqa.selenium.ElementClickInterceptedException
        js.executeScript("arguments[0].click()", requisitionToFactory);

    }
    public void addItems() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Add Items']")).click();
       /* WebElement addItems = new WebDriverWait(driver, Duration.ofSeconds(30)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='ProductCode']")));
        addItems.sendKeys(Keys.F9);*/

        driver.findElement(By.xpath("//input[@name='ProductCode']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='ProductCode']")).sendKeys(Keys.F9);

        Thread.sleep(1000);

        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(By.xpath("//td[text()='AC0105']"))).build().perform();

    }
    public void writeBoxes(){
        driver.findElement(By.xpath("//input[@name='RequisitionBox']")).sendKeys(boxes);
    }

    public void saveInformation(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-350)");
        driver.findElement(By.xpath("//button[@id='btnSave']")).click();
        WebElement search = new WebDriverWait(driver, Duration.ofSeconds(30)).
                until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnSearch']")));
        search.click();


    }



}
