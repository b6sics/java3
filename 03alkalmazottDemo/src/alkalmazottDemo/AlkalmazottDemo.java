package alkalmazottDemo;

import java.time.LocalDate;

/**
 * Alkalmazott osztály kipróbálása
 *
 * @author Tóth József
 */
public class AlkalmazottDemo {

    public static void main(String[] args) {
        Alkalmazott.setEv(LocalDate.now().getYear());
        Alkalmazott a = new Alkalmazott("Nagy János", 300000, 1965);
        System.out.println(a.adatok());
        Alkalmazott.setKorhatar(67);
        System.out.println(a.adatok());
    }
}
