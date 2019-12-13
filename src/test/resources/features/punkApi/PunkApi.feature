Feature: Smoke Tests to test Punk API

  Background: Send request to Punk Api
    When I send request to punk api

  @smoke @regression @test
  Scenario: Able to Access Punk API
    And I retrieve beers
    Then I should get 200 responce
    And I should have list of beers
    When I have step def
