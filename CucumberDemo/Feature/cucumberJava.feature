Feature: CucumberJava

Scenario: Login functionality exists
Given I have open the browser
When I open Facebook website
And  Search for flights details  
And Close
And before Close 
Then Login button should exits
