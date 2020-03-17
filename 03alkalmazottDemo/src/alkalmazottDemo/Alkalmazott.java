package alkalmazottDemo;

/**
 * Alkalmazott osztály
 *
 * @author kJg
 */
public class Alkalmazott {

    private String nev;
    private int fizetes;
    private int szulev;

    public String getNev() {
        return nev;
    }

    public int getFizetes() {
        return fizetes;
    }

    public int getSzulev() {
        return szulev;
    }

    private static int ev = 2017;
    private static int korhatar = 65;

    public static void setEv(int ev) {
        Alkalmazott.ev = ev;
    }

    public static void setKorhatar(int korhatar) {
        Alkalmazott.korhatar = korhatar;
    }

    public Alkalmazott(String nev, int fizetes, int szulev) {
        this.nev = nev;
        this.fizetes = fizetes;
        this.szulev = szulev;
    }

    /*
    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setFizetes(int fizetes) {
        this.fizetes = fizetes;
    }
     */
    void novel(int nov) {
        fizetes += nov;
    }

    String adatok() {
        return nev + ": " + eveknyugdijig() + " " + fizetes;
    }

    public int eveknyugdijig() {
        return korhatar - (ev - szulev);
    }
}
