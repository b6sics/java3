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
public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Henger a = new Henger(5, 4);
        System.out.println(a.toString() + ", térfogata: " + a.terfogat());
        Teglatest b = new Teglatest(5, 4, 6);
        System.out.println(b.toString() + ", térfogata: " + b.terfogat());
        if (a.nagyobbMint(b)) {
            System.out.println("A nagyobb térfogatú: " + a.toString());
        } else {
            System.out.println("A nagyobb térfogatú: " + b.toString());
        }
    }
}
