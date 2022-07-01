@authentificationIncorrecte
Feature: Authentification to app SwagLabs
  ETQ user je souhaite me connecter to the app SwagLabs

  @authentification_lockedOut
  Scenario: Authentification avec user lockedOut
    Given Je me connecte to the app "https://www.saucedemo.com/"
    When Je saisis le username "locked_out_user" et le password "secret_sauce"
    And Je clique sur le bouton LOGIN
    Then Je vérifie affichage un alerte "Epic sadface: Sorry, this user has been locked out."
