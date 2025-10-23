package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MasinaTest {
    @Test

    public void MasinaTest (){

       Masina Dacia = new Masina("Dacia", "Sandero", 2025, "Rosie",
               Arrays.asList("-Aer conditionat", "-Incalzire in scaune", "-Dezaburire parbriz"), false);
       Dacia.prezentareMasina();
       Dacia.calculImpozit();
        System.out.println(" ");

       Masina Mercedes = new Masina("Mercedes", "SL150", 2025, "Neagra",
               Arrays.asList("-Aer conditionat", "-Incalzire in scaune", "-Dezaburire parbriz"), true);
       Mercedes.prezentareMasina();
       Mercedes.calculImpozit();
        System.out.println(" ");

       Masina Opel = new Masina("Opel", "Astra", 2025, "Alb",
               Arrays.asList("-Aer conditionat", "-Incalzire in scaune", "-Dezaburire parbriz"), true, 25000);
       Opel.prezentareMasina();
       Opel.calculImpozit();

    }
}
//sa nu apara pretul pentru primele 2 masini...trebuie activat if ul;
//daca nu au pret initial, sa nu apara nici pretul dotarilor