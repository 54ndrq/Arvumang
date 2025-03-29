import java.util.ArrayList;
import java.util.List;

public class Mangijad {
    List<Mangija> mangijateKogu = new ArrayList<Mangija>(); // List kõikidest mängijatest

    public void lisaMangija(Mangija mangija) {
        mangijateKogu.add(mangija);
    }

}
