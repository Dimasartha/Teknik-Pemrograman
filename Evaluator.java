import java.util.List;

public class Evaluator {
    public static void evaluasisemua(List<? extends Person> peserta) {
        for (Person p : peserta) {
            System.out.println("Evaluasi: " + p.getNama());
        }
    }
}