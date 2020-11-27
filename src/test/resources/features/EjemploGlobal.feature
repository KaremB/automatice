# language: es

  Característica: Realizar compras de articulos
  Como un nuevo cliente
  Quiero ingresar a la pagina http://automationpractice.com/index.php
  Para realizar una compra de una prenda

    @EscenarioSinEjemplos
  Escenario: Agregar articulos al carrito de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el agrega 3 unidades de Blouse para Mujer al carro
    Entonces el ve los productos listados en el carro de compras
