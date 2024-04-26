Feature: Burger Menu

  Background: Precondicion del feature
    Given El usuario entre a logueado y abre el burger menu


  @regression
  Scenario: Logout
    When El usuario hace clic en la opcion logout
    Then La aplicacion redirige a la pagina de login

  @regression
  Scenario: About
    Then El usuario verifica la opcion de About tenga el link correcto de "https://saucelabs.com/"