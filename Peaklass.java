import java.util.List;
import java.util.Scanner;

public class Peaklass {
    public static void main(String[] args) {

        Mangijad mangijateKogu = new Mangijad();

        Scanner scanner = new Scanner(System.in);

        int valik; // Kasutaja saab valida mida programmis teha
        // 1 - Lisa uus mangija
        // 2 - Kuva kõik mängijad
        // 3 - Kuva mingi mängija skoorid
        // 4 - Alusta mäng
        // 5 - Sulge programm

        do {
            System.out.println("Vali tegevus:");
            System.out.println("[1] - Lisa uus mängija");
            System.out.println("[2] - Kuva kõik mängijad");
            System.out.println("[3] - Kuva mängija skoorid");
            System.out.println("[4] - Alusta mäng");
            System.out.println("[5] - Sulge programm \n");

            valik = scanner.nextInt();

            if (valik == 1) {
                System.out.println("Sisesta mängija nimi: ");
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }
                String mangijaNimi = scanner.nextLine();
                Mangija mangija = new Mangija(mangijaNimi);
                mangijateKogu.lisaMangija(mangija);
                System.out.println("Mängija " + mangijaNimi + " on loodud! \n" );
            } else if (valik == 2) {
                System.out.println("Kõik registreeritud mängijad: ");
                for (Mangija mangija : mangijateKogu.mangijateKogu) {
                    System.out.println(mangija.getMangijaNimi());
                }
                System.out.println("\n");
            } else if (valik == 3) {
                System.out.println("Sisesta mängija nimi: ");
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }
                String mangijaNimi = scanner.nextLine();
                boolean mangijaLeitud = false;
                for (Mangija m : mangijateKogu.mangijateKogu) {
                    if (m.getMangijaNimi().equalsIgnoreCase(mangijaNimi)) {
                        mangijaLeitud = true;
                        System.out.println("Mängija " + mangijaNimi + " skoorid:" );
                        for (List<Integer> tulemus : m.mangijaTulemused) {
                            System.out.println("Mängu tase: " + tulemus.get(0) + " | Skoor: " + tulemus.get(1));
                        }
                        break;
                    }
                }
                if (!mangijaLeitud) {
                    System.out.println("Sellise nimega mängijat ei leitud!");
                }
                System.out.println("\n");
            } else if (valik == 4) {
                System.out.println("Vali mängu tase (0-2): ");
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }
                String taseS = scanner.nextLine();
                int tase = Integer.parseInt(taseS);

                System.out.println("Vali mängija: ");
                String mangijaNimi = scanner.nextLine();
                boolean mangijaLeitud = false;

                for (Mangija m : mangijateKogu.mangijateKogu) {
                    if (m.getMangijaNimi().equalsIgnoreCase(mangijaNimi)) {
                        alustaMang.start(tase, m, scanner);
                        mangijaLeitud = true;
                        break;
                    }
                }

                if (!mangijaLeitud) {
                    System.out.println("Sellise nimega mängijat ei leitud!");
                }
                System.out.println("\n");

            } else if (valik != 5) {
                System.out.println("Ebakorrektne valik!");
            }

        } while (valik != 5);

        System.out.println("Programm katkestatud.");
        scanner.close();

    }
}
