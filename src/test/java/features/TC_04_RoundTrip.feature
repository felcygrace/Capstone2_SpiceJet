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
Feature: Booking Round trip on SpiceJet website 
@tag
 Scenario: Book a Round Trip 
	Given SecondUser on the SpiceJet website homepage for roundtrip 
	When SecondUser select the round trip option for roundtrip 
	And SecondUser enter the departure city for roundtrip  "<DepartureCity>" "<DestinationCity>"
	And SecondUser select the departure date for roundtrip "<DepartureDate>"
	And SecondUser select the return date for roundtrip  "<ReturnDate>"
	And SecondUser select the passengers for roundtrip 
	And SecondUser select the currency for roundtrip 
	And SecondUser click on the search flights button for roundtrip 
	Then SecondUser should see a list of available flights for the specified route and date for roundtrip  
	
	Examples: 
	|DepartureCity|DestinationCity|DepartureDate   | ReturnDate |
	|Malaysia     |Chennai        |Fri, 30 June 2024| Sat, 01 July 2024 |

