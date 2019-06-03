Feature: Testing Conference Registration

Background: 
Given User is on 'ConferenceRegistration' Page
@execute
Scenario: Valid Details


When user enter valid details
Then display 'Personal details are been validated'



@execute
Scenario: Invalid FirstName


When user enter invalid firstName
Then display 'Please fill First Name' 

@execute
Scenario: Invalid LastName

When user enter invalid lastName
Then display 'Please fill Last Name' 

@execute
Scenario: Invalid Email


When user enter invalid email
Then display 'Please fill Email' 


@execute
Scenario: Invalid contact Number


When user enter invalid contact number
Then display 'Please fill valid Contact no.' 


@execute
Scenario: Invalid Number of People attending


When user enter invalid Number of People attending
Then display 'Number of people attending' 

@execute
Scenario: Invalid Building name and room no

When user enter invalid Building name and room no
Then display 'Please fill the Building name and room no' 

@execute
Scenario: Invalid Area name


When user enter invalid Area name
Then display 'Please fill Area name' 


@execute
Scenario: Invalid City


When user enter invalid City
Then display 'Please fill City' 

@execute
Scenario: Invalid State


When user enter invalid State
Then display 'Please fill the State' 

@execute
Scenario: Invalid Member Status


When user enter invalid Member Status
Then display 'Please fill the Member Status' 

