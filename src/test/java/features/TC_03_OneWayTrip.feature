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

Feature: Booking one way trip on SpiceJet website 

 Scenario: Book a One-Way Trip 
	Given User_i is on the Home Page
	When User select the oneway trip option 
	And User enter the departure city as "<DepartureCity>" and destination city as "<DestinationCity>" 
	And User select the departure date as "<DepartureDate>" 
	And User select the passengers 
	And User select the currency 
	And User click on the search flights button 
	Then User should see a list of available flights for the specified route and date 
	
	Examples: 
	|DepartureCity|DestinationCity|DepartureDate   |
	|AGR      |DEL      |Fri, 30 June 2024|
