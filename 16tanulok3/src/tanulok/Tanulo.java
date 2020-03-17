package tanulok;

public class Tanulo implements Comparable<Tanulo> {

    private String nev;
    private int szulev;
    private double atlag;

    public Tanulo(String nev, int szulev, double atlag) {
        this.nev = nev;
        this.szulev = szulev;
        this.atlag = atlag;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getSzulev() {
        return szulev;
    }

    public void setSzulev(int szulev) {
        this.szulev = szulev;
    }

    public double getAtlag() {
        return atlag;
    }

    public void setAtlag(double atlag) {
        this.atlag = atlag;
    }

    @Override
    public String toString() {
        return nev + ", " + szulev + ", " + atlag;
    }

    @Override
    public boolean equals(Object masik) {
        if (masik != null && masik instanceof Tanulo) {
            Tanulo t = (Tanulo) masik;
            return nev.equals(t.getNev())
                    && szulev == t.getSzulev()
                    && atlag == t.getAtlag();

        }
        return false;
    }

    @Override
    public int compareTo(Tanulo t) {
        int c = getNev().compareTo(t.getNev());
        if (c != 0) {
            return c;
        }
        c = Integer.compare(getSzulev(), t.getSzulev());
        if (c != 0) {
            return c;
        }
        return Double.compare(getAtlag(), t.getAtlag());
    }
}
