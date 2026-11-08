package br.dev.qa.beer;
import java.util.*;
import org.springframework.stereotype.Service;
@Service public class BeerService {
 private final Map<String,Beer> items=new HashMap<>(); private long nextId=1;
 public synchronized Beer create(String name,String brand,int quantity,int max){
  if(name==null||name.isBlank()||brand==null||brand.isBlank()||quantity<0||max<0||quantity>max)throw new IllegalArgumentException("Dados inválidos");
  String key=name.toLowerCase(Locale.ROOT);if(items.containsKey(key))throw new IllegalStateException("Cerveja já cadastrada");
  Beer b=new Beer(nextId++,name,brand,quantity,max);items.put(key,b);return b;
 }
 public synchronized List<Beer> list(){return List.copyOf(items.values());}
 public synchronized Beer find(String name){Beer b=items.get(name.toLowerCase(Locale.ROOT));if(b==null)throw new NoSuchElementException("Cerveja não encontrada");return b;}
 public synchronized void delete(String name){find(name);items.remove(name.toLowerCase(Locale.ROOT));}
 public synchronized Beer adjust(String name,int delta){Beer b=find(name);long qty=(long)b.quantity()+delta;if(qty<0||qty>b.max())throw new IllegalArgumentException("Estoque fora do limite");Beer updated=new Beer(b.id(),b.name(),b.brand(),(int)qty,b.max());items.put(name.toLowerCase(Locale.ROOT),updated);return updated;}
}
