package br.dev.qa;
import com.sun.net.httpserver.HttpServer;
import io.restassured.RestAssured;
import org.junit.jupiter.api.*;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import static org.hamcrest.Matchers.*;
class ApiContratoTest {
 static HttpServer server;
 @BeforeAll static void start() throws Exception {
  server=HttpServer.create(new InetSocketAddress("127.0.0.1",0),0);
  server.createContext("/health",ex->{byte[] b="{\"status\":\"ok\"}".getBytes(StandardCharsets.UTF_8);ex.getResponseHeaders().add("Content-Type","application/json");ex.sendResponseHeaders(200,b.length);try(var out=ex.getResponseBody()){out.write(b);}});
  server.createContext("/clientes",ex->{String method=ex.getRequestMethod();int status=method.equals("POST")?201:405;byte[] b=(status==201?"{\"id\":1,\"nome\":\"Ana\"}":"{}").getBytes(StandardCharsets.UTF_8);ex.getResponseHeaders().add("Content-Type","application/json");ex.sendResponseHeaders(status,b.length);try(var out=ex.getResponseBody()){out.write(b);}});
  server.start();RestAssured.baseURI="http://127.0.0.1:"+server.getAddress().getPort();
 }
 @AfterAll static void stop(){server.stop(0);}
 @Test void health(){RestAssured.get("/health").then().statusCode(200).body("status",equalTo("ok"));}
 @Test void cadastrar(){RestAssured.given().contentType("application/json").body("{\"nome\":\"Ana\"}").post("/clientes").then().statusCode(201).body("id",equalTo(1));}
 @Test void metodoNaoPermitido(){RestAssured.get("/clientes").then().statusCode(405);}
}
