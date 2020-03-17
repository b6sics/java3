package arus;

/**
 *
 * @author KjG
 */
public class AruDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aru a = new Aru("Tej", 200, 27);
        Kenyer b = new Kenyer("Barna kenyér", 180, 27, .5);
        System.out.println("Első áru: " + b.toString());
        System.out.println("Első áru: " + b.toString());
        switch (a.hasonlit(b)) {
            case 1:
                System.out.println("A drágább: " + a.toString());
                break;
            case 2:
                System.out.println("A drágább: " + b.toString());
                break;
            default:
                System.out.println("Egyforma árúak");
                break;
        }
        System.out.println("");
        Aru aru2 = new Kenyer("Rozsos Kenyér", 220, 27, .75);

        Kenyer keny2 = new Kenyer("Cipó", 200, 27, .5);

        if (Kenyer.elsoDragabb((Kenyer) aru2, keny2)) {
            System.out.println("A nagyobb egységárú: " + aru2.toString());
        } else {
            System.out.println("A nagyobb egységárú: " + keny2.toString());
        }
    }

}
