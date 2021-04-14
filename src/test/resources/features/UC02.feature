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

  @UC02
  Scenario: User saved Contact Details Section details
    Given user navigate to contactinfo page
    Given User viewed the "Main Contact Person"
    When the user ensured and entered values for the following input "Krish", "Manager", "98123374", "krishnamoorthy.e@gmail.com", "krishnamoorthy.ee@gmail.com"
    And the user entered following postal code and verified Block or HNo and Street "467202", "9", "RIVIERA DRIVE"
    Then user selected existed registered address
    And user verified the following address "650320", "320", "BUKIT BATOK STREET 33", "03", "33",""
    Then user entered the following name, job, title "Krish", "Manager", "krishnamoorthy.e@gmail.com"
    When user selected the contacted info
    Then user viewed the following name, job, title "Krish", "Manager", "krishnamoorthy.e@gmail.com"
    When user saved the form
    Given User viewed the "Draft Saved"
    And user verified the following address "650320", "320", "BUKIT BATOK STREET 33", "03", "33",""
    Then user viewed the following name, job, title "Krish", "Manager", "krishnamoorthy.e@gmail.com"