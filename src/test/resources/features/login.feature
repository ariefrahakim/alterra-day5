@Web
  Feature: Login Feature

    @Login
    Scenario: Login
      Given user input "<username>" and "<password>"
      And user click login button
      Then user success login
#      Examples:
#      |username         |  password     |
#      |standard_user    | secret_sauce  |
#      |locked_out_user  | secret_sauce  |
