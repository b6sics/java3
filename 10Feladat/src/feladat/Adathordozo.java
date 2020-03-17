/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat;

/**
 *
 * @author t1
 */
public class Adathordozo {

    private String nev;
    int kapacitas;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKapacitas() {
        return kapacitas;
    }

    public void setKapacitas(int kapacitas) {
        this.kapacitas = kapacitas;
    }

    public Adathordozo(String nev, int kapacitas) {
        this.nev = nev;
        this.kapacitas = kapacitas;
    }

    public boolean nagyobbmint(Adathordozo adathordozo) {
        return this.getKapacitas() > adathordozo.getKapacitas();
    }

    @Override
    public String toString() {
        return nev + ", kapacitás = " + kapacitas;
    }
}
