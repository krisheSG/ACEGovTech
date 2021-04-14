package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactDetails extends MasterPageWeb {

    public ContactDetails(WebDriver driver) {
        super(driver);
        this.driver= driver;
    }

    @FindBy(xpath = ("//*[@id='react-contact_info-correspondence_address-block']"))
    WebElement txtreactcontactinfocorrespondenceaddressblock;


    @FindBy(xpath = ("//input[@id='react-contact_info-correspondence_address-street']"))
    WebElement txtreactcontactinfocorrespondenceaddressstreet;

    @FindBy(id="react-contact_info-correspondence_address-copied")
    WebElement chkcorrespondenceaddresscopied;

    @FindBy(id="react-contact_info-correspondence_address-level")
    WebElement txtcorrespondenceaddresslevel;

    @FindBy(id="react-contact_info-correspondence_address-unit")
    WebElement txtcorrespondenceaddressunit;

    @FindBy(id="react-contact_info-correspondence_address-building_name")
    WebElement txtcorrespondenceaddressBuildingname;

    @FindBy(id="react-contact_info-offeree_name")
    WebElement txtcontactinfooffereename;

    @FindBy(id="react-contact_info-offeree_designation")
    WebElement txtcontactinfooffereedesignation;

    @FindBy(id="react-contact_info-offeree_email")
    WebElement txtcontactinfooffereeemail;

    @FindBy(id="react-contact_info-copied")
    WebElement chkcontactinfocopied;

    @FindBy(xpath = "//a[contains(@href,'contact_info')]")
    WebElement lnkContactInfo;
    @FindBy(id="react-contact_info-correspondence_address-postal")
    WebElement txtcontactinfocorrespondenceaddresspostal;

    @FindBy(id="react-contact_info-correspondence_address-postal-label")
    WebElement lblcontactinfocorrespondenceaddresspostal;

    @FindBy(id="next-btn")
    WebElement btnNext;



    public String returnAttributeVal(WebElement element){
       WebDriverWait wait = new WebDriverWait(driver, 10);
       wait.until(ExpectedConditions.visibilityOf(element));
       return  element.getAttribute("value");
   }


    public void clickContactInfo() { lnkContactInfo.click(); }
    public void setcontactinfocorrespondenceaddresspostal(String str) {
        txtcontactinfocorrespondenceaddresspostal.clear();
        txtcontactinfocorrespondenceaddresspostal.sendKeys(str);
    }
    public String getcontactinfooffereeemail() {
        return returnAttributeVal(txtcontactinfooffereeemail);
       /* WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(txtcontactinfooffereeemail));
        return  txtcontactinfooffereeemail.getAttribute("value");*/
    }
    public String getlblcontactinfocorrespondenceaddresspostal() {
        return returnAttributeVal(txtcontactinfocorrespondenceaddresspostal);
    }
    public String getreactcontactinfocorrespondenceaddressblock() {
        return returnAttributeVal(txtreactcontactinfocorrespondenceaddressblock);
    }
    public String getreactcontactinfocorrespondenceaddressstreet() {
        return returnAttributeVal(txtreactcontactinfocorrespondenceaddressstreet);
    }
    public String getcorrespondenceaddresslevel() {
        return returnAttributeVal(txtcorrespondenceaddresslevel);
    }
    public String gettxtcorrespondenceaddressunit() {
        return returnAttributeVal(txtcorrespondenceaddressunit);
    }
    public String gettxtcorrespondenceaddressBuildingname() {
        return returnAttributeVal(txtcorrespondenceaddressBuildingname);
    }

    //Same as main contact person
    public void setcontactinfooffereename(String str) {
        txtcontactinfooffereename.clear();
        txtcontactinfooffereename.sendKeys(str);
    }
    public String getcontactinfooffereename() {
        return returnAttributeVal(txtcontactinfooffereename);
       /* WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(txtcontactinfooffereename));
        return  txtcontactinfooffereename.getAttribute("value");*/
    }

    public void setcontactinfooffereedesignation(String str) {
        txtcontactinfooffereedesignation.clear();
        txtcontactinfooffereedesignation.sendKeys(str);
    }
    public String getcontactinfooffereedesignation() {
        return returnAttributeVal(txtcontactinfooffereedesignation);
    }
    public void setcontactinfooffereeemail(String str) {
        txtcontactinfooffereeemail.clear();
        txtcontactinfooffereeemail.sendKeys(str);
    }
    public void clickchkcorrespondenceaddresscopied() { chkcorrespondenceaddresscopied.click(); }
    public void clickcontactinfocopied() { chkcontactinfocopied.click(); }
    public void clickbtnNext() { btnNext.click(); }



    public void navigateContactInfoPage(){
        clickContactInfo();
    }

    public void enterAndVerifyMailingAddress(String postalcode,String hNo, String street){
        setcontactinfocorrespondenceaddresspostal(postalcode);
        String strblock =  getreactcontactinfocorrespondenceaddressblock();
        String strstreet =  getreactcontactinfocorrespondenceaddressstreet();
        Assert.assertEquals(strblock,hNo);
        Assert.assertEquals(strstreet,street);
    }
    public void selectExistingAddress(){
        clickchkcorrespondenceaddresscopied();
    }

    public void verifyExistingMailingAddress(String strpostalcode,String strhNo, String strstreet, String strLevel, String strUnit, String strBname){
        Assert.assertEquals(getlblcontactinfocorrespondenceaddresspostal(),strpostalcode);
        Assert.assertEquals(getreactcontactinfocorrespondenceaddressblock(),strhNo);
        Assert.assertEquals(getreactcontactinfocorrespondenceaddressstreet(),strstreet);
        Assert.assertEquals(getcorrespondenceaddresslevel(),strLevel);
        Assert.assertEquals(gettxtcorrespondenceaddressunit(),strUnit);
        Assert.assertEquals(gettxtcorrespondenceaddressBuildingname(),strBname);
    }

    public void enterLetterofAddresse(String strname, String strJob, String strEmail){
        setcontactinfooffereename(strname);
        setcontactinfooffereedesignation(strJob);
        setcontactinfooffereeemail(strEmail);
    }

    public void selectContactInfo(){
        clickcontactinfocopied();
    }
    public void verifyLetterOfOfferAddressee(String strname, String strJob, String strEmail){
        Assert.assertEquals(getcontactinfooffereename(),strname);
        Assert.assertEquals(getcontactinfooffereedesignation(),strJob);
        Assert.assertEquals(getcontactinfooffereeemail(),strEmail);
    }
    public void navigatebyNext(){
        clickbtnNext();
    }

}
