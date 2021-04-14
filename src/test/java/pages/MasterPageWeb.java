package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MasterPageWeb {

    WebDriver driver;

    protected MasterPageWeb(WebDriver driver) {
       this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = driver1 -> ((JavascriptExecutor) driver1).executeScript("return document.readyState").equals("complete");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }

   /* public void highlightele(WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ele));
        Actions action = new Actions(driver);
        action.moveToElement(ele).build().perform();
    }*/


}
