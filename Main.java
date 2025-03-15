import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LigaSepakBola liga = new LigaSepakBola();
            
            System.out.print("Masukkan jumlah tim yang ingin didaftarkan: ");
            int jumlahTim = scanner.nextInt();
            scanner.nextLine(); // Membuang newline
            
            for (int i = 0; i < jumlahTim; i++) {
                System.out.print("Masukkan nama tim ke-" + (i + 1) + ": ");
                String namaTim = scanner.nextLine();
                Tim tim = new Tim(namaTim);
                
                System.out.print("Masukkan jumlah pemain dalam tim " + namaTim + ": ");
                int jumlahPemain = scanner.nextInt();
                scanner.nextLine();
                
                for (int j = 0; j < jumlahPemain; j++) {
                    System.out.print("Masukkan nama pemain: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan posisi pemain: ");
                    String posisi = scanner.nextLine();
                    System.out.print("Masukkan nomor punggung: ");
                    int nomor = scanner.nextInt();
                    scanner.nextLine();
                    
                    tim.tambahPemain(new Pemain(nama, posisi, nomor));
                }
                
                liga.tambahTim(tim);
            }
            
            liga.jadwalkanPertandingan();
            
            System.out.print("Apakah ingin memasukkan hasil pertandingan secara manual? (ya/tidak): ");
            boolean manualInput = scanner.nextLine().equalsIgnoreCase("ya");
            
            if (manualInput) {
                liga.mulaiLigaManual(scanner);
            } else {
                liga.mulaiLiga();
            }
        }
    }
}