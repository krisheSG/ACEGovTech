@Regression
Feature: As an Applicant, I should be able to input values for the Main Contact Person and Letter of Offeree in the Contact Details page.

  Background:
#  Scenario: User logs in BGP portal with CorpPassb
    Given User launched BGP portal home page in "Web"
    And the user logged using the following input NRIC, NAME, UEN, ROLE
    Given User viewed the Get new grant options in the Applications Tab
    When the user selected the following sector "IT"
    And the user needed to grant to the following option "Bring my business overseas or establish a stronger international presence"
    And the user needed to plan with the following option "Market Readiness Assistance"
    And the user created a draft form by using Apply
    Then the user proceed to enter form

  @UC03
  Scenario: User submitted the form and verify the details in the dashboard
    And user viewed "Is the applicant registered in Singapore?" and select "Yes"
    And user viewed "Is the applicant's group sales turnover less than or equal to S$100m or is the applicant's group employment size less than or equal to 200?" and select "Yes"
    And user viewed "Does the applicant have at least 30%  local equity?" and select "Yes"
    And user viewed "Is the target market that you are applying for a new market? A market is new if your company's revenue from there has not exceeded $100,000 for any of the last 3 years." and select "Yes"
    And user viewed "Are all the following statements true for this project?" and select "Yes"
    When user saved the form
    Given user navigate to contactinfo page
    When the user ensured and entered values for the following input "Krish", "Manager", "98123374", "krishnamoorthy.e@gmail.com", "krishnamoorthy.ee@gmail.com"
    Then user selected existed registered address
    And user verified the following address "650320", "320", "BUKIT BATOK STREET 33", "03", "33",""
    When user selected the contacted info
    Then user viewed the following name, job, title "Krish", "Manager", "krishnamoorthy.e@gmail.com"
    When user saved the form
    Then user navigate to next page
    When user submitted proposal with following Proposal_ProjectTitle,Proposal_StartDate,Proposal_EndDate,Proposal_ProjectDescription,Proposal_Activity,Proposal_TargetMarket,Proposal_FirstTime,Proposal_SupportDoc,Proposal_remarks
    When user saved the form
    When user saved the business impact with following FYEndDate, OverseasSales0, OverseasSales1, OverseasSales2, OverseasSales3, OverseasInv0, OverseasInv1, OverseasInv2, OverseasInv3, NonTangibleBenefits, RationaleforProjections
    When user saved the form
    When user saved the cost section with the following VendorLoc, VendorName, supportdoc, BillCurrency, remarks
    Then user saved the cost section with following office Space Rental details OfficespaceRentalDesc, OfficespaceRentalDuration, OfficespaceRentalCurrency, OfficespaceRentalSupportDoc, OfficespaceRentalRemarks
    Then user saved the cost section with  following salary staff details SalaryStaffName, SalaryStaffDesignation, SalaryStaffNRIC, SalaryStaffNationalityType, SalaryStaffRole, SalaryStaffProjectInvolvment, SalaryStaffBilCurrency, SalaryStaffSupportDoc, salaryStaffRemarksnote
    When user saved the form
    Then user saved for review with following declare and ack terms termsOne, termsTwo, termsThree, termsFour, termsFive, termsSix, termsSeven, termsEight, termsNine, ack
    And user reviewed and submit the application
    And user verified the receiving agency as "Enterprise Singapore"
    Then user navigated to MyGrant dashboard
    Then user verified the RefID is displayed in processing tab
