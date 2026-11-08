describe('Cadastro Angular',()=>{beforeEach(()=>cy.visit('/'));
it('cadastra nome',()=>{cy.get('[data-cy=nome]').type('Ana');cy.get('[data-cy=salvar]').click();cy.contains('li','Ana').should('be.visible');});
it('valida nome vazio após espaços',()=>{cy.get('[data-cy=nome]').type('   ');cy.get('[data-cy=salvar]').click();cy.get('[data-cy=erro]').should('contain','Nome obrigatório');});});
