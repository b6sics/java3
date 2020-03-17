/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pardemo;

/**
 *
 * @author t1
 */
public class Pardemo {

    private static Par<String, Integer> tartalmaz(String[] miben, String mit) {
        for (int i = 0; i < miben.length; i++) {
            if (miben[i].contains(mit)) {
                return new Par<>(miben[i], i);
            }
        }
        return new Par<>(null, -1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nevek = {
            "Csákányi László",
            "Psota Irén",
            "Váradi Hédi",
            "Márkus László"
        };

        Par<String, Integer> eredmeny = tartalmaz(nevek, "Márk");
        System.out.println(eredmeny);

        eredmeny = tartalmaz(nevek, "márk");
        System.out.println(eredmeny);

        Par<String, String> hang = new Par<>("Frédi", "Csákányi László");
        System.out.println(hang);
    }

}
