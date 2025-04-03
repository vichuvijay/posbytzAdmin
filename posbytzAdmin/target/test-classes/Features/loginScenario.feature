Feature: Login scenario

  @Regression
  Scenario: login with valid credentials
  	Given User Entering valid username and valid password
    Then Click Login button
    And Now logout

  Scenario: login with invalid credentials(invalid username and valid password)
    Given user enter invalid username and valid password
    And Click Login button
    Then Credential mismatch error should be thrown
    	
  Scenario: login with invalid credentials(valid username and invalid password)
    Given user enter valid username and invalid password
    And Click Login button
    Then Credential mismatch error should be thrown
  
  Scenario: login with valid username and empty password credentials
    Given user enter valid username and empty password
  	And Click Login button
  	And password required message should be shown
  
  Scenario: login with empty username and valid password credentials
    Given user enter empty username and valid password
  	And Click Login button
  	And username required message should be shown
 
  Scenario: login with empty credentials
  	Given Click Login button
  	And password required message should be shown
  	And username required message should be shown
