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

Feature: Sign up Functionality of Spice Jet Flight Booking System
  I want to test Signup Functionality 

 Scenario Outline: Sign Up testcase 
	Given User is on the Home Page 
	When User click the sign up menu 
	And User select the title option <value> 
	And User enter the firstname <firstname> 
	And User enter the lastname <lastname> 
	And User select the country <country> 
	And User select the date of birth <dob> 
	And User enter the mobile number <mobilenumber> 
	And User enter the email id <mailid> 
	And User enter the password <password> 
	And User enter the confirm password <confirmpassword> 
	And User click the agree 
	And User click the submit 
	Then Validate the sign up successfully or not 

    Examples: 
      |value| firstname | lastname  |  country  | dob         |  mobilenumber  |  mailid             | password    |  confirmpassword  |
      |Ms | felcy     | singaraj         |  India    | 12/12/1998  |  6381698553 |  felcy012gmail.com  | Felcy@12s   |  Felcy@12s        |
      
