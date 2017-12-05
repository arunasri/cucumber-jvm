Feature: Fat Free CRM Feature

Scenario: Fat Free CRM Login Test Scenario

	Given user is on login page
	When title of login page is fat free crm
	Then user enters username and password
	Then user click on login button
	And user is on dashboard page
	And close the browser

#Scenario: Fat Free CRM verify all tabs
#	Given verify all tabs are present in dashboard page
#	Then click on each tab
#	When click on signout 
