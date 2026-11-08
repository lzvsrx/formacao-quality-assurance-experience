package br.dev.qa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
class ValidadorCadastroTest {
  private final ValidadorCadastro validador = new ValidadorCadastro();
  @Test void aceitaCadastroValido() { assertTrue(validador.cadastroValido("qa@example.com", "12345678")); }
  @ParameterizedTest @ValueSource(strings={"invalido", "@dominio.com", "a@"})
  void rejeitaEmailsInvalidos(String email) { assertFalse(validador.emailValido(email)); }
  @Test void rejeitaSenhaCurta() { assertFalse(validador.senhaValida("123")); }
}
