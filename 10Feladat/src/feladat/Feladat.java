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
public class Feladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adathordozo[] hd = new Adathordozo[4];
        hd[0] = new Merevlemez(320, 5400);
        hd[1] = new Merevlemez(1000, 7200);
        hd[2] = new Pendrive(32, 2);
        hd[3] = new Pendrive(64, 3);

        System.out.println(" " + hd[0].toString());
        System.out.println(" " + hd[1].toString());
        System.out.println(" " + hd[2].toString());
        System.out.println(" " + hd[3].toString());

        System.out.print("A legnagyobb kapacitású: ");
        if (hd[0].nagyobbmint(hd[1])) {
            System.out.println(hd[0]);
        } else {
            System.out.println(hd[1]);
        }

        for (Adathordozo adathordozo : hd) {
            if (adathordozo instanceof Pendrive) {
                System.out.println(adathordozo.toString());
            }
        }
    }

}
