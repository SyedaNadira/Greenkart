

  @GreenKart
  Feature:Verify GreenKart item shipment
  Scenario: Successfully ship to United States
    Given go to GreenKart home page
    And user verify the page title
    When user capture the all items from the page
    And print sorted price in decending order
    And add secend and third items into cart
    Then user go to cart page
    And user varify total price
    And user go to next page to select country "United States"
    And user verify successfully shipped items

 
