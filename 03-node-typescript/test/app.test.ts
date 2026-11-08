import { describe, it, expect } from 'vitest';
import request from 'supertest';
import { app, calcularFrete } from '../src/app.js';
describe('frete', () => {
 it('calcula limite inferior', () => expect(calcularFrete(1)).toBe(10));
 it('calcula peso acima de 1kg', () => expect(calcularFrete(2)).toBe(13));
 it('rejeita peso negativo', () => expect(() => calcularFrete(-1)).toThrow());
 it('responde 200 para payload válido', async () => {
  const r = await request(app).post('/frete').send({peso:2});
  expect(r.status).toBe(200); expect(r.body.valor).toBe(13);
 });
 it('responde 400 para payload inválido', async () => {
  const r = await request(app).post('/frete').send({peso:0}); expect(r.status).toBe(400);
 });
});
