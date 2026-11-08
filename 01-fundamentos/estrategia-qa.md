# Estratégia QA

## Pirâmide de testes
Priorize testes unitários rápidos, complementados por integração e poucos E2E críticos.

## Shift-left e CI
Revisar critérios de aceite antes da implementação; executar lint e testes em pull requests.

## Indicadores
Taxa de aprovação, defeitos por severidade, cobertura de requisitos, tempo de execução e taxa de testes instáveis.

## BDD — Gherkin
```gherkin
Funcionalidade: Cadastro
  Cenário: E-mail inválido
    Dado que estou na tela de cadastro
    Quando informo um e-mail sem arroba
    Então recebo uma mensagem de validação
```

## SQL para validação de dados
```sql
SELECT email, COUNT(*) AS quantidade
FROM usuarios
GROUP BY email
HAVING COUNT(*) > 1;
```
