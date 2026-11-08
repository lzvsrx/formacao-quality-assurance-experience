package br.dev.qa.beer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.http.MediaType;
@WebMvcTest(BeerController.class) class BeerControllerTest {
 @Autowired MockMvc mvc;@MockBean BeerService service;
 @Test void listReturns200() throws Exception {when(service.list()).thenReturn(java.util.List.of());mvc.perform(get("/api/beers")).andExpect(status().isOk()).andExpect(content().json("[]"));}
 @Test void createReturns201() throws Exception {when(service.create("IPA","Marca",2,5)).thenReturn(new Beer(1,"IPA","Marca",2,5));mvc.perform(post("/api/beers").contentType(MediaType.APPLICATION_JSON).content("{"name":"IPA","brand":"Marca","quantity":2,"max":5}")).andExpect(status().isCreated()).andExpect(jsonPath("$.name").value("IPA"));}
}
