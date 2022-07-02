@authentificationCorrecte
Feature: Authentification to app SwagLabs
  ETQ user je souhaite me connecter to the app SwagLabs

  @authentification_ok
  Scenario Outline: Authentification avec user correct avec accés
    Given Je me connecte to the app "https://www.saucedemo.com/"
    When Je saisis le username "<username>" et le password "<password>"
    And Je clique sur le bouton LOGIN
    Then Je me redirige vers la page "PRODUCTS"

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
