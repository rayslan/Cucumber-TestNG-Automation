Feature: User Interface for Tesla

@Tesla

Scenario: Tesla HomePage Menu
	Given I am on the main home page
	Then  The title of the website should be displayed properly
	And I click to CyberTruck link
	Then I am on CyberTruck home page