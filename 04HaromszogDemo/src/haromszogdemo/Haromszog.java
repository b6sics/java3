/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haromszogdemo;

/**
 *
 * @author t1
 */
public class Haromszog {

    private double old1, old2, old3;

    public Haromszog(double old1, double old2, double old3) {
        this.old1 = old1;
        this.old2 = old2;
        this.old3 = old3;
    }

    private boolean alkot() {
        return old1 + old2 > old3
                && old1 + old3 > old2
                && old2 + old3 > old1;
    }

    public String adatok() {
        String s = old1 + ", " + old2 + ", " + old3 + ", ";
        if (alkot()) {
            return s + "háromszög.";
        }
        return s + "nem háromszög";

    }

    public double kerulet() {
        return old1 + old2 + old3;
    }
}
