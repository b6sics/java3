/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haromszogdemo;

import java.util.Random;

/**
 *
 * @author t1
 */
public class HaromszogDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        double o1 = 10 * rand.nextDouble();
        double o2 = 10 * rand.nextDouble();
        double o3 = 10 * rand.nextDouble();
        Haromszog haromszog = new Haromszog(o1, o2, o3);
        System.out.println("> " + haromszog.adatok());
        System.out.println("Kerület> " + haromszog.kerulet());
    }

}
