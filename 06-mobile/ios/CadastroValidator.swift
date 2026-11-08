import Foundation
struct CadastroValidator {
    static func nomeValido(_ nome: String) -> Bool {
        !nome.trimmingCharacters(in: .whitespacesAndNewlines).isEmpty
    }
}
