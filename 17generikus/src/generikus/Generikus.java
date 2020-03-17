/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generikus;

/**
 *
 * @author t1
 */
public class Generikus {

    private static <T> void printArray(T[] tomb) {
        for (T t : tomb) {
            System.out.print(t + " ");
            System.out.println("");
        }
    }

    private static <T extends Comparable<T>> T maximum(T[] tomb) {
        T max = tomb[0];
        for (int i = 1; i < tomb.length; i++) {
            if (tomb[i].compareTo(max) > 0) {
                max = tomb[i];
            }
        }
        return max;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] egeszek = {
            1, 2, 3, 4, 5, 0
        };

        Double[] tortek = {
            1.1, 2.2, 3.3, 4.4, -1.2
        };

        Character[] betuk = {
            'A', 'B', 'C', 'Z'
        };

        System.out.println("Egészek");
        printArray(egeszek);
        System.out.println("Legnagyobb: " + maximum(egeszek));

        System.out.println("Törtek");
        printArray(tortek);
        System.out.println("Legnagyobb: " + maximum(tortek));

        System.out.println("Betűk");
        printArray(betuk);
        System.out.println("Legnagyobb: " + maximum(betuk));
    }

}
