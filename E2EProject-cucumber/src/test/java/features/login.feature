Feature: Log into Application

Scenario: Positive test validation login
Given Initialize the browser with chrome
And Navigate to "http://qaclickacademy.com" Site
And CLick on Login link in home page to land on Secure sign Page 
When User enters "test99@gmail.com" and "12345" and logs in 
Then Verfiy that user is succesfully logged in 
And Close browser
