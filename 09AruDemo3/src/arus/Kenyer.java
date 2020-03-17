package arus;

/**
 * Gyermek osztály
 *
 * @author kJg
 */
public class Kenyer extends Aru {

    private double mennyiseg;

    public Kenyer(String nev, int ar, int afakulcs, double mennyiseg) {
        super(nev, ar, afakulcs);
        this.mennyiseg = mennyiseg;
    }

    public double getMennyiseg() {
        return mennyiseg;
    }

    private double egysegar() {
        return brutto() / mennyiseg;
    }

    public static boolean elsoDragabb(Kenyer a, Kenyer b) {
        return a.egysegar() > b.egysegar();
    }

    @Override
    public String toString() {
        return super.toString() + ", " + mennyiseg + " kg";
    }

}
