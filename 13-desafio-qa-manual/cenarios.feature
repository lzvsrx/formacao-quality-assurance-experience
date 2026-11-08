# language: pt
Funcionalidade: Compra na loja
  Cenário: Autenticação válida
    Dado que tenho uma conta ativa
    Quando informo usuário e senha corretos
    Então devo acessar a área autenticada

  Cenário: Remoção de item do carrinho
    Dado que possuo um item no carrinho
    Quando removo o item
    Então o carrinho deve ficar vazio
