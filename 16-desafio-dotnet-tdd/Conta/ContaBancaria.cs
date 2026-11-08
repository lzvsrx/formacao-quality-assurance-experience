namespace Qa.Conta;
public class ContaBancaria {
 public decimal Saldo {get;private set;}
 public void Depositar(decimal valor){if(valor<=0)throw new ArgumentOutOfRangeException(nameof(valor));Saldo+=valor;}
 public void Sacar(decimal valor){if(valor<=0)throw new ArgumentOutOfRangeException(nameof(valor));if(valor>Saldo)throw new InvalidOperationException("Saldo insuficiente");Saldo-=valor;}
}
