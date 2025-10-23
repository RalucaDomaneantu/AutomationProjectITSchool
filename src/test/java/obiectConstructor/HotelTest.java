package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;

public class HotelTest {
    @Test

    public void HotelTest(){

        Hotel Perla = new Hotel("Perla", "str.Garii, nr. 1", "Bucuresti", "Romania", 1,
                Arrays.asList("Mic dejun inclus", "Aer conditionat"));
        Perla.prezentareHotel();
        Perla.calculPretCamera();
        System.out.println(" ");

        Hotel Maria = new Hotel("Maria", "str.Salcamaului, nr. 7", "Milano", "Italia", 2,
                Arrays.asList("Mic dejun inclus", "Aer conditionat", "Spa"));
        Maria.prezentareHotel();
        Maria.calculPretCamera();
        System.out.println(" ");

        Hotel Regina = new Hotel("Regina", "str.Prunului, nr. 10", "Valencia", "Spania", 3,
                Arrays.asList("Mic dejun inclus", "Aer conditionat", "Spa", "Piscina interioara"));
        Regina.prezentareHotel();
        Regina.calculPretCamera();
        System.out.println(" ");



    }

}
