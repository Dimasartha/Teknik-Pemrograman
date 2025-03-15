import java.util.*;

class Tim {
    private final String namaTim;
    private final List<Pemain> daftarPemain;
    private final Set<Integer> nomorPunggungUnik;
    private final Map<Integer, Pemain> pemainMap;

    public Tim(String namaTim) {
        this.namaTim = namaTim;
        this.daftarPemain = new ArrayList<>();
        this.nomorPunggungUnik = new HashSet<>();
        this.pemainMap = new HashMap<>();
    }

    public void tambahPemain(Pemain pemain) {
        if (nomorPunggungUnik.add(pemain.nomor())) {
            daftarPemain.add(pemain);
            pemainMap.put(pemain.nomor(), pemain);
        } else {
            System.out.println("Nomor punggung sudah digunakan!");
        }
    }

    public Optional<Pemain> cariPemain(int nomor) {
        return Optional.ofNullable(pemainMap.get(nomor));
    }

    public String getNamaTim() {
        return namaTim;
    }

    public List<Pemain> getDaftarPemain() {
        return Collections.unmodifiableList(daftarPemain);
    }
}