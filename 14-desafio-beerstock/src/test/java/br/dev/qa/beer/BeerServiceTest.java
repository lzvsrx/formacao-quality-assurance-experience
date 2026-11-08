package br.dev.qa.beer;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
class BeerServiceTest {
 BeerService service;
 @BeforeEach void setup(){service=new BeerService();}
 @Test void createAndFind(){Beer b=service.create("IPA","Marca",5,10);assertEquals(1,b.id());assertEquals(5,service.find("ipa").quantity());}
 @Test void duplicate(){service.create("IPA","Marca",5,10);assertThrows(IllegalStateException.class,()->service.create("ipa","Outra",2,10));}
 @Test void increase(){service.create("IPA","Marca",5,10);assertEquals(8,service.adjust("IPA",3).quantity());}
 @Test void decrease(){service.create("IPA","Marca",5,10);assertEquals(2,service.adjust("IPA",-3).quantity());}
 @Test void overflow(){service.create("IPA","Marca",5,10);assertThrows(IllegalArgumentException.class,()->service.adjust("IPA",6));}
 @Test void underflow(){service.create("IPA","Marca",5,10);assertThrows(IllegalArgumentException.class,()->service.adjust("IPA",-6));}
 @Test void delete(){service.create("IPA","Marca",5,10);service.delete("IPA");assertTrue(service.list().isEmpty());}
 @Test void missing(){assertThrows(java.util.NoSuchElementException.class,()->service.find("inexistente"));}
}
