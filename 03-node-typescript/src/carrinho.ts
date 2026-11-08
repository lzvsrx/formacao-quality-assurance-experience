export type Item = { preco: number; quantidade: number };
export function totalCarrinho(itens: Item[]): number {
  return itens.reduce((total, item) => {
    if (!Number.isFinite(item.preco) || item.preco < 0 || !Number.isInteger(item.quantidade) || item.quantidade < 1) {
      throw new Error('Item inválido');
    }
    return total + item.preco * item.quantidade;
  }, 0);
}
