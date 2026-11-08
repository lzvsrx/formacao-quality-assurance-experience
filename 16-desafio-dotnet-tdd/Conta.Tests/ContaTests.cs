using Qa.Conta;
using Xunit;
public class ContaTests {
 [Fact] public void DepositoAumentaSaldo(){var c=new ContaBancaria();c.Depositar(50);Assert.Equal(50,c.Saldo);}
 [Fact] public void SaqueReduzSaldo(){var c=new ContaBancaria();c.Depositar(50);c.Sacar(20);Assert.Equal(30,c.Saldo);}
 [Theory][InlineData(0)][InlineData(-1)] public void DepositoInvalido(decimal valor){Assert.Throws<ArgumentOutOfRangeException>(()=>new ContaBancaria().Depositar(valor));}
 [Fact] public void NaoPermiteSaldoNegativo(){Assert.Throws<InvalidOperationException>(()=>new ContaBancaria().Sacar(10));}
}
