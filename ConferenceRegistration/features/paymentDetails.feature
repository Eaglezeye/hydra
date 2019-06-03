Feature: Testing Payment Details


Background:
Given user is on Payment Details page
@execute
Scenario: Valid Title


When user enter load the page
Then valid page should open

@execute
Scenario: Invalid cardHolder name


When user enter invalid name
Then display 'Please enter the name correctly'

@execute
Scenario: Invalid Debit Card Number


When user enter the invalid Debit Card Number
Then display 'Please enter the Card Number correctly'


@execute
Scenario: Invalid expiration month


When user enter invalid expiration month
Then display 'Please enter correct month of expiration'
  
@execute
Scenario: Invalid expiration year

When user enter invalid expiration year
Then display 'Please enter correct year of expiration'
  
@execute
Scenario: Valid details

When user enter valid  payment details
Then display 'Conference Room Booking is done successfully' 