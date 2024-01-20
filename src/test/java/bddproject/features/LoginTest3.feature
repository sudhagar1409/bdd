Feature: Login

  @smoke @sanity
  Scenario Outline: Login the page
    Given I am in url
    When I am adding <username> and <password>
    Then I am seeing the new page on screen

    Examples: 
      | username  | password |
      | 'DemoCSR' | 'crmsfa' |

  @smoke @sanity
  Scenario Outline: Login the page
    Given I am in url
    When I am adding <username> and <password>
    Then I am seeing the new page on screen

    Examples: 
      | username           | password |
      | 'DemoSalesManager' | 'crmsfa' |
