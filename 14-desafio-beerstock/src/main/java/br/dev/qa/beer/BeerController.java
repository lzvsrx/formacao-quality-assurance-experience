package br.dev.qa.beer;
import java.util.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/beers") public class BeerController {
 private final BeerService service;public BeerController(BeerService service){this.service=service;}
 public record BeerInput(String name,String brand,int quantity,int max){}
 public record StockInput(int amount){}
 @PostMapping public ResponseEntity<Beer> create(@RequestBody BeerInput input){return ResponseEntity.status(201).body(service.create(input.name(),input.brand(),input.quantity(),input.max()));}
 @GetMapping public List<Beer> list(){return service.list();}
 @GetMapping("/{name}") public Beer find(@PathVariable String name){return service.find(name);}
 @DeleteMapping("/{name}") public ResponseEntity<Void> delete(@PathVariable String name){service.delete(name);return ResponseEntity.noContent().build();}
 @PatchMapping("/{name}/increase") public Beer increase(@PathVariable String name,@RequestBody StockInput input){if(input.amount()<=0)throw new IllegalArgumentException("Quantidade inválida");return service.adjust(name,input.amount());}
 @PatchMapping("/{name}/decrease") public Beer decrease(@PathVariable String name,@RequestBody StockInput input){if(input.amount()<=0)throw new IllegalArgumentException("Quantidade inválida");return service.adjust(name,-input.amount());}
 @ExceptionHandler(NoSuchElementException.class) public ResponseEntity<String> missing(Exception e){return ResponseEntity.status(404).body(e.getMessage());}
 @ExceptionHandler(IllegalStateException.class) public ResponseEntity<String> conflict(Exception e){return ResponseEntity.status(409).body(e.getMessage());}
 @ExceptionHandler(IllegalArgumentException.class) public ResponseEntity<String> invalid(Exception e){return ResponseEntity.badRequest().body(e.getMessage());}
}
