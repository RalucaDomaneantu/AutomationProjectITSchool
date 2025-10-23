package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //o clasa este un sablon care defineste comportamentul unei entitati din viata reala
    //intr-un fisier Java recunoastem o clasa dupa cuvantul cheie "class"
    //o clasa este obligatoriu sa aiba un nume
    //o clasa contine variabile si metode
    //o variabila este proprietatea unei clase
    //o variabila poate fi de 2 feluri: globala si locala
    //globala=variabila pe care o declaram la inceputul clasei si este vizibila in tot fisierul
    //locala=variabila pe care o declaram in interiorul unei metode si este vizibila doar acolo
    //o variabila globala trebuie sa contina un access control(public), tip de data si un nume
    //o variabila nu trebuie sa contina tot timpul o valoare

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;

    //o metoda este actiunea unei clase
    //o clasa poate avea mai mule metode care se diferentiaza prin numele lor
    //metodele pot fi de 2 feluri: void si return
    //o metoda cu void are ca rol sa execute actiunea si sa o afiseze
    //o metoda cu void trebuie sa contina acces control(public), cuvantul cheie "void", numele metodei () si {}
    @Test
    public void prezentareStudent() {
        nume = "Domaneantu";
        prenume = "Raluca";
        varsta = 39;
        inaltime = 1.67;
        greutate = 54.4f;
        adresa = "Garii 7";
        sex = 'f';
        areRestante = false;

        //pentru a selecta tot textul apasam CTR+A
        //pentru a alinia codul apasam CTR+ALT+L

        System.out.print(nume+" "+prenume+" "+varsta+" "+inaltime+" "+greutate+" "+adresa+" "+sex+" "+areRestante+" ");
//        System.out.print(prenume+" ");
//        System.out.print(varsta+" ");
//        System.out.print(inaltime+" ");
//        System.out.print(greutate+" ");
//        System.out.print(adresa+" ");
//        System.out.print(sex+" ");
//        System.out.print(areRestante+" ");

        //Concatenarea este lipirea unuia sau mai multor stringurisi lipirea se face cu "+" si spatiu intre ghilimele

        System.out.println("numele studentului este "+nume);
        System.out.println("prenumele studentului este "+prenume);
        System.out.println("varsta studentului este "+varsta);
        System.out.println("inaltimea studentului este "+inaltime);
        System.out.println("greutatea studentului este "+greutate);
        System.out.println("adresa studentului este "+adresa);
        System.out.println("sexul studentului este "+sex);
        System.out.println("are studentul restante "+areRestante);

        //"Print" inseamna ca afiseaza valoarea si ramane pe randul curent.
        //"Println" inseamna ca afiseaza valoarea si sare la randul urmator.
    }

}
