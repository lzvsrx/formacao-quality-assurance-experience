package br.dev.qa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;
class CalculadoraDescontoTest {
  @ParameterizedTest @CsvSource({"100,10,90", "80,0,80", "100,100,0"})
  void descontos(double preco, double taxa, double esperado) { assertEquals(esperado, CalculadoraDesconto.aplicar(preco, taxa), 0.00001); }
  @Test void rejeitaDescontoInvalido() { assertThrows(IllegalArgumentException.class, () -> CalculadoraDesconto.aplicar(100,101)); }
}
