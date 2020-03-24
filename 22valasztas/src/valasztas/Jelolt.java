/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valasztas;

/**
 *
 * @author b6dmin
 */
public class Jelolt {

    private final int kerulet;
    private final int szavazatok;
    private final String nev;
    private String part;

    public Jelolt(String[] tomb) {
        kerulet = Integer.parseInt(tomb[0]);
        szavazatok = Integer.parseInt(tomb[1]);
        nev = tomb[2] + " " + tomb[3];
        part = tomb[4];
        if (part.equals("-")) {
            part = "fuggetlen";
        }
    }

    public int getKerulet() {
        return kerulet;
    }

    public int getSzavazatok() {
        return szavazatok;
    }

    public String getNev() {
        return nev;
    }

    public String getPart() {
        return part;
    }

    @Override
    public String toString() {
        return kerulet + " " + nev + " " + part;
    }
}
