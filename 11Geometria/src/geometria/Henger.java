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
public class Henger extends Hasab {

    private double sugar;

    public Henger(double sugar, double magassag) {
        super(magassag);
        this.sugar = sugar;
    }

    @Override
    public double alapterulet() {
        return sugar * sugar * Math.PI;
    }

    @Override
    public String toString() {
        return "Henger: m=" + getMagassag() + ", r=" + sugar;
    }
}
