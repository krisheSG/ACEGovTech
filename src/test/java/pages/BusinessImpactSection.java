package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessImpactSection extends MasterPageWeb {

    public BusinessImpactSection(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(id = "react-project_impact-fy_end_date_0")
    WebElement txtPrjectImpactEndDate;

    @FindBy(id = "react-project_impact-overseas_sales_0")
    WebElement txtPrjectImpactOversal0;

    @FindBy(id = "react-project_impact-overseas_sales_1")
    WebElement txtPrjectImpactOversal1;

    @FindBy(id = "react-project_impact-overseas_sales_2")
    WebElement txtPrjectImpactOversal2;

    @FindBy(id = "react-project_impact-overseas_sales_3")
    WebElement txtPrjectImpactOversal3;

    @FindBy(id = "react-project_impact-overseas_investments_0")
    WebElement txtPrjectImpactOverInv0;

    @FindBy(id = "react-project_impact-overseas_investments_1")
    WebElement txtPrjectImpactOverInv1;

    @FindBy(id = "react-project_impact-overseas_investments_2")
    WebElement txtPrjectImpactOverInv2;

    @FindBy(id = "react-project_impact-overseas_investments_3")
    WebElement txtPrjectImpactOverInv3;

    @FindBy(id = "react-project_impact-rationale_remarks")
    WebElement txtPrjectImpactRatRmrs;

    @FindBy(id = "react-project_impact-benefits_remarks")
    WebElement txtPrjectImpactBenfRmrs;

    @FindBy(xpath = "//a[.='Business Impact']")
    WebElement lnkBusinessImpact;
    public void highlightele(WebElement ele){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(ele));
        Actions action = new Actions(driver);
        action.moveToElement(ele).build().perform();
    }
    public void setProjectSdate(String str) {
        txtPrjectImpactEndDate.clear();
        txtPrjectImpactEndDate.sendKeys(str);
    }
    public void setPrjectImpactOversal0(String str) {
        highlightele(txtPrjectImpactOversal0);
        txtPrjectImpactOversal0.clear();
        txtPrjectImpactOversal0.sendKeys(str);
    }
    public void setPrjectImpactOversal1(String str) {
        txtPrjectImpactOversal1.clear();
        txtPrjectImpactOversal1.sendKeys(str);
    }
    public void setPrjectImpactOversal2(String str) {
        txtPrjectImpactOversal2.clear();
        txtPrjectImpactOversal2.sendKeys(str);
    }
    public void setPrjectImpactOversal3(String str) {
        txtPrjectImpactOversal3.clear();
        txtPrjectImpactOversal3.sendKeys(str);
    }
    public void setPrjectImpactOverInv0(String str) {
        txtPrjectImpactOverInv0.clear();
        txtPrjectImpactOverInv0.sendKeys(str);
    }
    public void setPrjectImpactOverInv1(String str) {
        txtPrjectImpactOverInv1.clear();
        txtPrjectImpactOverInv1.sendKeys(str);
    }
    public void setPrjectImpactOverInv2(String str) {
        txtPrjectImpactOverInv2.clear();
        txtPrjectImpactOverInv2.sendKeys(str);
    }
    public void setPrjectImpactOverInv3(String str) {
        txtPrjectImpactOverInv3.clear();
        txtPrjectImpactOverInv3.sendKeys(str);
    }
    public void setPrjectImpactRatRmrs(String str) {
        txtPrjectImpactRatRmrs.clear();
        txtPrjectImpactRatRmrs.sendKeys(str);
    }
    public void setPrjectImpactBenfRmrs(String str) {
        txtPrjectImpactBenfRmrs.clear();
        txtPrjectImpactBenfRmrs.sendKeys(str);
    }

    public void clickBusinessImpact() {
        lnkBusinessImpact.click();
    }

    public void BusinessImpactSec(String FYEndDate, String OverseasSales0, String OverseasSales1, String OverseasSales2, String OverseasSales3, String OverseasInv0, String OverseasInv1, String OverseasInv2, String OverseasInv3, String NonTangibleBenefits, String RationaleforProjections) {
        ProposalSection obj = new ProposalSection(driver);
        clickBusinessImpact();
        setProjectSdate(obj.setDate(FYEndDate));
        setPrjectImpactOversal0(OverseasSales0);
        setPrjectImpactOversal1(OverseasSales1);
        setPrjectImpactOversal2 (OverseasSales2);
        setPrjectImpactOversal3(OverseasSales3);
        setPrjectImpactOverInv0(OverseasInv0);
        setPrjectImpactOverInv1(OverseasInv1);
        setPrjectImpactOverInv2(OverseasInv2);
        setPrjectImpactOverInv3(OverseasInv3);
        setPrjectImpactRatRmrs(NonTangibleBenefits);
        setPrjectImpactBenfRmrs(RationaleforProjections);
    }



}
