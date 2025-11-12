package oopMostenire;

public class Student extends Persoana{
    public String facultate;
    public String domeniu;
    public int anul;
    public boolean restante;

    public Student(String nume, String prenume, int varsta, String adresa, String facultate, String domeniu, int anul, boolean restante) {
        super(nume, prenume, varsta, adresa);
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anul = anul;
        this.restante = restante;
    }
    public void infoStudent(){
        System.out.println("Facultatea la care studiaza este " + facultate);
        System.out.println("Domeniul pe care il studiaza este " + domeniu);
        System.out.println("Anul in care este studentul este " + anul);
        System.out.println("Are restante? "+ restante);
    }
}
