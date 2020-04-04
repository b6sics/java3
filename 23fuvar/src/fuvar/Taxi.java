/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuvar;

/**
 *
 * @author b6dmin
 */
public class Taxi {

    private int taxi;
    private String indulas;
    private int ido;
    private double tav;
    private double dij;
    private double bonusz;
    private String mod;

    public int getTaxi() {
        return taxi;
    }

    public void setTaxi(int taxi) {
        this.taxi = taxi;
    }

    public String getIndulas() {
        return indulas;
    }

    public void setIndulas(String indulas) {
        this.indulas = indulas;
    }

    public int getIdo() {
        return ido;
    }

    public void setIdo(int ido) {
        this.ido = ido;
    }

    public double getTav() {
        return tav;
    }

    public void setTav(double tav) {
        this.tav = tav;
    }

    public double getDij() {
        return dij;
    }

    public void setDij(double dij) {
        this.dij = dij;
    }

    public double getBonusz() {
        return bonusz;
    }

    public void setBonusz(double bonusz) {
        this.bonusz = bonusz;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public Taxi(int taxi, String indulas, int ido, double tav, double dij, double bonusz, String mod) {
        this.taxi = taxi;
        this.indulas = indulas;
        this.ido = ido;
        this.tav = tav;
        this.dij = dij;
        this.bonusz = bonusz;
        this.mod = mod;
    }

    @Override
    public String toString() {
        return taxi + ";" + indulas + ";" + ido + ";" + tav
                + ";" + dij + ";" + bonusz + ";" + mod;
    }
}
