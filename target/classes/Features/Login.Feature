Feature: Login amazon Action
 Scenario: Successful amazon Login with Valid Credentials
	Given User is on amazon Home Page
	When User Navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully
	Then user search books and click on Search button