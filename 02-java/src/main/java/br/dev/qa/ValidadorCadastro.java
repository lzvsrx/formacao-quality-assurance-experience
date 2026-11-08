package br.dev.qa;
public class ValidadorCadastro {
  public boolean emailValido(String email) {
    return email != null && email.matches("^[^\s@]+@[^\s@]+\.[^\s@]+$");
  }
  public boolean senhaValida(String senha) { return senha != null && senha.length() >= 8; }
  public boolean cadastroValido(String email, String senha) { return emailValido(email) && senhaValida(senha); }
}
