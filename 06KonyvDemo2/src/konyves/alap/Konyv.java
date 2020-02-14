package konyves.alap;

/**
 *
 * @author t1
 */
public class Konyv {

    private String iro;
    private String cim;
    private int oldalszam;
    private int ar;

    public Konyv(String iro, String cim, int oldalszam, int ar) {
        this.iro = iro;
        this.cim = cim;
        this.oldalszam = oldalszam;
        this.ar = ar;
    }

    @Override
    public String toString() {
        return iro + ", " + cim + ", " + oldalszam + ", " + ar;
    }

    public static int hosszabb(Konyv a, Konyv b) {
        return a.oldalszam - b.oldalszam;
    }
}
