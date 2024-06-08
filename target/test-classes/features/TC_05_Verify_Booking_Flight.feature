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
Feature: Select and Proceed to Booking Page on SpiceJet Website 

Scenario: Select a Flight and Proceed to Booking 
	Given I am on the SpiceJet website homepage for booking 
	When I search for flights from "<DepartureCity>" "<DestinationCity>" "<DepartureDate>" 
	And I select a flight from the search results 
	And I proceed to the booking page "<title>" "<lastName>" "<mobileNumber>" "<firstName>" "<email>" "<city>" "<titleforpassenger>" "<lastNameforpassenger>" "<mobilenumberforpassenger>" "<cardnumber>" "<cardholdername>" "<cardmonth>" "<cardyear>" 
	Then I should be directed to the booking page to complete the reservation 
	
	
	Examples: 
	|DepartureCity|DestinationCity|DepartureDate|title|lastName|mobileNumber|firstName|email|city|titleforpassenger|lastNameforpassenger|cardnumber|cardholdername|cardmonth|cardyear|
	|MAA|DEL| Thu, 11 July 2024|Mr|paul|6756678903|john|john@gmail.com|chennai|Mr|god|1234 5678 9012 2587|paul|05|2026|
	
	
	
	
	
	
	
	