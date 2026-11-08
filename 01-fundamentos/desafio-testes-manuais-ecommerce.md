# Desafio prático — testes manuais funcionais de e-commerce fictício
## Requisitos
RF01 login com credenciais válidas; RF02 erro em senha inválida; RF03 adicionar produto ao carrinho; RF04 alterar quantidade; RF05 finalizar compra com endereço; RF06 impedir checkout sem itens.
## Casos de teste
| ID | Pré-condição | Passos | Resultado esperado |
|---|---|---|---|
| CT01 | Usuário cadastrado | Entrar com credenciais corretas | Autenticado |
| CT02 | Usuário cadastrado | Entrar com senha incorreta | Mensagem de erro sem revelar senha |
| CT03 | Usuário autenticado | Adicionar 2 unidades do mesmo item | Quantidade e total corretos |
| CT04 | Carrinho vazio | Acessar checkout | Operação bloqueada |
| CT05 | Carrinho com itens | Informar endereço válido e confirmar | Pedido criado |
## Evidências
Registre execução, ambiente, data, esperado/obtido, severidade e screenshots (sem dados sensíveis).
