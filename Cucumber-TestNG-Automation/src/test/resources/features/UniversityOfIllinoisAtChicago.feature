Feature: UIC Website Test

  @UIC
  Scenario: UIC home page test
    Given I am on the UIC main homepage
    When I hover over the ACADEMICS menu
    Then following menu options should be visible
      | Academic Resources   |
      | Undergraduate Majors |
      | Graduate Programs    |
      | Colleges & Schools   |
      | Health Sciences      |
      | Class Registration   |
      | Libraries            |
      | Global Engagement    |

  @UIC
  Scenario: UIC home page test
    Given I am on the UIC main homepage
    When I hover over the ABOUT menu
    Then following menu options should be visible.
      | About Arizona           |
      | Purpose & Values        |
      | Faculty Awards & Honors |
      | Traditions & Culture    |
      | Diversity & Inclusion   |
      | Strategic Plan          |
      | News                    |
