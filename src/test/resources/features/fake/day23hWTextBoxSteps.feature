Feature: day23homeWork

  @53079 //Test case number in test rail
  Scenario: I run Text Box Test
    Given I go to text-box
    When I start checking text box
    Then I check is element displayed

  @53080
  Scenario: I run Check Box Test
    Given I go to checkbox
    When I start checking check box
    Then I check is element chosen

  @53081
  Scenario: I run Check Form Edit
    Given I go to webtables
    When I start checking form edit
    Then I check is form edited

  @53082
  Scenario: I run Check Radio Button
    Given I go to radio-button
    When I start checking radio button
    Then I check is radio button work

  @53083
  Scenario: I run Check Buttons
    Given I go to buttons
    When I start checking buttons
    Then I check is buttons work