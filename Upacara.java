import java.util.ArrayList;
import java.util.List;

public class Upacara<T extends Person> {
    private final List<T> peserta = new ArrayList<>();

    public void tambahkanPeserta(T t) {
        peserta.add(t);
    }

    public void tampilkanUrutan() {
        int i = 1;
        for (T t : peserta) {
            System.out.println(i + ". " + t);
            i++;
        }
    }
}