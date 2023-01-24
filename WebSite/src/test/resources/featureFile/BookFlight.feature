#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Search
Feature: Book Flight

	Scenario: User can select Travel insurance option
		Given User is redirected to Booking Page
		And user can access the Travel insurance section
		Then user can select valid option
		
		
	Scenario: User can Select valid Promo Codes
		Given User has access to book flight page
		And User can view Promo Code Section
		And User Selects a promo code
		Then User can view added promo code
		
		
	Scenario: User can enter valid Traveller details
		Given Traveller detail section is visible
		And User can access Add Button
		And user enters "<First name>", "<Last name>", "<Gender>"
		Then user can proceed to add another Traveller
		
		Examples:
		|First name|Last name|Gender|
		|John|White|Male|
		#|Steve|Mark|Male|
		
	Scenario: User can Enter Booking Details
		Given Booking detail section is displayed
		And user enters "<Phone Number>","<email>"
		Then user can click on Continue Button
		
		Examples:
		|Phone Number|email|
		|9988777652|test@test.com|

	Scenario: Error message on invalid entry
		Given User can access Book Flight page
		And User clicks on Continue button without entering details
		Then Error Message should be displayed
		

#	Scenario: User can view Summary Page  
#		Given User has entered all valid entry
#		And user clicked on continue button
#		Then User can view Summary Page of booking Details