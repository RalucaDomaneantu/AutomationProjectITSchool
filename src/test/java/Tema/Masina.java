package Tema;

import org.testng.annotations.Test;

public class Masina {

    public String Marca;
    public String Model;
    public int  capacitateRezervor;
    public double Lungime;
    public float MasaProprie;
    public String Culoare;
    public boolean areAC;

    @Test

    public void prezentareMasina() {
        Marca = "Opel";
        Model = "Astra";
        capacitateRezervor = 55;
        Lungime = 3.42;
        MasaProprie = 1950f;
        Culoare = "neagra";
        areAC =true;

        System.out.print(Marca+" "+Model+" "+capacitateRezervor+" "+Lungime+" "+MasaProprie+" "+Culoare+" "+areAC+" ");

        System.out.println("Marca masinii este "+Marca);
        System.out.println("modelul masinii este "+Model);
        System.out.println("Capacitatea rezervorului masinii este "+capacitateRezervor);
        System.out.println("Lungimea masinii este "+Lungime);
        System.out.println("masa masinii este "+MasaProprie);
        System.out.println("Culoarea masinii este "+Culoare);
        System.out.println("are masina AC "+areAC);
    }



}