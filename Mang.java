import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Mang klass genereerib tasemele vastava arvu, kontrollib kasutaja sisendit sellega võrreldes ja lisab
// iga vale pakkumise eest punkti

public class Mang {
    public static int KERGE = 1;
    public static int KESKMINE = 2;
    public static int RASKE = 3;

    public static void start(int manguTase, Mangija mangija, Scanner arv) {
        if (manguTase != KERGE && manguTase != KESKMINE && manguTase != RASKE) {
            System.out.println("Ebakorrektne mängutase. Vali mängutase vahemikus 1-3");
            return;
        }

        System.out.println("Alustasid mängu! Mängija: " + mangija.getMangijaNimi()+ " | Tase: " + manguTase + "\n");

        if (manguTase == KERGE) { // Tuleb arvata vahemikus [1,10]
            int juhuslik = (int) (1 + Math.random() * 10);
            int skoor = kontrolli(juhuslik, manguTase, arv);
            mangija.mangijaTulemused.add(new ArrayList<>(Arrays.asList(manguTase, skoor)));
        } else if (manguTase == KESKMINE) { // Tuleb arvata vahemikus [1,100]
            int juhuslik = (int) (1 + Math.random() * 100);
            int skoor = kontrolli(juhuslik, manguTase, arv);
            mangija.mangijaTulemused.add(new ArrayList<>(Arrays.asList(manguTase, skoor)));
        } else {// Tuleb arvata vahemikus [1,1000]
            int juhuslik = (int) (1 + Math.random() * 1000);
            int skoor = kontrolli(juhuslik, manguTase, arv);
            mangija.mangijaTulemused.add(new ArrayList<>(Arrays.asList(manguTase, skoor)));
        }
    }

    private static int kontrolli(int juhuslik, int manguTase, Scanner arv) {
        int skoor = 0;
        int min = 1;
        int max = 10; // Selleks, et kontrollida kas arv on nõutud vahemikus

        if (manguTase == Mang.KERGE) {
            System.out.println("Sisesta arv vahemikus 1-10: ");
        }
        if (manguTase == Mang.KESKMINE) {
            System.out.println("Sisesta arv vahemikus 1-100: ");
            max = 100;
        }
        if (manguTase == Mang.RASKE) {
            System.out.println("Sisesta arv vahemikus 1-1000: ");
            max = 1000;
        }

        while (true) {
            int sisestatudArv = arv.nextInt();

            if (sisestatudArv <= max && sisestatudArv >= min) {
                if (sisestatudArv == juhuslik) {
                    System.out.println("Tubli! Arvasid õigesti.");
                    break;
                }
                else if (sisestatudArv < juhuslik) {
                    System.out.println("Liiga väike. Proovi uuesti.");
                    skoor++;
                }
                else {
                    System.out.println("Liiga suur. Proovi uuesti.");
                    skoor++;
                }
            } else {
                System.out.println("Arv ei ole nõutud vahemikus!");
            }
        }

        return skoor;
    }
}
