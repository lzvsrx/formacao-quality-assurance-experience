namespace Qa.Calculadora;
public static class Calculadora {
    public static decimal Dividir(decimal a, decimal b) => b == 0 ? throw new DivideByZeroException() : a / b;
    public static decimal AplicarDesconto(decimal preco, decimal percentual) {
        if (preco < 0 || percentual < 0 || percentual > 100) throw new ArgumentOutOfRangeException();
        return preco * (1 - percentual / 100);
    }
}
