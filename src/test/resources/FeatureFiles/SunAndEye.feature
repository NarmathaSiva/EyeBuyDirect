Feature: To validate Sunglasses and Eyeglasses Page

Background: 
Given User has to signin the EyeBuyDirect application with "parithisasi21@gmail.com" and "parithi2021"

Scenario: To validate number of items in Sunglasses by using filters
When User has to click Sunglasses
Then User has to select filters 
And User has to validate the number of items displayed

Scenario: To validate number of items in Eyeglasses by using filters
When User has to click Eyeglasses
Then User has to select filters 
And User has to validate the number of items displayed