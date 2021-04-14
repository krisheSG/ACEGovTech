@Regression
Feature: As an Applicant, I should be able to answer a set of Yes/No Eligibility questions in the Eligibility page.


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

  @UC01
  Scenario: User entered eligbility and verify alert message for no
    Given User viewed the "Check Your Eligibility"
    When user viewed "Is the applicant registered in Singapore?" and select "No"
    Then user ensured the following message is displayed "The applicant may not meet the eligibility criteria for this grant. Visit FAQ page for more information on other government grants."
    And user viewed "Is the applicant registered in Singapore?" and select "Yes"

    When user viewed "Is the applicant's group sales turnover less than or equal to S$100m or is the applicant's group employment size less than or equal to 200?" and select "No"
    Then user ensured the following message is displayed "The applicant may not meet the eligibility criteria for this grant. Visit FAQ page for more information on other government grants."
    And user viewed "Is the applicant's group sales turnover less than or equal to S$100m or is the applicant's group employment size less than or equal to 200?" and select "Yes"

    When user viewed "Does the applicant have at least 30%  local equity?" and select "No"
    Then user ensured the following message is displayed "The applicant may not meet the eligibility criteria for this grant. Visit FAQ page for more information on other government grants."
    And user viewed "Does the applicant have at least 30%  local equity?" and select "Yes"

    When user viewed "Is the target market that you are applying for a new market? A market is new if your company's revenue from there has not exceeded $100,000 for any of the last 3 years." and select "No"
    Then user ensured the following message is displayed "The applicant may not meet the eligibility criteria for this grant. Visit FAQ page for more information on other government grants."
    And user viewed "Is the target market that you are applying for a new market? A market is new if your company's revenue from there has not exceeded $100,000 for any of the last 3 years." and select "Yes"

    When user viewed "Are all the following statements true for this project?" and select "No"
    Then user ensured the following message is displayed "The applicant may not meet the eligibility criteria for this grant. Visit FAQ page for more information on other government grants."
    And user viewed "Are all the following statements true for this project?" and select "Yes"

    When user saved the form
    Given User viewed the "Draft Saved"
   And user ensured saved option with Yes is not changed after the screen refresh




#  @UC02
#  Scenario: User enters
#    Given user navigate to contactinfo page
#    Given User viewed the "Main Contact Person"
#    When the user ensured and entered values for the following input "Krish", "Manager", "98123374", "krishnamoorthy.e@gmail.com", "krishnamoorthy.ee@gmail.com"
#    And the user entered following postal code and verified Block or HNo and Street "467202", "9", "RIVIERA DRIVE"
#    Then user selected existed registered address
#    And user verified the following address "650320", "320", "BUKIT BATOK STREET 33", "03", "33",""
#    Then user entered the following name, job, title "Krish", "Manager", "krishnamoorthy.e@gmail.com"
#    When user selected the contacted info
#    Then user viewed the following name, job, title "Krish", "Manager", "krishnamoorthy.e@gmail.com"
#    When user saved the form
#    Given User viewed the "Draft Saved"
#    And user verified the following address "650320", "320", "BUKIT BATOK STREET 33", "03", "33",""
#    Then user viewed the following name, job, title "Krish", "Manager", "krishnamoorthy.e@gmail.com"
