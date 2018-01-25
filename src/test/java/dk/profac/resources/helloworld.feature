//Feature: <feature title>
//As a <persona|role>
//I want to <action>
//So that <outcome>

Feature: HelloWorld

  Scenario: Hello World test
    Given I have a function index that return a string saying Hello world
    When I call index function
    Then my string should be set to hello world