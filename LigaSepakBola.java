import java.util.*;

class LigaSepakBola {
    private final List<Tim> daftarTim;
    private final JadwalPertandingan jadwal;
    private final PeringkatLiga peringkatLiga;

    public LigaSepakBola() {
        this.daftarTim = new ArrayList<>();
        this.jadwal = new JadwalPertandingan();
        this.peringkatLiga = new PeringkatLiga();
    }

    public void tambahTim(Tim tim) {
        daftarTim.add(tim);
        peringkatLiga.tambahTim(tim.getNamaTim());
    }

    public void jadwalkanPertandingan() {
        for (int i = 0; i < daftarTim.size(); i++) {
            for (int j = i + 1; j < daftarTim.size(); j++) {
                jadwal.tambahPertandingan(daftarTim.get(i).getNamaTim(), daftarTim.get(j).getNamaTim());
            }
        }
    }

    public void mulaiLiga() {
        jadwal.jalankanPertandingan(peringkatLiga);
        peringkatLiga.tampilkanPeringkat();
    }

    public void mulaiLigaManual(Scanner scanner) {
        jadwal.jalankanPertandinganManual(peringkatLiga, scanner);
        peringkatLiga.tampilkanPeringkat();
    }

    public List<Tim> getDaftarTim() {
        return Collections.unmodifiableList(daftarTim);
    }
}