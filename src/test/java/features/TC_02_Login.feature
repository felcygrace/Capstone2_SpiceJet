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

Feature: Login feature to test Login functionality 
  I want to test Login functionality

 Scenario: User successfully logs in with valid credentials 
	Given First user is on the SpiceJet login page 
	When First user enters valid userid <validMailId> 
	And First user enter valid password    <validPassword>
	And First user clicks on the login button 
	Then First user validate the login successfully or not 
	
Scenario: User logs in with invalid credentials 
	Given  second user is on the SpiceJet login page 
	When  second user enters invalid userid  <inValidMailId> 
	And  second user enter valid password  <validPassword>
	And  second user clicks on the login button 
	Then  second user validate the login successfully or not 

Scenario: logs in with invalid credentials 
	Given  Third user is on the SpiceJet login page 
	When  Third user enters valid userid  <validMailId>
	And  Third user enter invalid password  <InValidPassword>
	And  Third user clicks on the login button 
	Then  Third user validate the login successfully or not 
    
 Examples: 
  |validMailId|validPassword|inValidMailId|InValidPassword|
	|felcygrace001@gmail.com|Felcy@12s|test@gmail.com|felcy@34|