Feature: Registration scenario

@Regression
Scenario: Signup with valid data
Given User entered signup page
Then selected the Business type
And Entered Emailid and mobile number
And user click register button
And Redirect to home page

Scenario: Signup with invalid emailid and password
Given User entered signup page
Then selected the Business type
And Entered invalid Emailid and mobile number
And user click register button
Then display validation as invalid emailid

Scenario: Signup with exist emailid
Given User entered signup page
Then selected the Business type
And entered existing emailid and mobile number
Then user click register button
Then validation message should appear as already taken

Scenario: Register with empty data
Given User entered signup page
When user click register button
Then validation should display