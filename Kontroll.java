import java.util.Scanner;

public class Kontroll {

    static void kontrolli(int juhuslik) {
        Scanner arv = new Scanner(System.in);
        System.out.println("Sisesta arv vahemikus 1-10: ");
        String sisestatudArv = arv.nextLine();

        int tulemus = võrdle(Integer.parseInt(sisestatudArv), juhuslik);

        //Küsib uuesti, kui vale pakkumine
        if (tulemus == 0) {
            System.out.println("Tubli! Arvasid õigesti.");
        } else if (tulemus == 1) {
            System.out.println("Liiga suur. Proovi uuesti ");
            kontrolli(juhuslik);
        } else {
            System.out.println("Liiga väike. Proovi uuesti");
            kontrolli(juhuslik);
        }
    }

    //Kas sisestatud arv on suurem või väiksem
    static int võrdle(int sisestatud, int juhuslik) {
        if (juhuslik == sisestatud) {
            return 0;
        } else if (juhuslik < sisestatud) {
            return 1;
        } else return -1;

    }
}
