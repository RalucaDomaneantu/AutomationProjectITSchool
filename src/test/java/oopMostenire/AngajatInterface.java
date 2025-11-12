package oopMostenire;

public interface AngajatInterface {

    //ABSTRACTIZAREA = conceptul prin care putem defini comportamentul unei clase;
    //Abstractizarea se poate face prin doua feluri: interfete si clase abstracte.
    //INterfetele contin doar metode abstracte(metodele nu au body -{})
    //Toate metodele abstracte sunt publice;
    //Intr-o interfata putem defini metode cu void sau return;
    //Intr-o interfata nu putem avea un constructor - nu putem face un obiect;
    //Interfata se implementeaza iar o clasa se mosteneste;
    //Clasa care implementeaza o interfata trebuie sa implementeze toate metodele din ea;
    //O clasa poate implementa mai multe interfete;
    //O interfata poate mosteni o alta interfata;

    void ajungeLaTimpLaBirou();
    void munceste();
    void respectaRegulamentulIntern();

}
