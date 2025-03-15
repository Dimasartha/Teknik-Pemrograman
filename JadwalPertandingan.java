import java.util.*;

class JadwalPertandingan {
    private final Queue<String[]> jadwal;

    public JadwalPertandingan() {
        this.jadwal = new LinkedList<>();
    }

    public void tambahPertandingan(String tim1, String tim2) {
        jadwal.add(new String[]{tim1, tim2});
    }

    public void jalankanPertandingan(PeringkatLiga peringkatLiga) {
        while (!jadwal.isEmpty()) {
            String[] pertandingan = jadwal.poll();
            int skor1 = new Random().nextInt(5);
            int skor2 = new Random().nextInt(5);
            System.out.println(pertandingan[0] + " vs " + pertandingan[1] + " | Skor: " + skor1 + " - " + skor2);

            peringkatLiga.updatePoin(pertandingan[0], skor1 > skor2 ? 3 : skor1 == skor2 ? 1 : 0);
            peringkatLiga.updatePoin(pertandingan[1], skor2 > skor1 ? 3 : skor1 == skor2 ? 1 : 0);
        }
    }

    public void jalankanPertandinganManual(PeringkatLiga peringkatLiga, Scanner scanner) {
        while (!jadwal.isEmpty()) {
            String[] pertandingan = jadwal.poll();
            System.out.print("Masukkan skor untuk " + pertandingan[0] + ": ");
            int skor1 = scanner.nextInt();
            System.out.print("Masukkan skor untuk " + pertandingan[1] + ": ");
            int skor2 = scanner.nextInt();
            scanner.nextLine();

            peringkatLiga.updatePoin(pertandingan[0], skor1 > skor2 ? 3 : skor1 == skor2 ? 1 : 0);
            peringkatLiga.updatePoin(pertandingan[1], skor2 > skor1 ? 3 : skor1 == skor2 ? 1 : 0);
        }
    }
}