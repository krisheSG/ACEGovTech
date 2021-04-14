package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FinalReviewPage extends MasterPageWeb {

    public FinalReviewPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[contains(@href,'eligibility')]//*[@class='label label-success']")
    WebElement lblEligibilitySuccess;
    @FindBy(xpath = "//a[contains(@href,'contact_info')]//*[@class='label label-success']")
    WebElement lblContactInfoSuccess;
    @FindBy(xpath = "//a[ends-with(@href,'project')]//*[@class='label label-success']")
    WebElement lblProposalSuccess;





    @FindBy(id = "react-declaration-info_truthfulness_check")
    WebElement chkFinalAck;

    @FindBy(id = "submit-btn")
    WebElement btnSubmit;

//    Your application has been submitted.
    //td[contains(@class,'value')]


}
