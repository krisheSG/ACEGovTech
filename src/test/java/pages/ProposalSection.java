package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ProposalSection extends MasterPageWeb {

    public ProposalSection(WebDriver driver){
       super(driver);
        this.driver = driver;
    }

    @FindBy(id="react-project-title")
    WebElement txtProjectTitle;

    @FindBy(id="react-project-start_date")
    WebElement txtProjectSdate;

    @FindBy(id="react-project-end_date")
    WebElement txtProjectEdate;

    @FindBy(id="react-project-description")
    WebElement txtProjectDesc;

    @FindBy(xpath = "//*[@id='react-select-project-activity--value']//div[@class='Select-placeholder']")
    WebElement txtProjectActivityValue;

    @FindBy(xpath = ("//*[@id='react-select-project-primary_market--value']/div[@class='Select-placeholder']"))
    WebElement txtProjectPrimaryMarketValue;

    @FindBy(id="react-project-is_first_time_expand-true")
    WebElement optProjectFirstTimeExpTrue;

    @FindBy(xpath = "//*[@id='react-project-attachments-input']")
    WebElement btnProjectAttachBtn;

    @FindBy(id="react-project-remarks")
    WebElement txtProjectremarks;

    @FindBy(xpath = "//a[.='Proposal']")
    WebElement lnkProposalPage;

    public void setProjectTitle(String strProjectTitle) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(txtProjectTitle));
        txtProjectTitle.clear();
        txtProjectTitle.sendKeys(strProjectTitle);
    }
    public void setProjectSdate(String str) {
        txtProjectSdate.clear();
        txtProjectSdate.sendKeys(str);
    }
    public void setProjectEdate(String str) {
        txtProjectEdate.clear();
        txtProjectEdate.sendKeys(str);
    }
    public void setProjectDesc(String str) {
        txtProjectDesc.clear();
        txtProjectDesc.sendKeys(str);
    }
    public String setDate(String strProjectTitle) {
       return convertDate(strProjectTitle);
    }

    public void setProjectAttachBtn(String str) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(btnProjectAttachBtn));
        WebElement ele1 = btnProjectAttachBtn;
        Actions action = new Actions(driver);
        action.moveToElement(ele1).build().perform();
        btnProjectAttachBtn.sendKeys(str);
       // btnProjectAttachBtn.sendKeys(str);
        System.out.println(str);
    }

    public void setProjectremarks(String str) {
        txtProjectremarks.clear();
        txtProjectremarks.sendKeys(str);
    }

    public void highlightele(WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ele));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
        Actions action = new Actions(driver);
        action.moveToElement(ele).build().perform();
    }

    public void typeAndSelect(WebElement ele, String str) {
        Actions action = new Actions(driver);
        action.moveToElement(ele).build().perform();
        ele.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // executor.executeScript("arguments[0].click();", By.xpath("//*[text()='FTA Consultancy']"));
       // ele.sendKeys(str);
        driver.findElement(By.xpath("//*[.='"+str+"']")).click();
    }

    //Click on Next button
    public void clickProposalPage() {
        highlightele(lnkProposalPage);
        lnkProposalPage.click();
    }


    public String convertDate(String strdate){
        String strDate = null;
        int index = 0;
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
        Calendar c = Calendar.getInstance();
        if (strdate.equalsIgnoreCase("Today")) {
             date = new Date();
            strDate = formatter.format(date);
        }else if(strdate.contains("+")) {
            index = strdate.indexOf("+");
            index = Integer.parseInt(strdate.substring(index+1));
            c.setTime(new Date());
            c.add(Calendar.DATE,index);
            strDate = formatter.format(c.getTime());
        }
        return strDate;
    }

    public void clickProjectFirstTimeExpTrue(String str) {
        if(str.equalsIgnoreCase("yes")) {
            optProjectFirstTimeExpTrue.click();
        }
    }


    public void enterProposalData(String Proposal_ProjectTitle, String Proposal_StartDate, String Proposal_EndDate, String Proposal_ProjectDescription, String Proposal_Activity, String Proposal_TargetMarket, String Proposal_FirstTime, String Proposal_SupportDoc, String Proposal_remarks){
        clickProposalPage();
        setProjectTitle(Proposal_ProjectTitle);
        setProjectSdate(setDate(Proposal_StartDate));
        setProjectEdate(setDate(Proposal_EndDate));
        setProjectDesc(Proposal_ProjectDescription);
        typeAndSelect(txtProjectActivityValue, Proposal_Activity);
        typeAndSelect(txtProjectPrimaryMarketValue, Proposal_TargetMarket);
        clickProjectFirstTimeExpTrue(Proposal_FirstTime);
        setProjectAttachBtn(Proposal_SupportDoc);
        setProjectremarks(Proposal_remarks);
    }
}
