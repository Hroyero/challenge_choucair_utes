#Autor: Hollmans Royero Mendoza
@stories
Feature: uTest
  As a user, I want to be able to register on the Utest page

  @scenario1
  Scenario Outline: search for registration option in Utest
    Given  Hollmans wants to register in Utest
    When he search for the option to registe and fill the registration form
      | strFirstName   | strLastName   | strEmailAddress   | strMonth   | strDay   | strYear   | strCity   | strPostal     | strPassword   | strConfirmPassword   |
      | <strFirstName> | <strLastName> | <strEmailAddress> | <strMonth> | <strDay> | <strYear> | <strCity> | <strPostal>   | <strPassword> | <strConfirmPassword> |
    Then he registers on the page
      | strRegistered    |
      | <strRegistered>  |

    Examples:
      | strFirstName   | strLastName | strEmailAddress           |  strMonth   | strDay    | strYear     |  strCity | strPostal  |   strPassword   | strConfirmPassword   | strRegistered     |
      | Hollmans       | Royero      | vefeilfqh823@greenkic.com |  number:7   | number:22 | number:1996 |  Bogota  | 1234567    |  #6Bla#Ta#L8S   | #6Bla#Ta#L8S         | Complete Setup    |