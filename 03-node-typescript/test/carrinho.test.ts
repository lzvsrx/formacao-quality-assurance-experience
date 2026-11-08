import { describe, it, expect } from 'vitest';
import { totalCarrinho } from '../src/carrinho';
describe('desafio carrinho', () => {
  it('soma produtos e quantidades', () => expect(totalCarrinho([{ preco: 10, quantidade: 2 }, { preco: 5, quantidade: 1 }])).toBe(25));
  it('carrinho vazio', () => expect(totalCarrinho([])).toBe(0));
  it('rejeita quantidade zero', () => expect(() => totalCarrinho([{ preco: 5, quantidade: 0 }])).toThrow('Item inválido'));
});
