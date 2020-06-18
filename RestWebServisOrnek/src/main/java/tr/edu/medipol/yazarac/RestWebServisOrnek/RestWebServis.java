package tr.edu.medipol.yazarac.RestWebServisOrnek;

 

import java.util.*;
import org.springframework.web.bind.annotation.*;

 

@RestController
@RequestMapping(path="/ogrenci")
public class RestWebServis {

 

    private static List<Ogrenci> ogrenciListesi = new ArrayList<>();
    static {
        ogrenciListesi.add(new Ogrenci("Beyda", 22));
        ogrenciListesi.add(new Ogrenci("Melek", 20));
        ogrenciListesi.add(new Ogrenci("Simge", 21));
        ogrenciListesi.add(new Ogrenci("Selin", 23));
    }
    
    @GetMapping("/listele")
    public List<Ogrenci> listele(){
        return ogrenciListesi;
    }
    @PostMapping("/ekle")
    public Ogrenci Ekle(@RequestBody Ogrenci ogrenci){
    	ogrenciListesi.add(ogrenci);
		return ogrenci;
    }
    @PostMapping("/ogrencisil")
    public  Ogrenci sil(@RequestBody Ogrenci ogrenci){
        ogrenciListesi.add(ogrenci);
        return ogrenci;
    }
}
