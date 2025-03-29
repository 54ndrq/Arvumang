import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class alustaMang {

    public static void start(int manguTase, Mangija mangija, Scanner arv) {

        if (manguTase == 0) { // Tuleb arvata vahemikus [-1,10]
            System.out.println("Alustasid mängu! Mängija: " + mangija.mangijaNimi + " | Tase: " + manguTase + "\n");
            int juhuslik = (int) (1 + Math.random() * 10);
            int skoor = Kontroll.kontrolli(juhuslik, manguTase, arv);
            mangija.mangijaTulemused.add(new ArrayList<>(Arrays.asList(manguTase, skoor)));
        }

        else if (manguTase == 1) { // Tuleb arvata vahemikus [-1,100]
            System.out.println("Alustasid mängu! Mängija: " + mangija + " | Tase: " + manguTase + "\n");
            int juhuslik = (int) (1 + Math.random() * 100);
            int skoor = Kontroll.kontrolli(juhuslik, manguTase, arv);
            mangija.mangijaTulemused.add(new ArrayList<>(Arrays.asList(manguTase, skoor)));
        }

        else if (manguTase == 2) {// Tuleb arvata vahemikus [-1,1000]
            System.out.println("Alustasid mängu! Mängija: " + mangija + " | Tase: " + manguTase + "\n");
            int juhuslik = (int) (1 + Math.random() * 1000);
            int skoor = Kontroll.kontrolli(juhuslik, manguTase, arv);
            mangija.mangijaTulemused.add(new ArrayList<>(Arrays.asList(manguTase, skoor)));
        } else {
            System.out.println("Ebakorrektne mängutase. Vali mängutase vahemikus 0-2");
        }

    }
}
