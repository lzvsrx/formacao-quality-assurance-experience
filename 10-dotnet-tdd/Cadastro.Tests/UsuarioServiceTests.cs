using Cadastro;
using Xunit;
public class UsuarioServiceTests {
 [Fact] public void CadastraUsuarioValido(){var s=new UsuarioService();var u=s.Criar("Ana","ana@exemplo.com");Assert.Equal(1,u.Id);Assert.Equal("Ana",s.Buscar(1)?.Nome);}
 [Theory][InlineData("","ana@exemplo.com")][InlineData("Ana","invalido")]
 public void RejeitaDadosInvalidos(string nome,string email){Assert.Throws<ArgumentException>(()=>new UsuarioService().Criar(nome,email));}
 [Fact] public void RejeitaDuplicados(){var s=new UsuarioService();s.Criar("Ana","ana@exemplo.com");Assert.Throws<InvalidOperationException>(()=>s.Criar("Bia","ANA@exemplo.com"));}
 [Fact] public void RemoveUsuario(){var s=new UsuarioService();var u=s.Criar("Ana","ana@exemplo.com");Assert.True(s.Remover(u.Id));Assert.Null(s.Buscar(u.Id));}
}
