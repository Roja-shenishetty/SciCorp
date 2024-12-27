

Feature: Fill the form of Funeral
  I want to use this template for my feature file

 

  @Funeral
  Scenario Outline: Entering the form details
    Given I want to open the browser
    When I goto the given url 
    Then system should redirect to the expected page
     
    When I click the link DignityMemorial 
    Then System should goto DignityMemeorial
    When I enter firstName as "<firstname>"
    When I enter lastName as "<lastname>"
    When I enter email as "<email>"
    When I enter phno as "<phno>"
    When I enter zipcode as "<zipcode>"
    When I click GetFreeTrial button
    Then I should see the expected page


    Examples: 
      |firstname|lastname|email|phno|zipcode|
      |xyz|abc|abc@gmail.com|5665455546|12334|
      
      |abc|xyz|abc@gmail.com|5665455546|12334|
     
      