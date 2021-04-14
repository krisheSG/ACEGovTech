package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Declare_Review_Section extends MasterPageWeb{

    public Declare_Review_Section(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[.='Declare & Review']")
    WebElement lnkDecReview;

    @FindBy(id="react-declaration-criminal_liability_check-false")
    WebElement optdeclarationcriminalliabilitycheckfalse;

    @FindBy(xpath="//input[@id='react-declaration-civil_proceeding_check-false']")
    WebElement optdeclarationcivilproceedingcheck;

//    @FindBy(id="react-declaration-insolvency_proceeding_check-false")
    @FindBy(xpath="//input[@id='react-declaration-insolvency_proceeding_check-false']")
    WebElement optdeclarationinsolvencyproceedingcheckfalse;

    @FindBy(xpath="//input[@id='react-declaration-project_incentives_check-false']")
//    @FindBy(id="react-declaration-project_incentives_check-false")
    WebElement optdeclarationprojectincentivescheckfalse;

//    @FindBy(id="react-declaration-other_incentives_check-false")
    @FindBy(xpath="//input[@id='react-declaration-other_incentives_check-false']")
    WebElement optdeclarationotherincentivescheckfalse;

    @FindBy(id="react-declaration-project_commence_check-false")
    WebElement optdeclarationprojectcommencecheckfalse;

    @FindBy(id="react-declaration-related_party_check-false")
    WebElement optdeclarationrelatedpartycheckfalse;

    @FindBy(id="react-declaration-covid_safe_check-true")
    WebElement optdeclarationcovidsafechecktrue;

    @FindBy(id="react-declaration-covid_safe_ques_check-true")
    WebElement optdeclarationcovidsafequeschecktrue;

    @FindBy(id="react-declaration-consent_acknowledgement_check")
    WebElement chkdeclarationconsentacknowledgementcheck;

    @FindBy(id="review-btn")
    WebElement btnReview;


    public void clicktxtdeclarationcriminalliabilitycheckfalse(String str) {
        if(str.equalsIgnoreCase("yes")) {

        }else if (str.equalsIgnoreCase("no")) {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(optdeclarationcriminalliabilitycheckfalse));
            highlightele(optdeclarationcriminalliabilitycheckfalse);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", optdeclarationcriminalliabilitycheckfalse);
            /*highlightele(optdeclarationcriminalliabilitycheckfalse);
            optdeclarationcriminalliabilitycheckfalse.click();*/
        }
    }
    public void clickoptdeclarationcivilproceedingcheck(String str) {
        if(str.equalsIgnoreCase("yes")) {

        }else if (str.equalsIgnoreCase("no")) {
            highlightele(optdeclarationcivilproceedingcheck);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", optdeclarationcivilproceedingcheck);
        }

    }
    public void highlightele(WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ele));
        Actions action = new Actions(driver);
        action.moveToElement(ele).build().perform();
    }

    public void clickdeclarationinsolvencyproceedingcheckfalse(String str) {
        if(str.equalsIgnoreCase("yes")) {

        }else if (str.equalsIgnoreCase("no")) {
            highlightele(optdeclarationinsolvencyproceedingcheckfalse);
            optdeclarationinsolvencyproceedingcheckfalse.click();
        }
    }
    public void clickoptdeclarationprojectincentivescheckfalse(String str) {
        if(str.equalsIgnoreCase("yes")) {

        }else if (str.equalsIgnoreCase("no")) {
            highlightele(optdeclarationprojectincentivescheckfalse);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", optdeclarationprojectincentivescheckfalse);
        }
    }
    public void clickoptdeclarationotherincentivescheckfalse(String str) {
        if(str.equalsIgnoreCase("yes")) {

        }else if (str.equalsIgnoreCase("no")) {
            highlightele(optdeclarationotherincentivescheckfalse);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", optdeclarationotherincentivescheckfalse);
        }

    }
    public void clickoptdeclarationprojectcommencecheckfalse(String str) {
        if(str.equalsIgnoreCase("yes")) {

        }else if (str.equalsIgnoreCase("no")) {
            highlightele(optdeclarationprojectcommencecheckfalse);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", optdeclarationprojectcommencecheckfalse);
        }

    }
    public void clickoptdeclarationrelatedpartycheckfalse(String str) {
        if(str.equalsIgnoreCase("yes")) {

        }else if (str.equalsIgnoreCase("no")) {
            highlightele(optdeclarationrelatedpartycheckfalse);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", optdeclarationrelatedpartycheckfalse);
        }

    }
    public void clickoptdeclarationcovidsafechecktrue(String str) {
        if(str.equalsIgnoreCase("yes")) {
            highlightele(optdeclarationcovidsafechecktrue);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", optdeclarationcovidsafechecktrue);
        }else if (str.equalsIgnoreCase("no")) {

        }

    }
    public void clickoptdeclarationcovidsafequeschecktrue(String str) {
        if(str.equalsIgnoreCase("yes")) {
            highlightele(optdeclarationcovidsafequeschecktrue);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", optdeclarationcovidsafequeschecktrue);
        }else if (str.equalsIgnoreCase("no")) {

        }

    }
    public void clickchkdeclarationconsentacknowledgementcheck(String str) {
        if(str.equalsIgnoreCase("yes")) {
            highlightele(chkdeclarationconsentacknowledgementcheck);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", chkdeclarationconsentacknowledgementcheck);
        }else if (str.equalsIgnoreCase("no")) {

        }

    }
    public void clickbtnReview() {
        highlightele(btnReview);
        btnReview.click();
    }
    public void clicklnkDecReview() {
        highlightele(lnkDecReview);
        lnkDecReview.click();
    }

    public void enterDeclarAndReview(String termsOne, String termsTwo, String termsThree, String termsFour, String termsFive, String termsSix, String termsSeven, String termsEight, String termsNine, String ack){
        ProposalSection obj = new ProposalSection(driver);
        clicklnkDecReview();
        clicktxtdeclarationcriminalliabilitycheckfalse(termsOne);
        clickoptdeclarationcivilproceedingcheck(termsTwo);
        clickdeclarationinsolvencyproceedingcheckfalse(termsThree);
        clickoptdeclarationprojectincentivescheckfalse(termsFour);
        clickoptdeclarationotherincentivescheckfalse(termsFive);
        clickoptdeclarationprojectcommencecheckfalse(termsSix);
        clickoptdeclarationrelatedpartycheckfalse(termsSeven);
        clickoptdeclarationcovidsafechecktrue(termsEight);
        clickoptdeclarationcovidsafequeschecktrue(termsNine);
        clickchkdeclarationconsentacknowledgementcheck(ack);
        clickbtnReview();
    }

}
