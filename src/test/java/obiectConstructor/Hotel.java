package obiectConstructor;

import java.util.List;

public class Hotel {

    public String nume;
    public String adresa;
    public String oras;
    public String tara;
    public int numarStele;
    public List<String> facilitati;

    public Hotel(String nume, String adresa, String oras, String tara, int numarStele, List<String> facilitati) {
        this.nume = nume;
        this.adresa = adresa;
        this.oras = oras;
        this.tara = tara;
        this.numarStele = numarStele;
        this.facilitati = facilitati;
    }

    public void prezentareHotel() {

        System.out.println("Numele hotelului este: " + nume);
        System.out.println("Adresa hotelului este: " + adresa);
        System.out.println("Orasul in care se afla hotelul este: " + oras);
        System.out.println("Tara in care se afla hotelul este: " + tara);
        System.out.println("Numarul de stele pe care il are hotelul este: " + numarStele);
        System.out.println("Facilitatiile hotelului sunt: ");
        for (int index = 0; index < facilitati.size(); index++) {
            System.out.println(facilitati.get(index));
        }
    }

    public void calculPretCamera() {

        if (numarStele == 1) {
            System.out.println("Pretul camerei este de 100 RON");
        } else if (numarStele == 2) {
            System.out.println("Pretul camerei este de 200 RON");
        } else if (numarStele == 3) {
            System.out.println("Pretul camerei este de 300 RON");
        } else if (numarStele >= 1 && numarStele <= 3) {
            System.out.println("Clasificare necunoscuta, nu se poate calcula pretul");
        }

    }
}

//    public void calculPretCameraCuFacilitati() {
//        if (calculPretCamera(); != 0) {
//            System.out.println("Pretul camerei este: " +calculPretCamera());
//        }
//        if (calculPretCameraCuFacilitati().isEmpty()) {
//            System.out.println("pretul final este " + facilitati );
//        } else {
//            int dotari = 0;
//            for (int index = 0; index < facilitati.size(); index++) {
//                switch (facilitati.get(index)) {
//                    case "-Mic dejun inclus":
//                        facilitati = facilitati + "50";
//                        break;
//                    case "-Aer conditionat":
//                        facilitati = facilitati + "20";
//                        break;
//                    case "-Spa":
//                        facilitati = facilitati + "500";
//                        break;
//                    case "-Piscina interioara":
//                        facilitati = facilitati + "10";
//                        break;
//
//
//                }
//            }
//            calculPretCameraCuFacilitati() = calculPretCamera() + facilitati;
//            //if (pret != 0) {
//                System.out.println("Pretul final este " + calculPretCameraCuFacilitati());
//            }
//        }
//    }
//}
//
//
