import java.util.Scanner;

public class Kontroll {

    public static int kontrolli(int juhuslik, int manguTase, Scanner arv) {
        int skoor = 1;
        int min = 1;
        int max = 10; // Selleks, et kontrollida kas arv on nõutud vahemikus

        if (manguTase == 0) {
            System.out.println("Sisesta arv vahemikus 1-10: ");
            max = 10;
        }
        if (manguTase == 1) {
            System.out.println("Sisesta arv vahemikus 1-100: ");
            max = 100;
        }
        if (manguTase == 2) {
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
                else if (sisestatudArv > juhuslik) {
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
