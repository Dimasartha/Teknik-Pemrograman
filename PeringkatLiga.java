import java.util.concurrent.ConcurrentHashMap;

class PeringkatLiga {
    private final ConcurrentHashMap<String, Integer> peringkat;

    public PeringkatLiga() {
        this.peringkat = new ConcurrentHashMap<>();
    }

    public void tambahTim(String namaTim) {
        peringkat.put(namaTim, 0);
    }

    public void updatePoin(String tim, int poin) {
        peringkat.merge(tim, poin, Integer::sum);
    }

    public void tampilkanPeringkat() {
        peringkat.entrySet().stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue() + " poin"));
    }
}