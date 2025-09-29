Feature: Se inicia sesión correctamente

  Scenario: Verificar el login de la página
    Given El usuario ingresa a la pagina
    When El usuario ingresa sus credenciales
    Then El usuario hace login correctamente
