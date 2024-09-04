@Login
Feature: login functionlity

  Scenario: login with valid credentials
    Given enter the url click on my account button and select login
    When enter the valid email id "charan129kelam@gmail.com "
    Then enter the valid passward "Chinni@18"
    And click on login button
    Then the user will successfully login

  Scenario: login with invalid credentials
    Given enter the url click on my account button and select login
    When enter the invalid email id "abrar0664@gmail.com"
    Then enter the invalid passward "Chinni@189"
    And click on login button
    Then it notifies Warning

  Scenario: login with valid email and invalid passward
    Given enter the url click on my account button and select login
    When enter the valid email id "charan129kelam@gmail.com "
    Then enter the invalid passward "abbu123445"
    And click on login button
    Then it notifies Warning

  Scenario: login with invalid email and valid passward
    Given enter the url click on my account button and select login
    When enter the invalid email id "abrar0664@gmail.com "
    Then enter the valid passward "Chinni@18"
    And click on login button
    Then it notifies Warning

  Scenario: login without providing any data
    Given enter the url click on my account button and select login
    When without email id
    Then without passward
    And click on login button
    Then it notifies Warning
