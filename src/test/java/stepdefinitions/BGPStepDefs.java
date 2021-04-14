package stepdefinitions;


import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;

import java.io.IOException;

public class BGPStepDefs extends MasterStepDefs {

    BGPHomePage objBGPHomePage;
    ContactDetails objContactDetails;
    ProposalSection objProposalSection;
    BusinessImpactSection objBusinessImpactSection;
    CostSection objCostSection;
    Declare_Review_Section objDeclare_Review_Section;
    CompanyProfile objCompanyProfile;

    @Given("User launched BGP portal home page in \"([^\"]*)\"$")
    public void userLaunchedBGPPortalHomePageIn(String strDevice) {
        initializeDriver(strDevice);
        objBGPHomePage = new BGPHomePage(driver);
        objContactDetails  = new ContactDetails(driver);
        objProposalSection  = new ProposalSection(driver);
        objBusinessImpactSection = new BusinessImpactSection(driver);
        objCostSection = new CostSection(driver);
        objDeclare_Review_Section = new Declare_Review_Section(driver);
        objCompanyProfile = new CompanyProfile(driver);
        ExtentCucumberAdapter.addTestStepLog("Application launched successfully");
        try {
            ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(getScreenhot(driver));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @And("the user logged using the following input (.+), (.+), (.+), (.+)")
    public void theUserLoggedUsingTheFollowingInputNRICNAMEUENROLE(String strNRIC, String strName, String strUEN, String ROLE){
        strNRIC =  readData().getProperty(strNRIC);
        strName =  readData().getProperty(strName);
        strUEN =  readData().getProperty(strUEN);

        objBGPHomePage.loginBGP(strNRIC,strName,strUEN);
    }

    @After
    public void tearDown(Scenario scenario) {
        //  quit
        if (driver != null) {
            driver.quit();
        }
    }


    @Given("User viewed the Get new grant options in the Applications Tab")
    public void userViewedTheGetNewGrantOptionsInTheApplicationsTab() {
        objBGPHomePage.clickGetnewgrant();
    }

    @And("the user selected the following sector {string}")
    public void theUserSelectedTheFollowingSector(String strSector) {
        objBGPHomePage.selectSector(strSector);
    }

    @And("the user needed to grant to the following option {string}")
    public void theUserNeededToGrantToTheFollowingOption(String strGrantOption) {
        objBGPHomePage.clickText(strGrantOption);
    }

    @And("the user needed to plan with the following option {string}")
    public void theUserNeededToPlanWithTheFollowingOption(String strPlan) {
        objBGPHomePage.clickText(strPlan);
    }

    @And("the user created a draft form by using Apply")
    public void theUserCreatedADraftFormByUsingApply() {
        objBGPHomePage.clickApplytoDraftform();
    }

    @Then("the user proceed to enter form")
    public void theUserProceedToEnterForm() {
        objBGPHomePage.clickProceedtoSubmitform();
    }



    @Given("User viewed the {string} section")
    public void userViewedTheSection(String arg0) {

    }

    @Then("user viewed {string}")
    public void userViewed(String arg0) {
    }

    @When("user viewed {string} and select {string}")
    public void userViewedAndSelect(String arg0, String arg1) {
        objBGPHomePage.selectRadiobutton(arg0,arg1);
    }


    @Then("user ensured the following message is displayed {string}")
    public void userEnsuredTheFollowingMessageIsDisplayed(String arg0) {
        objBGPHomePage.verifyNoMessage(arg0);
    }

    @When("user saved the form")
    public void userSavedTheForm() {
        objBGPHomePage.clickSaveForm();
    }

    @Given("User viewed the {string}")
    public void userViewedThe(String arg0){
        objBGPHomePage.verifyText(arg0);
    }

    @And("user ensured saved option is not changed after the screen refresh")
    public void userEnsuredSavedOptionIsNotChangedAfterTheScreenRefresh() {
    }

    @And("user ensured saved option with Yes is not changed after the screen refresh")
    public void userEnsuredSavedOptionWithYesIsNotChangedAfterTheScreenRefresh() {
        objBGPHomePage.verifyNoMessageIsNotDisplayed();
    }

    @When("the user ensured and entered values for the following input {string}, {string}, {string}, {string}, {string}")
    public void theUserEnsuredAndEnteredValuesForTheFollowingInput(String strName, String strJobTitle, String strContactNo, String strEmail, String strAlternateContactPersonsEmail) {
        objBGPHomePage.enterMainContactPerson(strName,strJobTitle,strContactNo,strEmail,strAlternateContactPersonsEmail);
    }

    @Given("user navigate to contactinfo page")
    public void userNavigateToContactinfoPage() {
        objContactDetails.navigateContactInfoPage();
    }

    @And("the user entered following postal code and verified Block or HNo and Street {string}, {string}, {string}")
    public void theUserEnteredFollowingPostalCodeAndVerifiedBlockOrHNoAndStreet(String arg0, String arg1, String arg2) {
        objContactDetails.enterAndVerifyMailingAddress(arg0,arg1,arg2);
    }

    @Then("user selected existed registered address")
    public void userSelectedExistedRegisteredAddress() {
        objContactDetails.selectExistingAddress();
    }

    @And("user verified the following address {string}, {string}, {string}, {string}, {string},{string}")
    public void userVerifiedTheFollowingAddress(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        objContactDetails.verifyExistingMailingAddress(arg0,arg1,arg2,arg3,arg4,arg5);
    }

    @Then("user entered the following name, job, title {string}, {string}, {string}")
    public void userEnteredTheFollowingNameJobTitle(String arg0, String arg1, String arg2) {
        objContactDetails.enterLetterofAddresse(arg0,arg1,arg2);
    }

    @When("user selected the contacted info")
    public void userSelectedTheContactedInfo() {
        objContactDetails.selectContactInfo();
    }

    @Then("user viewed the following name, job, title {string}, {string}, {string}")
    public void userViewedTheFollowingNameJobTitle(String arg0, String arg1, String arg2) {
        objContactDetails.verifyLetterOfOfferAddressee(arg0,arg1,arg2);
    }

    @Then("user navigate to next page")
    public void userNavigateToNextPage() {
        objContactDetails.navigatebyNext();
    }

    @When("user submitted proposal with following (.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+),(.+)")
    public void userSubmittedProposal(String Proposal_ProjectTitle, String Proposal_StartDate, String Proposal_EndDate, String Proposal_ProjectDescription, String Proposal_Activity, String Proposal_TargetMarket, String Proposal_FirstTime, String Proposal_SupportDoc, String Proposal_remarks){
        Proposal_ProjectTitle =  readData().getProperty(Proposal_ProjectTitle);
        Proposal_StartDate =  readData().getProperty(Proposal_StartDate);
        Proposal_EndDate =  readData().getProperty(Proposal_EndDate);
        Proposal_ProjectDescription =  readData().getProperty(Proposal_ProjectDescription);
        Proposal_Activity =  readData().getProperty(Proposal_Activity);
        Proposal_TargetMarket =  readData().getProperty(Proposal_TargetMarket);
        Proposal_FirstTime =  readData().getProperty(Proposal_FirstTime);
        Proposal_SupportDoc =  System.getProperty("user.dir")+readData().getProperty(Proposal_SupportDoc);
        Proposal_remarks =  readData().getProperty(Proposal_remarks);

        objProposalSection.enterProposalData(Proposal_ProjectTitle, Proposal_StartDate, Proposal_EndDate, Proposal_ProjectDescription, Proposal_Activity, Proposal_TargetMarket, Proposal_FirstTime, Proposal_SupportDoc, Proposal_remarks);
    }
    @Given("user navigate to Proposal section")
    public void userNavigateToProposalSection() {

    }

    @When("user saved the business impact with following (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+)")
    public void userSavedTheBusinessImpact(String FYEndDate, String OverseasSales0, String OverseasSales1, String OverseasSales2, String OverseasSales3, String OverseasInv0, String OverseasInv1, String OverseasInv2, String OverseasInv3, String NonTangibleBenefits, String RationaleforProjections) {
        FYEndDate =  readData().getProperty(FYEndDate);
        OverseasSales0 =  readData().getProperty(OverseasSales0);
        OverseasSales1 =  readData().getProperty(OverseasSales1);
        OverseasSales2 =  readData().getProperty(OverseasSales2);
        OverseasSales3 =  readData().getProperty(OverseasSales3);
        OverseasInv0 =  readData().getProperty(OverseasInv0);
        OverseasInv1 =  readData().getProperty(OverseasInv1);
        OverseasInv2 =  readData().getProperty(OverseasInv2);
        OverseasInv3 =  readData().getProperty(OverseasInv3);
        NonTangibleBenefits =  readData().getProperty(NonTangibleBenefits);
        RationaleforProjections =  readData().getProperty(RationaleforProjections);
        objBusinessImpactSection.BusinessImpactSec(FYEndDate, OverseasSales0, OverseasSales1, OverseasSales2, OverseasSales3, OverseasInv0, OverseasInv1, OverseasInv2, OverseasInv3, NonTangibleBenefits, RationaleforProjections);
    }

    @When("user saved the cost section with the following (.+), (.+), (.+), (.+), (.+)")
    public void userSavedTheCostSectionWithVendordetails (String VendorLoc, String VendorName, String supportdoc, String BillCurrency, String remarks){
        VendorLoc =  readData().getProperty(VendorLoc);
        VendorName =  readData().getProperty(VendorName);
        supportdoc =  System.getProperty("user.dir")+readData().getProperty(supportdoc);
        BillCurrency =  readData().getProperty(BillCurrency);
        remarks =  readData().getProperty(remarks);
        objCostSection.enteruserSavedTheCostSectionWithVendordetails(VendorLoc,VendorName,supportdoc,BillCurrency,remarks);
    }

    @Then("user saved the cost section with following office Space Rental details (.+), (.+), (.+), (.+), (.+)")
    public void userSavedTheCostSectionOfficeSpaceRentalDetails(String OfficespaceRentalDesc, String OfficespaceRentalDuration, String OfficespaceRentalCurrency, String OfficespaceRentalSupportDoc, String OfficespaceRentalRemarks) {
        OfficespaceRentalDesc =  readData().getProperty(OfficespaceRentalDesc);
        OfficespaceRentalDuration =  readData().getProperty(OfficespaceRentalDuration);
        OfficespaceRentalCurrency =  readData().getProperty(OfficespaceRentalCurrency);
        OfficespaceRentalSupportDoc =  System.getProperty("user.dir")+readData().getProperty(OfficespaceRentalSupportDoc);
        OfficespaceRentalRemarks =  readData().getProperty(OfficespaceRentalRemarks);
        objCostSection.enteruserOfficeSpaceRentalDetails(OfficespaceRentalDesc,OfficespaceRentalDuration,OfficespaceRentalCurrency,OfficespaceRentalSupportDoc,OfficespaceRentalRemarks);
    }


    @Then("user saved the cost section with  following salary staff details (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+)")
    public void userSavedSalaryStaffDetails(String SalaryStaffName, String SalaryStaffDesignation, String SalaryStaffNRIC, String SalaryStaffNationalityType, String SalaryStaffRole, String SalaryStaffProjectInvolvment, String SalaryStaffBilCurrency, String SalaryStaffSupportDoc, String salaryStaffRemarksnote) {
        SalaryStaffName=  readData().getProperty(SalaryStaffName);
        SalaryStaffDesignation=  readData().getProperty(SalaryStaffDesignation);
        SalaryStaffNRIC=  readData().getProperty(SalaryStaffNRIC);
        SalaryStaffNationalityType=  readData().getProperty(SalaryStaffNationalityType);
        SalaryStaffRole=  readData().getProperty(SalaryStaffRole);
        SalaryStaffProjectInvolvment=  readData().getProperty(SalaryStaffProjectInvolvment);
        SalaryStaffBilCurrency=  readData().getProperty(SalaryStaffBilCurrency);
        SalaryStaffSupportDoc=  System.getProperty("user.dir")+readData().getProperty(SalaryStaffSupportDoc);
        salaryStaffRemarksnote=  readData().getProperty(salaryStaffRemarksnote);
        objCostSection.enterSalaryStaffDetails( SalaryStaffName,  SalaryStaffDesignation,  SalaryStaffNRIC,  SalaryStaffNationalityType,  SalaryStaffRole,  SalaryStaffProjectInvolvment,  SalaryStaffBilCurrency,  SalaryStaffSupportDoc,  salaryStaffRemarksnote);
    }
    @Then("user saved for review with following declare and ack terms (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+)")
    public void userSavedForReview4(String termsOne, String termsTwo, String termsThree, String termsFour, String termsFive, String termsSix, String termsSeven, String termsEight, String termsNine, String ack){
        termsOne=  readData().getProperty(termsOne);
        termsTwo=  readData().getProperty(termsTwo);
        termsThree=  readData().getProperty(termsThree);
        termsFour=  readData().getProperty(termsFour);
        termsFive=  readData().getProperty(termsFive);
        termsSix=  readData().getProperty(termsSix);
        termsSeven=  readData().getProperty(termsSeven);
        termsEight=  readData().getProperty(termsEight);
        termsNine=  readData().getProperty(termsNine);
        ack=  readData().getProperty(ack);
        objDeclare_Review_Section.enterDeclarAndReview( termsOne,  termsTwo,  termsThree,  termsFour,  termsFive,  termsSix,  termsSeven,  termsEight,  termsNine,  ack);
    }

    @And("user reviewed and submit the application")
    public void userReviewedAndSubmitTheApplication() {
        objCompanyProfile.reviewandSubmit();
    }


    @And("user verified the receiving agency as {string}")
    public void userVerifiedTheReceivingAgencyAs(String arg0) {
        objCompanyProfile.verifyValue(arg0);
    }

    @Then("user navigated to MyGrant dashboard")
    public void userNavigatedToMyGrantDashboard() {
        objCompanyProfile.NavigateToDashboard();
    }

    @Then("user verified the RefID is displayed in processing tab")
    public void userVerifiedTheRefIDIsDisplayedInProcessingTab() {
        objCompanyProfile.verifyRefIDvalue();
    }

    @Given("user viewed the following eligiblity sections and select {string}, {string}")
    public void userViewedTheFollowingEligiblitySectionsAndSelect(String arg0, String arg1) {
        arg0 =  readData().getProperty(arg0);
        arg1 =  readData().getProperty(arg1);
        objBGPHomePage.selectRadiobutton(arg0,arg1);

    }
}
