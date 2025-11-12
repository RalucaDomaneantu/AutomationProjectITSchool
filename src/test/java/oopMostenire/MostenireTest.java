package oopMostenire;

import org.testng.annotations.Test;

import java.awt.*;

public class MostenireTest {
    @Test

    public void metodaTest(){
        Angajat angajat= new Angajat("Popescu", "Andrei", 25,"Lipovei, nr. 25", "Emerson", 2500, "nedeterminat", 21);
        angajat.infoAngajat();
        angajat.getSalariu();
        System.out.println();

        System.out.println(angajat.getVarsta());
        angajat.setVarsta(26);
        System.out.println(angajat.getVarsta());
        angajat.mananca();

        angajat.afiseazaDetalii();
        angajat.afiseazaDetalii("Altex");
        angajat.afiseazaDetalii("Altex", true);

        angajat.ajungeLaTimpLaBirou();
        angajat.munceste();
        angajat.respectaRegulamentulIntern();

        System.out.println();
        Sportiv sportiv = new Sportiv ("Dumitru", "Sebastian", 34, "Viitorul 10", "Fotbal", true, 10);
        sportiv.infoSportiv();
        sportiv.mananca();
        sportiv.cautaSportivi("Fotbal", 3);

        sportiv.mergeLaAntrenamente();
        sportiv.mergeLaAntrenamente();
        sportiv.respectaRegimAlimentar();

        System.out.println();
        Student student = new Student("Popovici", "Robert", 35,"Pacii, 26","Ion Mincu Timisoara", "IT",3,false);
        student.infoStudent();
        student.mananca();

        student.mergeLaCursuri();
        student.trebuieSaStudieze();
        student.saNuAibaRestante();
    }
}
