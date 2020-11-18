Feature: BookingLogin

  Scenario: I run Booking Login Test
    Given I go to BOOKING.COM
    When I Login on site
    Then I verified result as expected