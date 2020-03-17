/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csatoltlista;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author t1
 */
public class Csatoltlista {

    static LinkedList<String> nevek = new LinkedList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nevek.add("Diana");
        nevek.add("Harry");
        nevek.add("Romeo");
        nevek.add("Tom");

        ListIterator<String> it = nevek.listIterator();
        it.next();
        it.next();

        it.add("Juliet");
        it.add("Nina");
        it.next();

        it.remove();

        System.out.println("> " + nevek);
    }

}
