import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class alustaMang {

    public static void start(int manguTase, Mangija mangija) {

        if (manguTase == 0) { // Tuleb arvata vahemikus [-1,10]
            System.out.println("Alustasid mängu! Mängija: " + mangija.mangijaNimi + ", tase: " + manguTase + "\n");
            int juhuslik = (int) (1 + Math.random() * 10);
            int skoor = Kontroll.kontrolli(juhuslik, manguTase);
            List<Integer> tulemus = new ArrayList<>(Arrays.asList(manguTase, skoor));
            mangija.lisaTulemus(tulemus);
        }

        else if (manguTase == 1) { // Tuleb arvata vahemikus [-1,100]
            System.out.println("Alustasid mängu! Mängija: " + mangija + ", tase: " + manguTase + "\n");
            int juhuslik = (int) (1 + Math.random() * 100);
            int skoor = Kontroll.kontrolli(juhuslik, manguTase);
            List<Integer> tulemus = new ArrayList<>(Arrays.asList(manguTase, skoor));
            mangija.lisaTulemus(tulemus);
        }

        else if (manguTase == 2) {// Tuleb arvata vahemikus [-1,1000]
            System.out.println("Alustasid mängu! Mängija: " + mangija + ", tase: " + manguTase + "\n");
            int juhuslik = (int) (1 + Math.random() * 1000);
            int skoor = Kontroll.kontrolli(juhuslik, manguTase);
            List<Integer> tulemus = new ArrayList<>(Arrays.asList(manguTase, skoor));
            mangija.lisaTulemus(tulemus);
        } else {
            System.out.println("Ebakorrektne mängutase. Vali mängutase vahemikus 0-2");
        }

    }
}
