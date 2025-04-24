import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Upacara untuk menyambut trofi
        Upacara<Person> upacara = new Upacara<>();

        //Menambahkan pemain
        upacara.tambahkanPeserta(new Player("Harvey Elliott", "Gelandang"));
        upacara.tambahkanPeserta(new Player("Caomihin Kelleher", "Kiper"));

        //Menambahkan pelatih
        upacara.tambahkanPeserta(new Coach("Arne Slot"));

        //Menampilkan staf
        upacara.tambahkanPeserta(new Staff("Praditama", "Analis Jenggot Mo Salah"));

        //Menampilkan semua peserta
        System.out.println("\nPeserta Upacara:");
        upacara.tampilkanUrutan();

        //Menampilkan kontribusi
        System.out.println("\nKontribusi:");
        Kontribusi<Player, Integer> golSalah = new Kontribusi<>(new Player("Mohamed Salah", "Penyerang"), 27);
        Kontribusi<Player, Integer> assistSalah = new Kontribusi<>(new Player("Mohamed Salah", "Penyerang"), 18);
        Kontribusi<Coach, String> kontribusiPelatih = new Kontribusi<>(new Coach("Arne Slot"), "Win the league in his first season");

        golSalah.tampilkan();
        assistSalah.tampilkan();
        kontribusiPelatih.tampilkan();

        //Simulasi pemanggilan ke podium
        System.out.println("\nSimulasi Pemanggilan ke Podium:");
        Queue<Player> queue = new LinkedList<>();
        queue.add(new Player("Joe Gomez", "Bek"));
        queue.add(new Player("Caomihin Kelleher", "Kiper"));

        while (!queue.isEmpty()) {
            Player player = queue.poll();
            System.out.println(player.getNama() + " dipanggil ke podium.");
        }

        //Info trofi
        System.out.println("\nInfo Trofi:");
        TrofiUtils.tampilkanInfoTrofi("Liga Inggris");
    }
 }