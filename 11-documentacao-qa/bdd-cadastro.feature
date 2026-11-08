# language: pt
Funcionalidade: Cadastro de usuário
  Como visitante quero cadastrar meus dados para acessar o sistema
  Cenário: Cadastro válido
    Dado que estou na tela de cadastro
    Quando informo nome "Ana" e email "ana@exemplo.com"
    Então o cadastro deve ser concluído
  Cenário: E-mail inválido
    Dado que estou na tela de cadastro
    Quando informo nome "Ana" e email "invalido"
    Então devo visualizar uma mensagem de validação
