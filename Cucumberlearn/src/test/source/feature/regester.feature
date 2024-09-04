Feature: register functionality


Scenario: new user should register
Given user should navigate to the register page
When user should provide the details
|First Name       |Syed               |
|Last Name        |Abrar              |
|E-mail           |abrar0664@gmail.com|
|Telephone        |9494430520         |
|Password         |Abrar@12345        |
|Password Confirm |Abrar@12345        |
Then user should select the subscribe yes check button
And check the privacy policy
Then click on continue button



Scenario: new user should register
Given user should navigate to the register page
When user should provide the details
|First Name       |Syed               |
|Last Name        |Abrar              |
|E-mail           |abrar0664@gmail.com|
|Telephone        |9494430520         |
|Password         |Abrar@12345        |
|Password Confirm |Abrar@12345        |
Then user should select the subscribe No check button
And check the privacy policy
Then click on continue button