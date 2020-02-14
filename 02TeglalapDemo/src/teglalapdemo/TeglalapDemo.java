/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teglalapdemo;

/**
 *
 * @author t1
 */
public class TeglalapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teglalap t1 = new Teglalap(5, 6);
        Teglalap t2 = new Teglalap(7);

        System.out.println("t1> " + t1.adatok());
        System.out.println("t2> " + t2.adatok());

        Teglalap t3 = t2;

        t3.beallit(6, 4);
        System.out.println("t1> " + t1.adatok());
        System.out.println("t2> " + t2.adatok());
        System.out.println("t3> " + t3.adatok());

        System.out.println("t1 nagyobb t2> " + t1.nagyobbmint(t2));
        System.out.println("t2 egyenlő t3> " + t2.egyenlo(t3));
    }

}
