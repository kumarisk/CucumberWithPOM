Feature: Facebook Login feature

Scenario: user login with vaild credentials

When user is on login page
Then validate title
Then user enters useremail and password

Then user verify logged in user
