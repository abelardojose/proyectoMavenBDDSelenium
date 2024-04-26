Feature: Item Detail

  Background: Precondicion del feature
    Given El usuario va al detalle del item llamado "Sauce Labs Fleece Jacket"

  @regression
  Scenario: Verificar el UI del detalle
    Then El usuario verifica que la UI de la pagina del detalle del item sea coorecto

  @regression
  Scenario: Regresar a la pagina de Shopping
    When El usuario da click en Back to products
    Then La aplicacion redirige a la pagina de Shopping
