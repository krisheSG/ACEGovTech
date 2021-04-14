package pages;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefinitions.MasterStepDefs;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class BGPHomePage extends MasterPageWeb {

    public BGPHomePage(WebDriver driver) {
        super(driver);
       this.driver=driver;
    }
    @FindBy(id="login-button")
    WebElement btnLogin_BGP;

    @FindBy(name="CPUID")
    WebElement txtNRIC;

    @FindBy(name="CPUID_FullName")
    WebElement txtName;

    @FindBy(name="CPEntID")
    WebElement txtUEN;

    @FindBy(xpath="(//button[@type='submit'])[2]")
    WebElement btnLogin;

    @FindBy(xpath = "//input[@type='login-button']")
    WebElement btnFile;

    @FindBy(xpath = "//h4[contains(.,'Get new grant')]")
    WebElement txtGetnewgrant;

    @FindBy(xpath = "//button[contains(.,'Next')]")
    WebElement btnNextSelectGrant;

    @FindBy(id="go-to-grant")
    WebElement btnApply;

    @FindBy(id="keyPage-form-button")
    WebElement btnProceed;

    @FindBy(id="save-btn")
    WebElement btnSave;

    @FindBy(id="react-contact_info-name")
    WebElement txtContactInfoName;

    @FindBy(id="react-contact_info-designation")
    WebElement txtcontactinfodesignation;

    @FindBy(id="react-contact_info-phone")
    WebElement txtcontactinfophone;

    @FindBy(id="react-contact_info-primary_email")
    WebElement txtcontactinfoprimaryemail;

    @FindBy(id="react-contact_info-secondary_email")
    WebElement txtcontactinfosecondaryemail;

   /* @FindBy(xpath = "//a[contains(@href,'contact_info')]")
    WebElement lnkContactInfo;*/



    private final String NoMessageVal = "The applicant may not meet the eligibility criteria for this grant. Visit FAQ page for more information on other government grants.";



    public void setNRIC(String strNRIC) {
        txtNRIC.clear();
        txtNRIC.sendKeys(strNRIC);
    }
    public void setName(String strName) {
        txtName.clear();
        txtName.sendKeys(strName);
    }
    public void setUEN(String strUEN) {
        txtUEN.clear();
        txtUEN.sendKeys(strUEN);
    }
    public void setContactInfoName(String strUEN) {
        txtContactInfoName.clear();
        txtContactInfoName.sendKeys(strUEN);
    }
    public void setcontactinfodesignation(String str) {
        txtcontactinfodesignation.clear();
        txtcontactinfodesignation.sendKeys(str);
    }
    public void setcontactinfophone(String str) {
        txtcontactinfophone.clear();
        txtcontactinfophone.sendKeys(str);
    }
    public void setcontactinfoprimaryemail(String str) {
        txtcontactinfoprimaryemail.clear();
        txtcontactinfoprimaryemail.sendKeys(str);
    }
    public void setcontactinfosecondaryemail(String str) {
        txtcontactinfosecondaryemail.clear();
        txtcontactinfosecondaryemail.sendKeys(str);
    }




    public void clickLoginBGP() { btnLogin_BGP.click(); }



    //Click on Next button
    public void clickLogin() {
        btnLogin.click();
    }

    //Click on Get new grant button
    public void clickGetnewgrant() {
        txtGetnewgrant.click();
    }

    //Click on Get new grant button
    public void clickbtnNextSelectGrant() {
        btnNextSelectGrant.click();
    }

    public void clickbtnApply() { btnApply.click(); }
    public void clickbtnProceed() { btnProceed.click(); }
    public void clickSave() { btnSave.click(); }

    public void loginBGP(String strNRIC, String strName, String strUEN){
        //Click Login button
        clickLoginBGP();
        //Fill Card Number
        setNRIC(strNRIC);
        //Fill Card Number
        setName(strName);
        //Fill Card Number
        setUEN(strUEN);
        //Click Login button
        clickLogin();
    }

    public void selectGetnewgrant(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(txtGetnewgrant));
        //Click Login button
        clickGetnewgrant();
    }

    public void selectSector(String strSector){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement eleSector = driver.findElement(By.xpath("//*[@class='item'][.='"+ strSector+"']"));
        wait.until(ExpectedConditions.visibilityOf(eleSector));
        if (eleSector.isDisplayed()) {
            eleSector.click();
            ExtentCucumberAdapter.addTestStepLog(strSector + " is selected successfully");
        }
    }

    public void clickText(String str){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement eleSector = driver.findElement(By.xpath("//*[.='"+str+"']"));
        wait.until(ExpectedConditions.visibilityOf(eleSector));
        if (eleSector.isDisplayed()) {
            eleSector.click();
            ExtentCucumberAdapter.addTestStepLog(str + " is selected successfully");
        }
    }

    public void verifyText(String strGrant){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement eleSector = driver.findElement(By.xpath("//*[.='"+strGrant+"']"));
        wait.until(ExpectedConditions.visibilityOf(eleSector));
        if (eleSector.isDisplayed()) {
            ExtentCucumberAdapter.addTestStepLog(strGrant + " is displayed successfully");
        }
    }

    public void verifyNoMessage(String strMessage){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement eleSector = driver.findElement(By.xpath("//*[@class='eligibility-advice']//*[.='"+strMessage+"']"));
        wait.until(ExpectedConditions.visibilityOf(eleSector));
        if (eleSector.isDisplayed()) {
            ExtentCucumberAdapter.addTestStepLog(strMessage + " is displayed successfully");
        }
    }
    public void verifyNoMessageIsNotDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> ele = driver.findElements(By.xpath("//*[@class='eligibility-advice']//*[.='"+NoMessageVal+"']"));
        if (ele.size()==0) {
            ExtentCucumberAdapter.addTestStepLog(NoMessageVal + " is not displayed");
        }
    }

    public int selectNoOption(String strOption){
        int index=0;
        if(strOption.equals("Is the applicant registered in Singapore?")){
            index =1;
        }else if(strOption.equals("Is the applicant's group sales turnover less than or equal to S$100m or is the applicant's group employment size less than or equal to 200?")){
            index =2;
        }else if(strOption.equals("Does the applicant have at least 30%  local equity?")){
            index =3;
        }else if(strOption.equals("Is the target market that you are applying for a new market? A market is new if your company's revenue from there has not exceeded $100,000 for any of the last 3 years.")){
            index =4;
        }else if(strOption.equals("Are all the following statements true for this project?")){
            index =5;
        }
        return index;
    }

    public String selectYesOption(String strOption){
        String strID = null;
        if(strOption.equals("Is the applicant registered in Singapore?")) {
            strID = "react-eligibility-sg_registered_check-true";
        }else if(strOption.equals("Is the applicant's group sales turnover less than or equal to S$100m or is the applicant's group employment size less than or equal to 200?")){
            strID ="react-eligibility-turnover_check-true";
        }else if(strOption.equals("Does the applicant have at least 30%  local equity?")){
            strID ="react-eligibility-global_hq_check-true";
        }else if(strOption.equals("Is the target market that you are applying for a new market? A market is new if your company's revenue from there has not exceeded $100,000 for any of the last 3 years.")){
            strID ="react-eligibility-new_target_market_check-true";
        }else if(strOption.equals("Are all the following statements true for this project?")){
            strID ="react-eligibility-started_project_check-false";
        }
        return strID;
    }
  /*  public static Properties readData() {
        Properties objProp = new Properties();
        try {
            File file = new File("src/test/resources/testData/" + "TestData_QA_Env.properties");
            FileInputStream fileInput = null;
            fileInput = new FileInputStream(file);
            objProp.load(fileInput);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objProp;
    }*/

    public void selectRadiobutton(String StrText, String strOption) {

        if(strOption.equalsIgnoreCase("No")){
          int index =  selectNoOption(StrText);
            WebDriverWait wait = new WebDriverWait(driver, 60);
            WebElement eleSector = driver.findElement(By.xpath("//*[@class='form-horizontal bgp-radio-group']["+index+"]//*[@class='bgp-radio'][2][.='No']"));
            wait.until(ExpectedConditions.elementToBeClickable(eleSector));
            if (eleSector.isEnabled()) {
                eleSector.click();
                ExtentCucumberAdapter.addTestStepLog(strOption + " is selected successfully");
            }
           // verifyNoMessage(readData().getProperty("EligibilityNoErrorMessage"));
        }else if(strOption.equalsIgnoreCase("Yes")){
            String strID =  selectYesOption(StrText);
            WebDriverWait wait = new WebDriverWait(driver, 60);
            WebElement eleSector = driver.findElement(By.id(strID));
            wait.until(ExpectedConditions.elementToBeClickable(eleSector));
            JavascriptExecutor jse2 = (JavascriptExecutor)driver;
            jse2.executeScript("arguments[0].click();", eleSector);
        }

    }
     public void clickNextSelectGrant(){
        clickbtnNextSelectGrant();
    }

    public void clickApplytoDraftform(){
        clickbtnApply();
    }

    public void clickProceedtoSubmitform(){
        clickbtnProceed();
    }

    public void clickSaveForm(){
        clickSave();
    }
    public void enterMainContactPerson(String strName, String strJobTitle, String strContactNo, String strEmail, String strAlternateContactPersonsEmail){
        setContactInfoName(strName);
        setcontactinfodesignation(strJobTitle);
        setcontactinfophone(strContactNo);
        setcontactinfoprimaryemail(strEmail);
        setcontactinfosecondaryemail(strAlternateContactPersonsEmail);
    }
}
