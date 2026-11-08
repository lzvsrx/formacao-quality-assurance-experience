// @vitest-environment jsdom
import React from 'react';
import { it, expect } from 'vitest';
import { render, screen, fireEvent } from '@testing-library/react';
import { Formulario } from './formulario';
it('exibe validação sem nome', () => {
 render(<Formulario />); fireEvent.click(screen.getByRole('button', {name:'Enviar'}));
 expect(screen.getByRole('status').textContent).toBe('Informe seu nome');
});
it('envia nome válido', () => {
 render(<Formulario />); fireEvent.change(screen.getByLabelText('Nome'), {target:{value:'Ana'}});
 fireEvent.click(screen.getByRole('button', {name:'Enviar'}));
 expect(screen.getByRole('status').textContent).toBe('Olá, Ana!');
});
