package oopMostenire;

import org.testng.annotations.Test;

public class MostenireTest {
    @Test

    public void metodaTest(){
        Angajat angajat= new Angajat("Popescu", "Andrei", 25,"Lipovei, nr. 25", "Emerson", 2500, "nedeterminat", 21);
        angajat.infoAngajat();
        System.out.println();
        Sportiv sportiv = new Sportiv ("Dumitru", "Sebastian", 34, "Viitorul 10", "Fotbal", true, 10);
        sportiv.infoSportiv();
    }

}
