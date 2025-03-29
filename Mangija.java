import java.util.ArrayList;
import java.util.List;

public class Mangija {
    List<List<Integer>> mangijaTulemused = new ArrayList<List<Integer>>(); // 1 tulemus on arraylist mis sisaldab mängu taset ning selle tulemust, mangijaTulemused sisaldab kõiki tulemusi
    String mangijaNimi;

    public Mangija(String mangijaNimi) {
        this.mangijaNimi = mangijaNimi;
    }

    public void lisaTulemus(List<Integer> tulemus) {
        mangijaTulemused.add(tulemus);
    }

    // Siia veel parima tulemuse get meetod

}
