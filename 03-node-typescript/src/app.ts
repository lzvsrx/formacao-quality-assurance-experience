import express from 'express';
export const app = express();
app.use(express.json());
export function calcularFrete(peso: number): number {
 if (!Number.isFinite(peso) || peso <= 0) throw new Error('Peso inválido');
 return peso <= 1 ? 10 : 10 + Math.ceil(peso - 1) * 3;
}
app.post('/frete', (req, res) => {
 try { res.json({ valor: calcularFrete(req.body.peso) }); }
 catch { res.status(400).json({ erro: 'Peso inválido' }); }
});
