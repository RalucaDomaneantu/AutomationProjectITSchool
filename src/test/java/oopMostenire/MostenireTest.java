package oopMostenire;

import org.testng.annotations.Test;

import java.awt.*;

public class MostenireTest {
    @Test

    public void metodaTest(){
        Angajat angajat= new Angajat("Popescu", "Andrei", 25,"Lipovei, nr. 25", "Emerson", 2500, "nedeterminat", 21);
        angajat.infoAngajat();

        System.out.println(angajat.getVarsta());
        angajat.setVarsta(26);
        System.out.println(angajat.getVarsta());
        angajat.setNume("Ionescu");

        System.out.println();
        Sportiv sportiv = new Sportiv ("Dumitru", "Sebastian", 34, "Viitorul 10", "Fotbal", true, 10);
        sportiv.infoSportiv();

        Student student = new Student("Popovici", "Robert", 35,"Pacii, 26","Ion Mincu Timisoara", "IT",3,false);
    }
}
