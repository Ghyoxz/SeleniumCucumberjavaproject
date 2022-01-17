Feature: Probar la funcionalidad de Google

Scenario: Busco algo en Google.
    Given navego a Google
    When busco algo
    And  hago click en el boton
    Then obtengo resultados