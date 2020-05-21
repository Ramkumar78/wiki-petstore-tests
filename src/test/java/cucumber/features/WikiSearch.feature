Feature: Search
  As a user, I want to view search results in different languages

  Scenario: Search on homepage and view the results in different language
    Given I search for "showbiz" and select "English" as the language of choice
    Then the Search result should be displayed with the first heading containing "showbiz"
    Then the search result should be available in "Deutsch" language
    And I select "Deutsch" language option and result is displayed in "de"
    Then the search result should be available in "English" language





