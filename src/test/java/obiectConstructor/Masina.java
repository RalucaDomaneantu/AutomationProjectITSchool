package obiectConstructor;

import java.util.List;

public class Masina {

    //CONSTRUCTOR
    //Constructorul are rol de a initializa variabilele unei clase;
    // cu alte cuvinte,el stabileste valorile de pornire ale proprietatilor unui obiect;

    //Cum recunoastem un constructor?
    //1. Numele constryctorului este intotdeauna identic cu numele clasei;
    //2.De cele mai multe ori, constructorul este declarat ca public;

    //Intr-o clasa putem avea mai multi constructori;
    //Acestia se deosebesc intre ei prin: numarul sau tipul de parametrii;

    //Important de stiut: o clasa contine intotdeauna un constructor default;

    //Constructorii pot fii de 2 tipuri: constructori fara parametrii (default) sau constructori cu parametrii(acestia sunt definiti de programator);

    //OBIECT

    //Un obiect este instanta unei clase.
    //Intr-o clasa putem defini oricate obiecte dorim;
    //Obiectele se diferentiaza prin numele lor;
    //Fiecare obiect poate avea valori diferite pentru aceleasi proprietati.
    //Recunoastem un obiect dupa cuvantul cheie"NEW";
    //Structura generala este: tipObiect numeObiect = new tipObiect();
    //Exemplu concret: Masina Dacia = new Masina();

    public String marca;
    public String model;
    public int an;
    public String culoare;
    public List<String> dotariInterioare;
    public boolean electrica;
    public int pret;
    public int pretFinal;


    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, boolean electrica, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.electrica = electrica;
        this.pret = pret;
    }

    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, boolean electrica) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.electrica = electrica;


    }

    public void prezentareMasina() {

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul de fabricatie al masinii este: " + an);
        System.out.println("Culoarea masinii este: " + culoare);
        System.out.println("Dotarile masinii sunt: ");
        for (int index = 0; index < dotariInterioare.size(); index++) {
            System.out.println(dotariInterioare.get(index));
        }
        System.out.println("Este masina electrica: " + electrica);
        calculPret();
//        if (pret!=0){
//            System.out.println("Pretul masinii este: "+ pret);


        //Determinam impozitul in functie de anul de fabricatie
        // Primul caz: <2000 - 500 ron
        //AL doilea caz: 2005 < X < 2015 - 300 ron
        //Al treilea caz: >2015 - 100 ron


    }

    public void calculImpozit() {

        if (an <= 2000) {
            System.out.println("Impozitul pe masina este de 500 RON");
        } else if (an >= 2005 && an <= 2015) {
            System.out.println("Impozitul pe masina este de 300 RON");
        } else if (an >= 2015) {
            System.out.println("Impozitul pe masina este 100 RON");
        }
    }

    public void calculPret() {
        if (pret != 0) {
            System.out.println("Pretul masinii este: " + pret);
        }
        if (dotariInterioare.isEmpty()) {
            System.out.println("pretul final este " + pret);
        } else {
            int dotari = 0;
            for (int index = 0; index < dotariInterioare.size(); index++) {
                switch (dotariInterioare.get(index)) {
                    case "-Aer conditionat":
                        dotari = dotari + 1000;
                        break;
                    case "-Incalzire in scaune":
                        dotari = dotari + 1500;
                        break;
                    case "Dezaburire parbriz":
                        dotari = dotari + 500;
                        break;


                }
            }
            pretFinal = pret + dotari;
            if (pret != 0) {
                System.out.println("Pretul final este " + pretFinal);
            }
        }
    }
}