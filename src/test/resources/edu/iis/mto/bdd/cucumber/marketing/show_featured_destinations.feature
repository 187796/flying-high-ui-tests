@feat-destinations
Feature: Booking a flight
In order to encourage travellers to travel more
As an airline
I want to show travellers exciting destinations when they log on

Scenario: Displaying featured destinations
	Given Joe has logged on
	When Jane views the home page
	Then she should see 3 featured destinations
	And the featured destinations should include Singapore costing 900