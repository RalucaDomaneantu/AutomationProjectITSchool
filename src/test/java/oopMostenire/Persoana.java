package oopMostenire;

public class Persoana {
    //OOP = programare orientata pe obiect;
    //Cele 4 principii de baza sunt: mostenire, abstractizare, incapsulare, polimorfism.
    //Mostenirea reprezinta conceptul prin care o clasa copil mosteneste o clasa parinte;
    //Prin mostenire, clasa copil preia toate atributele si metodele clasei parinte;
    //In momentul in care o clasa copil mosteneste o clasa parinte, constructorul clasei copil trebuie sa apeleze constructorul din clasa parinte;
    //Acest lucru se realizeaza folosind keyword-ul "super";
    //Mostenirea se declara la nivel de clasa folosind keyword-ul "extends";
    //In Java o clasa poate mosteni doar o singura alta clasa(mostenire unica).

    //polimorfismul - conceptul prin care o metoda poate avea implementari diferite;
    //Polimorfismul poate fi de 2 feluri: -STATIC(OVERLOAD);
    //                                    -DINAMIC(OVERRIDE);

    //Dinamic- intr-o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite;
    //POlimorfismul dinamic se regaseste doar atunci cand exista mostenire;

    private String nume;
    private String prenume;
    private int varsta;
    private String adresa;

    public Persoana(String nume, String prenume, int varsta, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.adresa = adresa;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este " + nume);
        System.out.println("Prenumele persoanei este " + prenume);
        System.out.println("Varsta persoanei este " + varsta);
        System.out.println("Adresa persoanei este " + adresa);
    }

    //Polimorfismul DINAMIC
    public void mananca(){
        System.out.println("Persoana mananca atunci cand ii este foame");
    }

    //getter ne da valoarea proprietatii;
    //setter modifica valoarea proprietatii;
    //recomandat ar fi sa pornim intotdeauna cu private pentru a proteja datele, apoi expunem ce si cat avem nevoie;
    //getter-se fac tot timpul pentru a putea citi valorile;
    //setter - trebuie sa ne gandim daca face sens sa fie modificat;

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
