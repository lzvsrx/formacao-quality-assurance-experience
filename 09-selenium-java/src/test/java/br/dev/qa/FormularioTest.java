package br.dev.qa;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;
class FormularioTest {
 @Test void cadastroComNome(){
  ChromeOptions options=new ChromeOptions();options.addArguments("--headless=new","--no-sandbox","--disable-dev-shm-usage");
  WebDriver driver=new ChromeDriver(options);
  try {driver.get(Path.of("src/test/resources/formulario.html").toAbsolutePath().toUri().toString());
   driver.findElement(By.id("nome")).sendKeys("Ana");driver.findElement(By.id("enviar")).click();
   assertEquals("Cadastro realizado: Ana",driver.findElement(By.id("resultado")).getText());
  }finally{driver.quit();}
 }
}
