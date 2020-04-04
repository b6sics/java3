/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuvar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author b6dmin
 */
public class Fuvar {

    private String forras = "fuvar.csv";
    private String cel = "hibak.txt";
    private List<Taxi> fuvarok;
    private final String DELIMITER = ";";
    TreeMap<String, Integer> gyakorisag;

    private void beolvas() {
        fuvarok = new ArrayList<>();
        try (Scanner be = new Scanner(new File(forras), "UTF-8")) {
            be.nextLine();
            while (be.hasNext()) {
                String sor = be.nextLine();
                String[] adatok = sor.replaceAll(",", ".").split(DELIMITER);
                Taxi t = new Taxi(Integer.parseInt(adatok[0]),
                        adatok[1],
                        Integer.parseInt(adatok[2]),
                        Double.parseDouble(adatok[3]),
                        Double.parseDouble(adatok[4]),
                        Double.parseDouble(adatok[5]),
                        adatok[6]);
                fuvarok.add(t);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fuvar.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(fuvarok.size() + " fuvar");
    }

    private void a6185() {
        double bevetel = 0;
        int fuvarszam = 0;
        for (Taxi taxi : fuvarok) {
            if (taxi.getTaxi() == 6185) {
                fuvarszam++;
                bevetel += taxi.getDij() + taxi.getBonusz();
            }
        }
        System.out.println(fuvarszam + " alatt: " + bevetel + "$");
    }

    private void fizetes_modok() {
        gyakorisag = new TreeMap<>();
        String mod;
        Set set;
        for (Taxi taxi : fuvarok) {
            mod = taxi.getMod();
            if (gyakorisag.isEmpty()) {
                gyakorisag.put(mod, 0);
            }
            set = gyakorisag.entrySet();
            if (gyakorisag.keySet().contains(mod)) {
                Integer db = gyakorisag.get(mod);
                db++;
                gyakorisag.put(mod, db);
            } else {
                gyakorisag.put(mod, 1);
            }
        }
        gyakorisag.entrySet().forEach((entry) -> {
            System.out.println(
                    "\t" + entry.getKey() + ": " + entry.getValue() + " fuvar"
            );
        });
    }

    private void km() {
        double ossz = 0;
        for (Taxi taxi : fuvarok) {
            ossz += taxi.getTav();
        }
        String sout = String.format("%.2f km", ossz * 1.6);
        System.out.println(sout);
    }

    private void leghosszabb() {
        int hossz = 0;
        int index = 0;
        for (Taxi taxi : fuvarok) {
            if (hossz < taxi.getIdo()) {
                index = fuvarok.indexOf(taxi);
                hossz = taxi.getIdo();
            }
        }
        String sout = String.format(
                "\tFuvar hossza: %d másodperc",
                hossz);
        System.out.println(sout);
        sout = String.format(
                "\tTaxi azonosító: %d",
                fuvarok.get(index).getTaxi());
        System.out.println(sout);
        sout = String.format(
                "\tMegtett távolság: %.1f km",
                fuvarok.get(index).getTav() * 1.6);
        System.out.println(sout);
        sout = String.format(
                "\tViteldíj: %.2f$", fuvarok.get(index).getDij());
        System.out.println(sout);
    }

    private void hibak() {
        System.out.println(cel);

        try (PrintWriter ki = new PrintWriter(new File(cel), "UTF-8")) {
            for (Taxi taxi : fuvarok) {
                if (taxi.getTav() == 0) {
                    //System.out.println(taxi.getIdo() + ";" + taxi.getTav());
                    if (taxi.getIdo() > 0 && taxi.getTav() > 0) {
                        System.out.println("->");
                        ki.println(taxi);
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Fuvar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fuvar lista = new Fuvar();
        System.out.print("3. feladat: ");
        lista.beolvas();
        System.out.print("4. feladat: ");
        lista.a6185();
        System.out.println("5. feladat: ");
        lista.fizetes_modok();
        System.out.print("6. feladat: ");
        lista.km();
        System.out.println("7. feladat: Leghosszabb fuvar:  ");
        lista.leghosszabb();
        System.out.print("8. feladat: ");
        lista.hibak();
    }

}
