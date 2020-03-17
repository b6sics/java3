package tanulok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Tanulok {

    private static ArrayList<Tanulo> lista = new ArrayList<>();

    public static void main(String[] args) {
        lista.add(new Tanulo("Kis János", 2000, 3.22));
        lista.add(new Tanulo("Nagy László", 2002, 2.11));
        lista.add(new Tanulo("Kovács Éva", 1998, 4.33));

        Collections.sort(lista, new Nev_rendez());
        System.out.println("Név szerint: ");
        for (Tanulo t : lista) {
            System.out.println(t);
        }
        Collections.sort(lista, new Szulev_rendez());
        System.out.println("Születési év szerint: ");
        for (Tanulo t : lista) {
            System.out.println(t);
        }
        Collections.sort(lista, new Atlag_rendez());
        System.out.println("Átlag szerint: ");
        for (Tanulo t : lista) {
            System.out.println(t);
        }

        Collections.sort(lista, new Comparator<Tanulo>() {
            @Override
            public int compare(Tanulo t1, Tanulo t2) {
                return t1.getNev().compareTo(t2.getNev());
            }
        });
        System.out.println("Név szerint: ");
        for (Tanulo t : lista) {
            System.out.println(t);
        }
        Collections.sort(lista, new Comparator<Tanulo>() {
            @Override
            public int compare(Tanulo t1, Tanulo t2) {
                return Integer.compare(t1.getSzulev(), t2.getSzulev());
            }
        });
        System.out.println("Születési év szerint: ");
        for (Tanulo t : lista) {
            System.out.println(t);
        }
        Collections.sort(lista, new Comparator<Tanulo>() {
            @Override
            public int compare(Tanulo t1, Tanulo t2) {
                return Double.compare(t1.getAtlag(), t2.getAtlag());
            }
        });
        System.out.println("Átlag szerint: ");
        for (Tanulo t : lista) {
            System.out.println(t);
        }

        Collections.sort(lista,
                (Tanulo t1, Tanulo t2) -> t1.getNev().compareTo(t2.getNev()));
        System.out.println("Név szerint: ");
        lista.forEach((t) -> {
            System.out.println(t);
        });
        Collections.sort(lista,
                (Tanulo t1, Tanulo t2) -> Integer.compare(t1.getSzulev(), t2.getSzulev()));
        System.out.println("Születési év szerint: ");
        lista.forEach((t) -> {
            System.out.println(t);
        });
        Collections.sort(lista,
                (Tanulo t1, Tanulo t2) -> Double.compare(t1.getAtlag(), t2.getAtlag()));
        System.out.println("Átlag szerint: ");
        lista.forEach((t) -> {
            System.out.println(t);
        });
    }
}

class Nev_rendez implements Comparator<Tanulo> {

    @Override
    public int compare(Tanulo t1, Tanulo t2) {
        return t1.getNev().compareTo(t2.getNev());
    }

}

class Szulev_rendez implements Comparator<Tanulo> {

    @Override
    public int compare(Tanulo t1, Tanulo t2) {
        return Integer.compare(t1.getSzulev(), t2.getSzulev());
    }

}

class Atlag_rendez implements Comparator<Tanulo> {

    @Override
    public int compare(Tanulo t1, Tanulo t2) {
        return Double.compare(t1.getAtlag(), t2.getAtlag());
    }

}
