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
@search
Feature: Search Flights

	Scenario: User can select valid input for Search
		Given User can access Flight Page
		When User enters '<From>' and '<To>'
		And Selects valid '<DeptDate>' , '<ReturnDate>'	, '<Travellers>'
		And User clicks on Search
		Then User can view Valid Search Result
		
		Examples:
		|From|To|DeptDate|ReturnDate|Travellers|
		|Mumbai|Bengaluru|Sat Jan 28 2023|Sun Jan 29 2023|3|
#		|Bengaluru|Mumbai|Sat Jan 07 2023|Sun Jan 08 2023|3|
		
		
	Scenario: User cannot proceed when invalid input are selected
		Given User can access Flight Page
		When User enters '<From>' and' <To>'
		And Selects invalid '<DeptDate>' , '<ReturnDate>	', '<Travellers>'
		And User clicks on Search
		Then User can view InValid Search Message
		
		Examples:
		|From|To|DeptDate|ReturnDate|Travellers|
		|Mumbai|Bengaluru|Sat Jan 01 2023|Mon Jan 02 2023|3|
#		|Bengaluru|Mumbai|Sat Jan 07 2023|Sun Jan 08 2023|3|
		
	Scenario: User can view List
		Given User entered valid data
		And User is directed to Flight List page
		Then User can view List of Flights  

	Scenario: User can view cheapest option
		Given User has access to Search Result List
		And user can view Cheapest option
		And user can click on continue button
		Then user is redirected to booking page
	
		