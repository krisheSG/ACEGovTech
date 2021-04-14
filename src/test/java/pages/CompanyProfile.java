package pages;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CompanyProfile extends MasterPageWeb{

        public CompanyProfile(WebDriver driver) {
            super(driver);
            this.driver = driver;
        }
private String refID =null;
    @FindBy(xpath = "//a[.='Company Profile']")
    WebElement lnkCompanyProfile;
    @FindBy (id="react-declaration-info_truthfulness_check")
    WebElement chkSubmit;
    @FindBy (id="submit-btn")
    WebElement btnsubmit;
    @FindBy(xpath="//td[contains(text(),'Ref ID:')]/following-sibling::td[1]")
    WebElement lblRefID;
    @FindBy(xpath="//td[contains(text(),'Agency')]/following-sibling::td[1]")
    WebElement lblAgencyDetails;
    @FindBy(xpath = "//a[.='Back to Grant Actions']")
    WebElement lnkBacktoGrantActions;
    @FindBy(xpath = "//a[.='Back to My Grants']")
    WebElement lnkBacktoMyGrants;
    @FindBy(xpath = "//a[contains(@href,'processing')]")
    WebElement tabProcessing;


    public void waitForElement(WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(ele));
    }
    public void highlightele(WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(ele));
        Actions action = new Actions(driver);
        action.moveToElement(ele).build().perform();
    }
    public void highlighteleClickable(WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(ele));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        Actions action = new Actions(driver);
        action.moveToElement(ele).build().perform();
    }
    public void scrollToView(WebElement ele){
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", ele);
    }

    public void clickCompanyProfile() {
        highlighteleClickable(lnkCompanyProfile);
        lnkCompanyProfile.click();
    }
    public void clickchkSubmit() {

        highlighteleClickable(chkSubmit);
        scrollToView(chkSubmit);
        chkSubmit.click();
    }
    public void clickbtnSubmit() {
        highlighteleClickable(btnsubmit);
        scrollToView(btnsubmit);
        btnsubmit.click();
    }
    public String getRefID(){
        return  lblRefID.getText();
    }
    public String getAgencyDetails(){
         return lblAgencyDetails.findElement(By.tagName("span")).getText();
    }

    public void reviewandSubmit(){
        clickCompanyProfile();
        clickchkSubmit();
        clickbtnSubmit();
        refID = getRefID();
        System.out.println(refID);
    }

    public void clickText(WebElement eleSector){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(eleSector));
        wait.until(ExpectedConditions.elementToBeClickable(eleSector));
        if (eleSector.isDisplayed()) {
            eleSector.click();
        }
    }
    public void verifyRefId(String RefID){
      /*  try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement ele = driver.findElement(By.xpath("//*[.='"+ RefID+"']"));
        highlighteleClickable(ele);
        scrollToView(ele);
        wait.until(ExpectedConditions.visibilityOf(ele));

        if (ele.isDisplayed()) {
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }
    }
    public void verifyValue(String str){
        System.out.println(getAgencyDetails());
        Assert.assertTrue(str.equalsIgnoreCase(getAgencyDetails()));
    }
    public void NavigateToDashboard(){
        clickText(lnkBacktoGrantActions);
        clickText(lnkBacktoMyGrants);
    }
    public void setBtnsubmit(WebElement btnsubmit) {
        this.btnsubmit = btnsubmit;
    }
    public void selectProcessing(){
    clickText(tabProcessing);
    }
    public void verifyRefIDvalue(){
        selectProcessing();
        verifyRefId(refID);
    }

}
