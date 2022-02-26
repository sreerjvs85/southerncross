Feature: Registration feature with various scenarios
  @New
  Scenario Outline: Register a new user and capture message in the event of success and failure
    Given I'm on home screen of Buggy app using "<browser>" and clicked on Register button
    When I enter username "<user>", firstname "<fname>", lastname "<lname>", password "<pass>", confirm password "<cpass>" and click submit
    Then If i get error message, capture and validate the "<message>".
    Examples:
      |browser    | user       | fname      | lname     | pass      | cpass     | message                    |
      |chrome     |tu13550     | test       | user      | T#st1234  | T#st1234  | Registration is successful |
      |chrome     |tu13591     | test       | user      | T#st1234  | T#st1234  | UsernameExistsException: User already exists |
      |chrome     |tu13591     | test       | user      | T#st123   | T#st123   | InvalidPasswordException: Password did not conform with policy: Password not long enough |
      |chrome     |tu13591     | test       | user      | T#ST1234  | T#ST1234  | InvalidPasswordException: Password did not conform with policy: Password must have lowercase characters |

