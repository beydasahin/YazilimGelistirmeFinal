package tr.edu.medipol.yazarac.RestWebServisOrnek;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ogrenci")

public class Testbolum {
	// Test
    @Test
    public void ListeKontrol() {
        //Koşul
    List<String> ogrenciler = new ArrayList<>();
         {
             String ogrenci1 ="Beyda";
             String ogrenci2 ="Melek";
             String ogrenci3 ="Simge";
             String ogrenci4 ="Selin";
            int Not =22;
            int Not2 =20;
            int Not3 =21;
            int Not4 =23;
      

        ogrenciler.add(ogrenci1+Not);
        ogrenciler.add(ogrenci2+Not2);
        ogrenciler.add(ogrenci3+Not3);
        ogrenciler.add(ogrenci4+Not4);

      // Kontrol
            assertEquals("Beyda",ogrenci1);
            assertEquals("Melek",ogrenci2);
            assertEquals("Simge",ogrenci3);
            assertEquals("Selin",ogrenci4);
            

        }



    }
private void assertEquals(String string, String ogrenci1) {
        // TODO Auto-generated method stub

    }
@GetMapping("/ogrenciEkle/{ogrenciAdi}")
@Test
//Ekle Test

public void   OgrenciEkle() {
    List<String> ogrenciler = new ArrayList<>();
     {
         String ogrenci1 ="Beyda";
         String ogrenci2 ="Melek";
         String ogrenci3 ="Simge";
         String ogrenci4 ="Seren";
     }
     
     String yeniogrenci="Gülay";
     ogrenciler.add(yeniogrenci);
     
     assertEquals(yeniogrenci,"Gülay");

}
@GetMapping("/ogrenciSil/{ogrenciAdi}")
@Test
public void OgrenciSil() {
//Sil Test
    
        List<String> ogrenciler = new ArrayList<>();
         {
             String ogrenci1 ="Beyda";
             String ogrenci2 ="Melek";
             String ogrenci3 ="Simge";
             String ogrenci4 ="Selin";

        

             ogrenciler.remove(ogrenci3);

        
             assertEquals(ogrenci3,"Simge");
         }


}

}
