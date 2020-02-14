/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author t1
 */
public class AlkalmazottDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alkalmazott a = new Alkalmazott("Nagy János",300000);
        System.out.println("> " + a.adatok());
        a.novel(10000);
        System.out.println("> " + a.adatok());
    }

}
