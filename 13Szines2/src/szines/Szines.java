/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szines;

import javafx.scene.paint.Color;

/**
 *
 * @author t1
 */
public class Szines {

    private static void szinAlapra(Szinezheto mit) {
        mit.setSzin(Szinezheto.ALAPSZIN);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Szinezheto sz1 = new SzinesPont(Color.BLACK, 4, 3);
        System.out.println(sz1);
        sz1.setSzin(Color.YELLOW);
        System.out.println(sz1);

        SzinesPont sz2 = (SzinesPont) sz1;
        sz2.sajatSzin(55, 68, 72);
        System.out.println(sz1);

        SzinesPont sz3 = new SzinesPont(Color.CYAN, 1, 1);
        szinAlapra(sz3);
        System.out.println(sz3);
    }

}
