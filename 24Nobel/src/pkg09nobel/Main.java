/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09nobel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author b6dmin
 */
public class Main {

    private final String SOURCE = "nobel.csv";
    private final String TARGET = "orvosi.txt";
    private List<Noble> nobles;
    private final String DELIMITER = ";";
    TreeMap<String, Integer> prices;

    private void beolvas() {
        nobles = new ArrayList<>();
        try (Scanner be = new Scanner(new File(SOURCE), "UTF-8")) {
            be.nextLine();
            while (be.hasNext()) {
                String line = be.nextLine();
                // System.out.println(">" + line);
                String[] adatok = line.split(DELIMITER);
                switch (adatok.length) {
                    case 3: {
                        Noble n = new Noble(Integer.parseInt(adatok[0]),
                                adatok[1],
                                adatok[2],
                                "");
                        nobles.add(n);
                        break;
                    }
                    case 4: {
                        Noble n = new Noble(Integer.parseInt(adatok[0]),
                                adatok[1],
                                adatok[2],
                                adatok[3]);
                        nobles.add(n);
                        break;
                    }
                    default:
                        System.out.println("Hibás adatsor!");
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Hiba: " + ex.getMessage());
        }
        System.out.println(nobles.size() + " nobles");
    }

    private void mcdonald() {
        for (Noble n : nobles) {
            if (n.getLastname().equals("McDonald")
                    && n.getFirstname().equals("Arthur B.")) {
                System.out.println(n.getType());
                break;
            }
        }
    }

    private void irodalmi2017() {
        for (Noble n : nobles) {
            if (n.getYear() == 2017 && n.getType().equals("irodalmi")) {
                System.out.println(n.getFirstname() + " " + n.getLastname());
                break;
            }
        }
    }

    private void orgs1990() {
        for (Noble n : nobles) {
            if (n.getYear() >= 1990 && n.getLastname().equals("")) {
                System.out.println("\t" + n.getYear() + ": " + n.getFirstname());
            }
        }
    }

    private void curies() {
        for (Noble n : nobles) {
            if (n.getLastname().contains("Curie")) {
                System.out.println("\t" + n.getYear() + ": " + n.getFirstname()
                        + " " + n.getLastname() + "(" + n.getType() + ")");
            }
        }
    }

    private void nobel_prices() {
        prices = new TreeMap<>();
        String mode;
        Set set;
        for (Noble n : nobles) {
            mode = n.getType();
            if (prices.isEmpty()) {
                prices.put(mode, 0);
            }
            set = prices.entrySet();
            if (prices.keySet().contains(mode)) {
                Integer db = prices.get(mode);
                db++;
                prices.put(mode, db);
            } else {
                prices.put(mode, 1);
            }
        }
        prices.entrySet().forEach((entry) -> {
            System.out.printf("\t%-32s %4d db\n", entry.getKey(), entry.getValue());
        });
    }

    class SortbyDate implements Comparator<Noble> {

        @Override
        public int compare(Noble a, Noble b) {
            return a.getYear() - b.getYear();
        }
    }

    private void orvosi() {
        System.out.println(TARGET);
        Collections.sort(nobles, new SortbyDate());
        try (PrintWriter out = new PrintWriter(new File(TARGET), "UTF-8")) {
            for (Noble n : nobles) {
                if (n.getType().equals("orvosi")) {
                    out.println(n);
                }
            }
        } catch (IOException ex) {
            System.out.println("Hiba: " + ex.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m = new Main();
        m.beolvas();
        System.out.print("3. feladat: ");
        m.mcdonald();
        System.out.print("4. feladat: ");
        m.irodalmi2017();
        System.out.println("5. feladat: ");
        m.orgs1990();
        System.out.println("6. feladat: ");
        m.curies();
        System.out.println("7. feladat: ");
        m.nobel_prices();
        System.out.print("8. feladat: ");
        m.orvosi();
    }

}
