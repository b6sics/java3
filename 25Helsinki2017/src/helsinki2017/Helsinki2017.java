/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helsinki2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author b6dmin
 */
public class Helsinki2017 {

    public final static String DELIMITER = ";";

    private final static List<DataRecord> SHORTPRG = new ArrayList<>();
    private final static List<DataRecord> FINALE = new ArrayList<>();

    private final static String F1 = "rovidprogram.csv";
    private final static String F2 = "donto.csv";
    private final static String TARGET = "vegeredmeny.csv";

    private final static String CODE_PAGE = "UTF-8";

    private static void readFiles() {
        try (Scanner sc = new Scanner(new File(F1), CODE_PAGE)) {
            sc.nextLine();
            while (sc.hasNext()) {
                SHORTPRG.add(new DataRecord(sc.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        try (Scanner sc = new Scanner(new File(F2), CODE_PAGE)) {
            sc.nextLine();
            while (sc.hasNext()) {
                FINALE.add(new DataRecord(sc.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static void skater() {
        System.out.println("\tA rövidprogramban " + SHORTPRG.size()
                + " induló volt");
    }

    private static void hun_finale() {
        for (DataRecord dr : FINALE) {
            if (dr.getCountry().equals("HUN")) {
                System.out.println("\ta magyar versenyző bejutott a kűrbe");
                return;
            }
        }
        System.out.println("\ta magyar versenyző nem jutott be a kűrbe");
    }

    private static double Összpontszám(String name) {
        double sum = 0;
        for (DataRecord dr : SHORTPRG) {
            if (dr.getName().equals(name)) {
                sum = dr.points();
                break;
            }
        }
        for (DataRecord dr : FINALE) {
            if (dr.getName().equals(name)) {
                sum += dr.points();
                return (sum);
            }
        }
        return -1;
    }

    private static void countries() {
        TreeMap<String, Integer> countries = new TreeMap<>();
        String country;
        Set set;
        for (DataRecord dr : SHORTPRG) {
            country = dr.getCountry();
            if (countries.isEmpty()) {
                countries.put(country, 0);
            }
            set = countries.entrySet();
            if (countries.keySet().contains(country)) {
                Integer db = countries.get(country);
                db++;
                countries.put(country, db);
            } else {
                countries.put(country, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : countries.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("\t" + entry.getKey() + ": "
                        + entry.getValue() + " versenyző");
            }
        }
    }

    private static void get_point() {
        Scanner in = new Scanner(System.in, CODE_PAGE);
        System.out.print("\tKérem a versenyző nevét: ");
        double p = Összpontszám(in.nextLine());
        if (p < 0) {
            System.out.println("\tIlyen nevű induló nem volt");
        } else {
            System.out.println("6.feladat");
            System.out.println("\tA versenyző összpontszáma: " + p);
        }
    }

    private static void sort(List<DataRecord> list) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (Összpontszám(FINALE.get(i).getName()) < Összpontszám(FINALE.get(i + 1).getName())) {
                    DataRecord dummy = FINALE.get(i);
                    FINALE.set(i, FINALE.get(i + 1));
                    FINALE.set(i + 1, dummy);
                    sorted = false;
                }
            }
        }
    }

    private static void finish() {
        sort(FINALE);
        try (PrintWriter out = new PrintWriter(new File(TARGET), "UTF-8")) {
            for (int i = 0; i < FINALE.size(); i++) {
                String str = ((i + 1) + DELIMITER + FINALE.get(i).getName()
                        + DELIMITER + FINALE.get(i).getCountry() + DELIMITER
                        + String.format("%.2f",
                                Összpontszám(FINALE.get(i).getName())));
                out.println(str);
            }
        } catch (IOException ex) {
            System.out.println("Hiba: " + ex.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataRecord.setDELIMITER(DELIMITER);
        readFiles();
        System.out.println("2.feladat");
        skater();
        System.out.println("3.feladat");
        hun_finale();
        System.out.println("5.feladat");
        get_point();
        System.out.println("7.feladat");
        countries();
        finish();
    }

}
