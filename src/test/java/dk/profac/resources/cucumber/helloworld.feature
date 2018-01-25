Feature: HelloController

  Scenario: Hello World test
    Given I have a function index that return a string saying Hello world
    When I call index function
    Then my string should be set to hello world