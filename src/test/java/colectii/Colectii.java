package colectii;

import org.testng.annotations.Test;

import java.security.Key;
import java.util.*;

public class Colectii {

    //array, list, set/map

    @Test

    public void metodaTest() {

        //cursantiArray();
        //cursantiList();
        //listaMasini();
        //exemple();
        //tariOrase();
        caietRetete();
    }

    public void cursantiArray() {

        String[] cursanti = new String[6];

        cursanti[0] = "Mihaela";
        cursanti[1] = "Ioana";
        cursanti[2] = "Alexandru";
        cursanti[3] = "Teodora";
        cursanti[4] = "Raluca";
        cursanti[5] = "Maria";

        for (int index = 0; index < cursanti.length; index++) {

            System.out.println("Numele cursantului este: " + cursanti[index]);

        }
    }

    public void cursantiList() {

        List<String> cursanti = new ArrayList<>();
        cursanti.add("Raluca");
        cursanti.add("Oana");
        cursanti.add("Ioana");

        for (int index = 0; index < cursanti.size(); index++) {

            System.out.println("Numele cursantului este: " + cursanti.get(index));

        }
    }

    public void listaMasini() {

        List<String> masini = new ArrayList<>();
        masini.add("Dacia");
        masini.add("Volvo");
        masini.add("Bmw");
        masini.add("Skoda");

        for (int index = 0; index < masini.size(); index++) {

            System.out.println("Numele masinii este: " + masini.get(index));
        }

    }

    //maps-cheie=valoare
    //parcurgerea se face pe baza cheilor folosind un set;

    public void exemple() {

        Map<String, String> elemente = new HashMap<>();
        elemente.put("Masina", "Dacia");
        elemente.put("Persoana", "Alexandru");
        elemente.put("Telefon", "Iphone");

        for (String Key : elemente.keySet()) {

            System.out.println("Cheia este " + Key);
            System.out.println("Valoarea este " + elemente.get(Key));

        }

    }

    public void tariOrase() {

        Map<String,List<String>> obiecte = new HashMap<>();
        List<String> oraseRomania = Arrays.asList("Cluj", "Bucuresti", "Timisoara");
        List<String> oraseItalia = Arrays.asList("Torino", "Roma", "Verona");
        List<String> oraseSpania = Arrays.asList("Madrid", "Barcelona", "Valencia");

        obiecte.put("Romania", oraseRomania);
        obiecte.put("Italia", oraseItalia);
        obiecte.put("Spania", oraseSpania);

        for (String Key: obiecte.keySet()){
            System.out.println("Tara este: " +Key);
            System.out.println("Orasele sunt: " +obiecte.get(Key));

        }

    }

    public void caietRetete(){

        Map<String,List<String>> ingrediente = new HashMap<>();
        List<String>  ingredienteSupaPui= Arrays.asList("pui","apa", "legume");
        List<String>  ingredienteSarmale= Arrays.asList("carne","orez", "condimente");
        List<String>  ingredienteDesert= Arrays.asList("zahar","lapte", "fructe");

        ingrediente.put("Supa pui", ingredienteSupaPui);
        ingrediente.put("Sarmale", ingredienteSarmale);
        ingrediente.put("Desert", ingredienteDesert);

        for (String Key: ingrediente.keySet()){
            System.out.println("Reteta este:" +Key);
            System.out.println("Ingredientele sunt:" +ingrediente.get(Key));
        }
    }
}