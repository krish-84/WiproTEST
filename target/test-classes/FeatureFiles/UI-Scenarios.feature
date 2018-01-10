Feature: Wipro WebUI TEST Assignment

@no
Scenario: Scenario1 - Google search for Halifax and navigate to Halifax homepage

Given I am on "https://www.google.co.uk/"
And I search for "Halifax"
When I click Halifax website link from the result
Then I should see Halifax homepage

@no
Scenario: Scenario2 - Go to Lloyds bank homepage and navigate to the log on to Internet Banking page (this should be for BOTH personal and business)

Given I am on "https://www.lloydsbank.com/"
And I cick on personal internet banking
Then I should see personal internet banking page
Given I am on "https://www.lloydsbank.com/"
And I click on business internet banking page
Then I should see business internet banking page

@no
Scenario: Scenario3 - Go to Lloyds bank homepage and navigate to contact us to view all 6 options 

Given I am on "https://www.lloydsbank.com/"
And I click on Contact us page
When I scroll down to see all the 6 options
Then I should be able to see all the 6 options in 1 view









