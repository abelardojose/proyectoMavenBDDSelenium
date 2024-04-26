Feature: Footer

  Background: Precondicion del feature
    Given El usuario entra logueado a la pagina de shopping

  @regression
  Scenario: Verificar las redes sociales del Footer
    Then El usuario verifica que los links sean coorecto: "https://twitter.com/saucelabs" , "https://www.facebook.com/saucelabs", "https://www.linkedin.com/company/sauce-labs/"
