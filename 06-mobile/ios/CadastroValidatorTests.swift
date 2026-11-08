import XCTest
// Substitua SeuApp pelo nome do módulo do projeto Xcode.
@testable import SeuApp
final class CadastroValidatorTests: XCTestCase {
    func testNomeValido() { XCTAssertTrue(CadastroValidator.nomeValido("Ana")) }
    func testNomeVazio() { XCTAssertFalse(CadastroValidator.nomeValido("  ")) }
}
