import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scanLine;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a line of text:");
            scanLine = new Scanner(scan.nextLine());
            while (scanLine.hasNext()) {
                String token = scanLine.next(); // Ambil kata berikutnya
                try {
                    val = Integer.parseInt(token); // Coba ubah ke integer
                    sum += val; // Jika sukses, tambahkan ke total
                } catch (NumberFormatException e) {
                    System.out.println("Bukan angka, diabaikan: " + token);
                }
            }   System.out.println("The sum of the integers on this line is " + sum);
        }
        scanLine.close();
    }
}
