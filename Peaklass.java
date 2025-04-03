import java.util.List;
import java.util.Scanner;

// Peaklass tegeleb kasutajasisendi ja mängu haldamisega
public class Peaklass {
    public static void main(String[] args) {
        Mangijad mangijateKogu = new Mangijad();
        Scanner scanner = new Scanner(System.in);

        int valik;
        int LISA_MANGIJA = 1;
        int KUVA_MANGIJAD = 2;
        int START = 3;
        int VALJU = 4;

        while (true) {
            System.out.println("Vali tegevus:");
            System.out.printf("[%s] - Lisa uus mängija\n", LISA_MANGIJA);
            System.out.printf("[%s] - Kuva mängijad ja nende skoorid\n", KUVA_MANGIJAD);
            System.out.printf("[%s] - Alusta mäng\n", START);
            System.out.printf("[%s] - Sulge programm\n", VALJU);

            valik = scanner.nextInt();
            if (valik == VALJU) {
                break;
            }

            if (valik == LISA_MANGIJA) {
                lisaMangija(scanner, mangijateKogu);
            } else if (valik == KUVA_MANGIJAD) {
                kuvaMangijad(mangijateKogu);
            } else if (valik == START) {
                mangi(scanner, mangijateKogu);
            }
        }

        System.out.println("Programm katkestatud.");
        scanner.close();
    }

    private static void mangi(Scanner scanner, Mangijad mangijateKogu) {
        System.out.println("Vali mängu tase (1-3): ");
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        String taseS = scanner.nextLine();
        int tase = Integer.parseInt(taseS);

        System.out.println("Vali mängija: ");
        for (Mangija mangija : mangijateKogu.getMangijateKogu()) {
            System.out.println(mangija.getMangijaNimi());
        }
        String mangijaNimi = scanner.nextLine();
        boolean mangijaLeitud = false;

        for (Mangija m : mangijateKogu.getMangijateKogu()) {
            if (m.getMangijaNimi().equalsIgnoreCase(mangijaNimi)) {
                Mang.start(tase, m, scanner);
                mangijaLeitud = true;
                break;
            }
        }

        if (!mangijaLeitud) {
            System.out.println("Sellise nimega mängijat ei leitud!");
        }
    }

    private static void kuvaMangijad(Mangijad mangijateKogu) {
        System.out.println("Mängijad: ");
        for (Mangija mangija : mangijateKogu.getMangijateKogu()) {
            System.out.println(mangija.getMangijaNimi());
            for (List<Integer> tulemus : mangija.mangijaTulemused) {
                System.out.println("Mängu tase: " + tulemus.get(0) + " | Skoor: " + tulemus.get(1));
            }
        }
        System.out.println();
    }

    private static void lisaMangija(Scanner scanner, Mangijad mangijateKogu) {
        System.out.println("Sisesta mängija nimi: ");
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        String mangijaNimi = scanner.nextLine();
        Mangija mangija = new Mangija(mangijaNimi);
        mangijateKogu.lisaMangija(mangija);
        System.out.println("Mängija " + mangijaNimi + " on loodud! \n" );
    }
}
