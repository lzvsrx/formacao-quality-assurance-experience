# Formação Quality Assurance Experience — laboratório independente

Projetos originais de estudo, organizados pelos seis módulos divulgados publicamente pela DIO em novembro de 2026.

**Limite de cobertura:** a grade interna completa da trilha `formacao-quality-assurance-experience` não estava publicamente acessível. Este repositório não afirma reproduzir cada aula/desafio da plataforma e não inclui conteúdo proprietário.

## Módulos
1. Fundamentos: estratégia, plano, matriz de rastreabilidade, cenários e relatórios.
2. Java: Maven + JUnit 5 + testes parametrizados.
3. Node.js/TypeScript: Vitest, testes unitários e API Express/Supertest.
4. .NET: biblioteca C# e xUnit.
5. Front-end: React + Vitest + Testing Library e Playwright E2E.
6. Android/iOS: Android Kotlin Espresso, e exemplo iOS XCTest.

## Execução
- Java: `cd 02-java && mvn test` (JDK 21+ e Maven)
- Node: `cd 03-node-typescript && npm install && npm test`
- .NET: `cd 04-dotnet && dotnet test` (SDK .NET 8+)
- Front-end: `cd 05-frontend && npm install && npm test`; `npx playwright install && npm run test:e2e`
- Android: abra `06-mobile/android` no Android Studio; execute `connectedAndroidTest` com emulador configurado.
- iOS: exemplo XCTest para inserir em projeto Xcode iOS.

Dependências são restauradas pelos respectivos gerenciadores; não há binários ou certificados incluídos.

## Atualização 2026-11-08
Inclui novos desafios originais em `07-desafios-integradores`, CTFL, técnicas de teste, matriz de rastreabilidade, teste parametrizado Java, carrinho TypeScript e roteiros de testes mobile. Consulte `COBERTURA-E-LIMITACOES.md` antes de declarar conclusão da formação.
