Feature: Amazon Signin page
Scenario: Signin with valid username and invalid password credintials
Given Launch the chromeBrowser and maximize window
When Launch the url of the amazon 
Then  I enter the  valid username
Then  I enter the invalid password 
And I click on the sign in button
Then close the  page 