# Desafio prático — automação de API com Rest Assured
Projeto original inspirado na temática de testes de API. Inclui servidor HTTP local criado durante o teste, sem depender de serviço externo.

## Executar
`mvn test` (Java 17+ e Maven).

## Cenários
GET /health retorna 200; POST /clientes retorna 201; GET /clientes retorna 405. Exercício adicional: validar payload inválido, autenticação e contrato JSON.
