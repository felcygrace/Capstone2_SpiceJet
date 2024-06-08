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
Feature: Validate Fields on Booking Page 


Scenario: Verify presence of Check-in field 
	Given I am on the booking page Check-in field  "<pnrNumber>" "<email>" 
	Then I should see the Check-in field 
	
Scenario: Verify presence of Flight Status field 
	Given I am on the booking page Flight Status field  "<from>"  "<to>" 
	Then I should see the Flight Status field 
	
Scenario: Verify presence of Manage Booking field 
	Given I am on the booking page Flight Status field  "<pnrNumber>" "<email>" 
	Then I should see the Flight Status field 
	
	Examples: 
	|pnrNumber|email|from|to|
	|y5875|john@gmail.com|MAA|DEL|