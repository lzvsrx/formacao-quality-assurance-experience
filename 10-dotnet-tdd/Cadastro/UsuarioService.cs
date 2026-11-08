namespace Cadastro;
public record Usuario(int Id, string Nome, string Email);
public sealed class UsuarioService {
 private readonly List<Usuario> usuarios = new();
 public Usuario Criar(string nome,string email){
  if(string.IsNullOrWhiteSpace(nome))throw new ArgumentException("Nome obrigatório");
  if(string.IsNullOrWhiteSpace(email)||!email.Contains('@'))throw new ArgumentException("E-mail inválido");
  if(usuarios.Any(u=>u.Email.Equals(email,StringComparison.OrdinalIgnoreCase)))throw new InvalidOperationException("E-mail duplicado");
  var usuario=new Usuario(usuarios.Count+1,nome.Trim(),email.Trim());usuarios.Add(usuario);return usuario;
 }
 public Usuario? Buscar(int id)=>usuarios.FirstOrDefault(u=>u.Id==id);
 public bool Remover(int id)=>usuarios.RemoveAll(u=>u.Id==id)>0;
 public IReadOnlyList<Usuario> Listar()=>usuarios.AsReadOnly();
}
