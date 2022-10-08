Feature: Hotel Booking In Adactin Application

@Ad1
Scenario Outline: This is Login Page

Given user Launch The Application 

When user Enter The "<Username>" In User Field

And user Enter The "<Password>" In Password Field

Then user Click On The Login Button And It Navigates To The Search Hotel Page

Examples:
|Username|Password|
|geetha|gee456|
|thiaygu|rajan876|
|nandha619|RQ7221|

@Ad2
Scenario: This is  Search Hotel Page

When user Enter The Hotel Location

And user Select The "Hotel Sunshine"

And user Select Room Type

And user Select No's  Rooms

And user Select Check In Date

And user Select Check Out Date

And user Select Adults Per Room

And user Select Children Per Room  

Then user Click On The Search Button And It Navigate To Select Hotel Page

@Ad3
Scenario: This is Select Hotel Page

When user Select Any One Radio Button 

Then user Click On The Continue Button And It Navigate To Book Hotel Page

@Ad4
Scenario: This is Book Hotel Page

When user Enter The First Name

And user Enter The Last Name

And user Enter The 	Address

And user Enter The Credit Card No

And user Enter The Credit Card Type

And user Select Card Expiry Month

And user Select Card Expiry Year

And user Enter The CVV No

Then user Click On The Book Now Button And It Navigate To Booking Confirmation

@Ad5
Scenario: This is Booking Confirmation

Then user Click On The My Itinary And It Navigate To Booked Itinary

Scenario: This is Booked Itenary

Then user Click On The Logut Button And It Navigate To Successfully Logged Page

Scenario: This is SuccessFully Logged Page

Then user Click On The Click Here To Login Again  Button And It Navigate To Login Page


