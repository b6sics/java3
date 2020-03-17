package konyves;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import konyves.alap.Konyv;

/**
 *
 * @author t1
 */
public class KonyvDemo {

    static ArrayList<Konyv> konyvek = new ArrayList<>();

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // beolvasás
        Scanner be = new Scanner(new File(args[0]));
        while (be.hasNextLine()) {
            String s[] = be.nextLine().split(",");
            konyvek.add(new Konyv(s[0], s[1],
                    Integer.parseInt(s[2]), Integer.parseInt(s[3])));
        }
        be.close();
        // kiírás
        System.out.println("Könyvek> ");
        for (Konyv k : konyvek) {
            System.out.println(k.toString());
        }
        // leghosszabb könyv
        int legh = 0;
        for (int i = 1; i < konyvek.size(); i++) {
            if (Konyv.hosszabb(konyvek.get(i), konyvek.get(legh)) > 0) {
                legh = i;
            }
        }
        System.out.println("\nLeghosszabb> ");
        System.out.println(konyvek.get(legh).toString());
    }
}
