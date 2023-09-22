Feature: To Validate the login functionality in eyebuydirect application
Scenario Outline: To validate the login with username and password
Given User has to enter "<Username>" and "<Password>"
When User has to click the login button
Then User has to verify the credentials page	

Examples:
|Username									|Password				|
|asasi006@gmail.com				|pree0505				|
|narmi2525@gmail.com			|pari0505				|
|ashoksasi001@gmail.com 	|play0505				|
