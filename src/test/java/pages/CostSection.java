package pages;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CostSection extends MasterPageWeb {
    public CostSection(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    @FindBy(id="react-project_cost-vendors-accordion-header")
    WebElement txtPrjectCostVendorAccHeader;

    @FindBy(id="react-project_cost-vendors-add-item")
    WebElement txtProjectCostVendorAddItem;

    @FindBy(id="react-project_cost-vendors-0-local_vendor-true")
    WebElement optProjectCostVendor1localVendorTrue;

    @FindBy(id="react-project_cost-vendors-0-local_vendor-false")
    WebElement optprojectcostvendors0localvendorfalse;

    @FindBy(id="react-project_cost-vendors-0-vendor_name")
    WebElement txtProjectCostVendor1localVendorName;

    @FindBy(xpath=("//*[@id='react-project_cost-vendors-0-vendor_name-vendor']/span"))
    WebElement btnVendorName;

    @FindBy(xpath=("//*[@id='react-project_cost-vendors-0-vendor_name-vendor']"))
    WebElement btnVendorName2;


    @FindBy(id="react-project_cost-vendors-0-attachments-input")
    WebElement txtProjectCostVendor1localVendorAttchBtn;

    @FindBy(id="react-project_cost-vendors-0-remarks")
    WebElement txtreactprojectcostvendors0remarks;


    @FindBy(id="react-project_cost-vendors-0-amount_in_billing_currency")
    WebElement txtProjectCostVendor1amtInBillingCurrency;

    @FindBy(id="react-project_cost-office_rentals-accordion-header")
    WebElement txtProjectCostOfficeRentalsAccordHeader;

    @FindBy(xpath = "//a[.='Cost']")
    WebElement lnkCost;

    @FindBy(id="react-project_cost-office_rentals-add-item")
    WebElement txtprojectcostofficerentalsadditem;

    @FindBy(id="react-project_cost-office_rentals-0-description")
    WebElement txtprojectcostofficerentals0description;

    @FindBy(id="react-project_cost-office_rentals-0-rental_duration")
    WebElement txtprojectcostofficerentals0rentalduration;

    @FindBy(id="react-project_cost-office_rentals-0-amount_in_billing_currency")
    WebElement projectcostofficerentals0amountinbillingcurrency;


    @FindBy(id="react-project_cost-office_rentals-0-attachments-input")
    WebElement reactprojectcostofficerentals0attachmentsbtn;

    @FindBy(id="react-project_cost-office_rentals-0-remarks")
    WebElement reactprojectcostofficerentals0remarks;

    @FindBy(id="react-project_cost-salaries-accordion-header")
    WebElement projectcostsalariesaccordionheader;

    @FindBy(id="react-project_cost-salaries-add-item")
    WebElement reactprojectcostsalariesadditem;

    @FindBy(id="react-project_cost-salaries-0-name")
    WebElement reactprojectcostsalaries0name;

    @FindBy(id="react-project_cost-salaries-0-designation")
    WebElement reactprojectcostsalaries0designation;

    @FindBy(id="react-project_cost-salaries-0-nric")
    WebElement reactprojectcostsalaries0nric;

     @FindBy(id="react-select-project_cost-salaries-0-nationality--value")
//    @FindBy (xpath = "//div[@class='Select-placeholder'][text()='Select...'][text()='Select...'])[1]")
    WebElement selectprojectcostsalaries0nationalityvalue;

    //@FindBy (xpath = "//*[@class='Select-placeholder'][.='Select...']")
    @FindBy(xpath = "//*[@id='react-select-project_cost-salaries-0-nationality--value']//*[@class='Select-input']/input")
    WebElement setprojectcostsalaries0nationalityvalue;

    @FindBy(id="react-project_cost-salaries-0-project_role")
    WebElement reactprojectcostsalaries0projectrole;

    @FindBy(id="react-project_cost-salaries-0-involvement_months")
    WebElement reactprojectcostsalaries0involvementmonths;

    @FindBy(id="react-project_cost-salaries-0-salary_in_billing_currency")
    WebElement projectcostsalaries0salaryinbillingcurrency;

    @FindBy(id="react-project_cost-salaries-0-attachments-input")
    WebElement reactprojectcostsalaries0attachmentsbtn;

    @FindBy(id="react-project_cost-salaries-0-remarks")
    WebElement reactprojectcostsalaries0remarks;

  public void clickCost() {
      lnkCost.click();
  }
   /* public void clickCost2() {
        lnkCost.click();
    }
    public void clickCost3() {
        lnkCost.click();
    }*/

    public void clickVendorSearch(){
       highlightele(btnVendorName);
            btnVendorName.click();
    }
   /* public void clickText(String str){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement eleSector = driver.findElement(By.xpath("//*[@id='vendor-row-sub'][.='"+str+"']"));
        eleSector.click();
       ExtentCucumberAdapter.addTestStepLog(str + " is selected successfully");
    }*/


    public void clickPrjectCostVendorAccHeader() {
        waitForElement(txtPrjectCostVendorAccHeader);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", txtPrjectCostVendorAccHeader);
//        txtPrjectCostVendorAccHeader.click();
    }
    public void clickProjectCostVendorAddItem() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", txtProjectCostVendorAddItem);
//        txtProjectCostVendorAddItem.click();
    }
    public void setOptProjectCostVendor1localVendorTrue(String str) {
        if (str.equalsIgnoreCase("Singapore")){
            waitForElement(optProjectCostVendor1localVendorTrue);
            optProjectCostVendor1localVendorTrue.click();
        }else if (str.equalsIgnoreCase("overseas")){
            waitForElement(optprojectcostvendors0localvendorfalse);
            optprojectcostvendors0localvendorfalse.click();
        }
    }
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
    public void setProjectCostVendor1localVendorName(String str) {
        highlightele(txtProjectCostVendor1localVendorName);
        txtProjectCostVendor1localVendorName.clear();
        txtProjectCostVendor1localVendorName.sendKeys(str);
        txtProjectCostVendor1localVendorName.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        txtProjectCostVendor1localVendorName.sendKeys(Keys.ENTER);
        clickVendorSearch();
        clickText(str);
    }
    public void clickText(String str){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement eleSector = driver.findElement(By.xpath("//*[@id='vendor-row-name']//*[.='"+str+"']"));
        wait.until(ExpectedConditions.visibilityOf(eleSector));
        if (eleSector.isDisplayed()) {
            eleSector.click();
            ExtentCucumberAdapter.addTestStepLog(str + " is selected successfully");
        }
    }
    public void settreactprojectcostvendors0remarks(String str) {
        txtreactprojectcostvendors0remarks.clear();
        txtreactprojectcostvendors0remarks.sendKeys(str);
    }

    public void uploaddoc(WebElement ele, String str){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ele));
        WebElement ele1 = ele;
        Actions action = new Actions(driver);
        action.moveToElement(ele1).build().perform();
        ele.sendKeys(str);
        // btnProjectAttachBtn.sendKeys(str);
        System.out.println(str);
    }
    public void setProjectCostVendor1localVendorAttchBtn(String str) {
        uploaddoc(txtProjectCostVendor1localVendorAttchBtn,str);
        /*WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(txtProjectCostVendor1localVendorAttchBtn));
        WebElement ele1 = txtProjectCostVendor1localVendorAttchBtn;
        Actions action = new Actions(driver);
        action.moveToElement(ele1).build().perform();
        txtProjectCostVendor1localVendorAttchBtn.sendKeys(str);
        // btnProjectAttachBtn.sendKeys(str);
        System.out.println(str);  */
    }
    public void setProjectCostVendor1amtInBillingCurrency(String str) {
        txtProjectCostVendor1amtInBillingCurrency.clear();
        txtProjectCostVendor1amtInBillingCurrency.sendKeys(str);
    }
    public void clickProjectCostOfficeRentalsAccordHeader() {
      highlightele(txtProjectCostOfficeRentalsAccordHeader);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(txtProjectCostOfficeRentalsAccordHeader));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", txtProjectCostOfficeRentalsAccordHeader);
//        txtProjectCostOfficeRentalsAccordHeader.click();
    }
    public void clickprojectcostofficerentalsadditem() {
        highlightele(txtprojectcostofficerentalsadditem);
      waitForElement(txtprojectcostofficerentalsadditem);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", txtprojectcostofficerentalsadditem);
//        txtprojectcostofficerentalsadditem.click();
    }
    public void setprojectcostofficerentals0description(String str) {
        txtprojectcostofficerentals0description.clear();
        txtprojectcostofficerentals0description.sendKeys(str);
    }
    public void setprojectcostofficerentals0rentalduration(String str) {
        txtprojectcostofficerentals0rentalduration.clear();
        txtprojectcostofficerentals0rentalduration.sendKeys(str);
    }
    public void setprojectcostofficerentals0amountinbillingcurrency(String str) {
        projectcostofficerentals0amountinbillingcurrency.clear();
        projectcostofficerentals0amountinbillingcurrency.sendKeys(str);
    }
    public void setreactprojectcostofficerentals0attachmentsbtn(String str) {
      uploaddoc(reactprojectcostofficerentals0attachmentsbtn,str);
    }
    public void setreactprojectcostofficerentals0remarks(String str) {
        reactprojectcostofficerentals0remarks.clear();
        reactprojectcostofficerentals0remarks.sendKeys(str);
    }
    public void clickprojectcostsalariesaccordionheader() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(projectcostsalariesaccordionheader));
         highlightele(projectcostsalariesaccordionheader);
      /*  JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", projectcostsalariesaccordionheader);*/
         projectcostsalariesaccordionheader.click();
    }
    public void clickreactprojectcostsalariesadditem() {
      waitForElement(reactprojectcostsalariesadditem);
        highlightele(reactprojectcostsalariesadditem);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", reactprojectcostsalariesadditem);
//        reactprojectcostsalariesadditem.click();
    }
    public void setreactprojectcostsalaries0name(String str) {
        highlightele(reactprojectcostsalaries0name);
        reactprojectcostsalaries0name.clear();
        reactprojectcostsalaries0name.sendKeys(str);
    }
    public void setreactprojectcostsalaries0designation(String str) {
        reactprojectcostsalaries0designation.clear();
        reactprojectcostsalaries0designation.sendKeys(str);
    }
    public void setreactprojectcostsalaries0nric(String str) {
        highlightele(reactprojectcostsalaries0nric);
        reactprojectcostsalaries0nric.clear();
        reactprojectcostsalaries0nric.sendKeys(str);
    }
    public void setselectprojectcostsalaries0nationalityvalue(String str) {
        highlightele(selectprojectcostsalaries0nationalityvalue);
        selectprojectcostsalaries0nationalityvalue.click();
        setprojectcostsalaries0nationalityvalue.sendKeys(str);
        setprojectcostsalaries0nationalityvalue.sendKeys(Keys.ENTER);
    }

    public void setreactprojectcostsalaries0projectrole(String str) {
        highlightele(reactprojectcostsalaries0projectrole);
        reactprojectcostsalaries0projectrole.clear();
        reactprojectcostsalaries0projectrole.sendKeys(str);
    }
    public void setreactprojectcostsalaries0involvementmonths(String str) {
        highlightele(reactprojectcostsalaries0involvementmonths);
        reactprojectcostsalaries0involvementmonths.clear();
        reactprojectcostsalaries0involvementmonths.sendKeys(str);
    }
    public void setprojectcostsalaries0salaryinbillingcurrency(String str) {
        highlightele(projectcostsalaries0salaryinbillingcurrency);
        projectcostsalaries0salaryinbillingcurrency.clear();
        projectcostsalaries0salaryinbillingcurrency.sendKeys(str);
    }
    public void setreactprojectcostsalaries0attachmentsbtn(String str) {
        highlightele(reactprojectcostsalaries0attachmentsbtn);
        uploaddoc(reactprojectcostsalaries0attachmentsbtn,str);
    }
    public void setreactprojectcostsalaries0remarks(String str) {
        highlightele(reactprojectcostsalaries0remarks);
        reactprojectcostsalaries0remarks.clear();
        reactprojectcostsalaries0remarks.sendKeys(str);
    }

    public void enteruserSavedTheCostSectionWithVendordetails(String VendorLoc, String VendorName, String supportdoc, String BillCurrency, String remarks){
        ProposalSection obj = new ProposalSection(driver);
        clickCost();
        clickPrjectCostVendorAccHeader();
        clickProjectCostVendorAddItem();
        setOptProjectCostVendor1localVendorTrue(VendorLoc);
        setProjectCostVendor1localVendorName(VendorName);
        setProjectCostVendor1localVendorAttchBtn(supportdoc);
        setProjectCostVendor1amtInBillingCurrency(BillCurrency);
        settreactprojectcostvendors0remarks(remarks);
    }

    public void enteruserOfficeSpaceRentalDetails(String OfficespaceRentalDesc, String OfficespaceRentalDuration, String OfficespaceRentalCurrency, String OfficespaceRentalSupportDoc, String OfficespaceRentalRemarks) {
//        ProposalSection obj = new ProposalSection(driver);
//        clickCost();
        clickProjectCostOfficeRentalsAccordHeader();
        clickprojectcostofficerentalsadditem();
        setprojectcostofficerentals0description(OfficespaceRentalDesc);
        setprojectcostofficerentals0rentalduration(OfficespaceRentalDuration);
        setprojectcostofficerentals0amountinbillingcurrency(OfficespaceRentalCurrency);
        setreactprojectcostofficerentals0attachmentsbtn(OfficespaceRentalSupportDoc);
        setreactprojectcostofficerentals0remarks(OfficespaceRentalRemarks);
    }

    public void enterSalaryStaffDetails(String SalaryStaffName, String SalaryStaffDesignation, String SalaryStaffNRIC, String SalaryStaffNationalityType, String SalaryStaffRole, String SalaryStaffProjectInvolvment, String SalaryStaffBilCurrency, String SalaryStaffSupportDoc, String salaryStaffRemarks) {
       /* ProposalSection obj = new ProposalSection(driver);
        clickCost();*/
        clickprojectcostsalariesaccordionheader();
        clickreactprojectcostsalariesadditem();
        setreactprojectcostsalaries0name(SalaryStaffName);
        setreactprojectcostsalaries0designation(SalaryStaffDesignation);
        setreactprojectcostsalaries0nric(SalaryStaffNRIC);
        setselectprojectcostsalaries0nationalityvalue(SalaryStaffNationalityType);
        setreactprojectcostsalaries0projectrole(SalaryStaffRole);
        setreactprojectcostsalaries0involvementmonths(SalaryStaffProjectInvolvment);
        setprojectcostsalaries0salaryinbillingcurrency(SalaryStaffBilCurrency);
        setreactprojectcostsalaries0attachmentsbtn(SalaryStaffSupportDoc);
        setreactprojectcostsalaries0remarks(salaryStaffRemarks);
    }

}
