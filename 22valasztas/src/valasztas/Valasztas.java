/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valasztas;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author b6dmin
 */
public class Valasztas {

    private static Jelolt jeloltek[];
    private static int ossz = 0;

    private static void readArray() {
        ArrayList<Jelolt> al = new ArrayList<>();
        Scanner SC = new Scanner(
                Valasztas.class.getResourceAsStream("../szavazatok.txt"), "UTF-8");
        String line;
        String[] data;
        try {
            while (SC.hasNext()) {
                line = SC.nextLine();
                data = line.split(" ");
                if (data.length == 5) {
                    Jelolt j = new Jelolt(data);
                    al.add(j);
                    // System.out.println("> " + j.toString());
                } else {
                    throw MyException("Hibás adatsor!");
                }
            }
        } catch (java.lang.Exception ex) {
            System.out.println("> " + ex.getMessage());
        }
        jeloltek = new Jelolt[al.size()];
        jeloltek = al.toArray(jeloltek);
    }

    private static Exception MyException(String str) {
        return new Exception(str);
    }

    private static void jelolt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg egy jelölt vezetéknevét és utónevét:");
        String nev = sc.nextLine();

        boolean vanNev = false;
        for (int i = 0; i < jeloltek.length; i++) {
            if (jeloltek[i].getNev().equals(nev)) {
                System.out.println("A jelölt "
                        + jeloltek[i].getSzavazatok() + " szavazatot kapott.");
                vanNev = true;
                break;
            }
        }
        if (!vanNev) {
            System.out.println("Ilyen nevű képviselőjelölt "
                    + "nem szerepel a nyilvántartásban!");
        }
    }

    private static void osszes() {
        for (int i = 0; i < jeloltek.length; i++) {
            ossz += jeloltek[i].getSzavazatok();
        }

        double szazalek = (ossz / (double) 12345) * 100;
        System.out.println(String.format("A választáson %d "
                + "állampolgár, a jogosultak %.2f%%-a vett részt.",
                ossz, szazalek));
    }

    private static void partok() {
        int[] szavazatok = new int[5];

        for (int i = 0; i < jeloltek.length; i++) {
            if (jeloltek[i].getPart().equals("GYEP")) {
                szavazatok[0] += jeloltek[i].getSzavazatok();
            } else if (jeloltek[i].getPart().equals("HEP")) {
                szavazatok[1] += jeloltek[i].getSzavazatok();
            } else if (jeloltek[i].getPart().equals("TISZ")) {
                szavazatok[2] += jeloltek[i].getSzavazatok();
            } else if (jeloltek[i].getPart().equals("ZEP")) {
                szavazatok[3] += jeloltek[i].getSzavazatok();
            } else {
                szavazatok[4] += jeloltek[i].getSzavazatok();
            }
        }

        System.out.println(String.format("Gyümölcsevők Pártja= %.2f%%",
                (szavazatok[0] / (double) ossz) * 100));
        System.out.println(String.format("Húsevők Pártja= %.2f%%",
                (szavazatok[1] / (double) ossz) * 100));
        System.out.println(String.format("Tejivók Pártja= %.2f%%",
                (szavazatok[2] / (double) ossz) * 100));
        System.out.println(String.format("Zöldsegevők Pártja= %.2f%%",
                (szavazatok[3] / (double) ossz) * 100));
        System.out.println(String.format("Független jelöltek= %.2f%%",
                (szavazatok[4] / (double) ossz) * 100));
    }

    private static void max() {
        int maxSzavazat = jeloltek[0].getSzavazatok();
        for (int i = 1; i < jeloltek.length; i++) {
            if (jeloltek[i].getSzavazatok() > maxSzavazat) {
                maxSzavazat = jeloltek[i].getSzavazatok();
            }
        }

        for (Jelolt jeloltek1 : jeloltek) {
            if (jeloltek1.getSzavazatok() == maxSzavazat) {
                System.out.println(jeloltek1.getNev() + " " + jeloltek1.getPart());
            }
        }
    }

    private static void nyertesek() {
        Jelolt[] nyertesek = new Jelolt[9];

        for (int i = 0; i < jeloltek.length; i++) {
            if (nyertesek[jeloltek[i].getKerulet()] == null) {
                nyertesek[jeloltek[i].getKerulet()] = jeloltek[i];
            } else if (nyertesek[jeloltek[i].getKerulet()].getSzavazatok()
                    < jeloltek[i].getSzavazatok()) {
                nyertesek[jeloltek[i].getKerulet()] = jeloltek[i];
            }
        }

        try (PrintWriter ps = new PrintWriter("src/kepviselok.txt", "UTF-8")) {
            for (int i = 1; i < nyertesek.length; i++) {
                ps.println(nyertesek[i]);
            }
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            System.out.println("> " + ex.getMessage());
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1. feladat");
        readArray();
        System.out.println("2. feladat");
        System.out.println("A helyhatosági választáson "
                + jeloltek.length + " képviselőjelölt indult.");
        System.out.println("3. feladat");
        jelolt();
        System.out.println("4. feladat");
        osszes();
        System.out.println("5. feladat");
        partok();
        System.out.println("6. feladat");
        max();
        System.out.println("7. feladat");
        nyertesek();
    }

}
