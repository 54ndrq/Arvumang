import java.util.ArrayList;
import java.util.List;

public class Mangija {
    List<List<Integer>> mangijaTulemused = new ArrayList<>(); // 1 tulemus on arraylist mis sisaldab mängu taset
    // ning selle tulemust, mangijaTulemused sisaldab kõiki tulemusi
    private final String mangijaNimi;

    public Mangija(String mangijaNimi) {
        this.mangijaNimi = mangijaNimi;
    }

    public String getMangijaNimi() {
        return mangijaNimi;
    }

    // Siia veel parima tulemuse get meetod
}
