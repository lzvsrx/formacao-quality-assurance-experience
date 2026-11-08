using Qa.Calculadora;
using Xunit;
public class CalculadoraTests {
 [Theory]
 [InlineData(10, 2, 5)]
 [InlineData(9, 3, 3)]
 public void DivideCorretamente(decimal a, decimal b, decimal esperado) => Assert.Equal(esperado, Calculadora.Dividir(a,b));
 [Fact]
 public void NaoDividePorZero() => Assert.Throws<DivideByZeroException>(() => Calculadora.Dividir(1,0));
 [Theory]
 [InlineData(100, 20, 80)]
 [InlineData(50, 0, 50)]
 public void AplicaDesconto(decimal preco, decimal desconto, decimal esperado) => Assert.Equal(esperado, Calculadora.AplicarDesconto(preco, desconto));
 [Fact]
 public void RejeitaDescontoMaiorQueCem() => Assert.Throws<ArgumentOutOfRangeException>(() => Calculadora.AplicarDesconto(10,101));
}
