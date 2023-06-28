#language: es

Característica: Proceso de compra de un producto en la pagina de Saucedemo
  Se quiere realizar la compra de un producto en una pagina web

  @IniciarSesion
  Esquema del escenario: Realizar el login de la pagina web
    Dado que el usuario ingreso a la pagina Saucedemo
    Cuando digita los datos de usuario
      | usuario   |  | clave   |
      | <usuario> |  | <clave> |
    Y le da clic login
    Entonces visualizara el inicio de la pagina
    Ejemplos:
      | usuario       |  | clave        |
      | standard_user |  | secret_sauce |

  @RealizarCompra
  Esquema del escenario: Realizar la compra de un producto  en una pagina web
    Dado que el usuario ingreso a la pagina Saucedemo
    Y digita los datos de usuario
      | usuario   |  | clave   |
      | <usuario> |  | <clave> |
    Cuando agrega los producto al carrito de compra
    Y realiza el proceso de compra
    Entonces se valida el producto Sauce Labs Backpack
    Y se valida el valor del producto sea $29.99
    Ejemplos:
      | usuario       |  | clave        |
      | standard_user |  | secret_sauce |

  @RemoverProducto
  Esquema del escenario: Remover producto del carrito de compra
    Dado que el usuario ingreso a la pagina Saucedemo
    Y digita los datos de usuario
      | usuario   |  | clave   |
      | <usuario> |  | <clave> |
    Cuando agrega 3 producto al carrito de compra
    Y  remueve un producto del carrito
    Entonces se valida los 2 articulos en el carrito

    Ejemplos:
      | usuario       |  | clave        |
      | standard_user |  | secret_sauce |

  @Agregarproducto
  Esquema del escenario: Agregar producto al carrito de compra
    Dado que el usuario ingreso a la pagina Saucedemo
    Y digita los datos de usuario
      | usuario   |  | clave   |
      | <usuario> |  | <clave> |
    Cuando agrega dos producto al carrito de compra
    Entonces se valida los 2 articulos en el carrito

    Ejemplos:
      | usuario       |  | clave        |
      | standard_user |  | secret_sauce |
