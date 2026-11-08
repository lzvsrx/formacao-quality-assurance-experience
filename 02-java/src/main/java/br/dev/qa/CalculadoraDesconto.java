package br.dev.qa;
public final class CalculadoraDesconto {
  private CalculadoraDesconto() {}
  public static double aplicar(double preco, double percentual) {
    if (!Double.isFinite(preco) || preco < 0 || !Double.isFinite(percentual) || percentual < 0 || percentual > 100)
      throw new IllegalArgumentException("Valores invalidos");
    return preco * (1 - percentual / 100.0);
  }
}
