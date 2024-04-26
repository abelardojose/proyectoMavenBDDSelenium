Feature: Login

  Background: Precondicion del Feature
    Given El usuario navega a la pagina

  @regression
  Scenario: Credenciales invalidas
    When El usuario escribe el username "locked_out_user" con el password "secret_sauce" y presiona el boton de Login
    Then Debe aparecer un mensaje de error indicando "Epic sadface: Sorry, this user has been locked out."

  @regression
  @Smoke
  Scenario: Verificar la pagina de Login
    Then El usuario verifica la UI de la pagina de Login sea correcta