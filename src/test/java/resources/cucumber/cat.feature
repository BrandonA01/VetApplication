Feature: Cat object
  Testing the cat object

  Scenario: Cat eats
    Given Cat is hungry
    When Cat kills another animal
    Then Cat should eat