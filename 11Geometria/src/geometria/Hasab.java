/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author t1
 */
public abstract class Hasab {

    private double magassag;

    public double getMagassag() {
        return magassag;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    public Hasab(double magassag) {
        this.magassag = magassag;
    }

    public abstract double alapterulet();

    public double terfogat() {
        return alapterulet() * magassag;
    }

    public boolean nagyobbMint(Hasab masik) {
        return terfogat() > masik.terfogat();
    }

}
