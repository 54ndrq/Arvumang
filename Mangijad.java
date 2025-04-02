import java.util.ArrayList;
import java.util.List;

public class Mangijad {
    public List<Mangija> getMangijateKogu() {
        return mangijateKogu;
    }

    private final List<Mangija> mangijateKogu = new ArrayList<>(); // List kõikidest mängijatest

    public void lisaMangija(Mangija mangija) {
        mangijateKogu.add(mangija);
    }

}
