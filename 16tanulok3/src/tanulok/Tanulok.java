package tanulok;

import java.util.ArrayList;
import java.util.Collections;

public class Tanulok {

    private static ArrayList<Tanulo> lista = new ArrayList<>();

    public static void main(String[] args) {
        lista.add(new Tanulo("Kis János", 2000, 3.22));
        lista.add(new Tanulo("Nagy László", 2002, 2.11));
        lista.add(new Tanulo("Szabó Géza", 2001, 3.44));
        lista.add(new Tanulo("Kovács Éva", 1998, 4.33));
        lista.add(new Tanulo("Tóth János", 1999, 4.01));
        lista.add(new Tanulo("Kovács Éva", 2000, 2.55));
        lista.add(new Tanulo("Varga Judit", 1996, 4.56));
        lista.add(new Tanulo("Simon Lajos", 2003, 3.67));

        // lineáris keresés
        Tanulo t = new Tanulo("Kovács Éva", 2000, 2.55);
        int i = 0;
        while (i < lista.size() && !lista.get(i).equals(t)) {
            i++;
        }
        if (i == lista.size()) {
            System.out.println("Nem találtam!");
        } else {
            System.out.println("Index: " + i);
        }
        System.out.println("");

        // lista másolása
        ArrayList<Tanulo> masolat = new ArrayList<>(lista);

        // másolat rendezése név szerint
        Collections.sort(masolat);
        System.out.println("Rendezett lista:");
        masolat.forEach((tanulo) -> {
            System.out.println(tanulo);
        });

        // bináris keresés
        i = Collections.binarySearch(lista, t);
        if (i < 0) {
            System.out.println("Nem találtam! (i=" + i + ")");
        } else {
            System.out.println("Index: " + i);
        }
    }
}
