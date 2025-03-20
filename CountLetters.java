import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] counts = new int[26];
            
            System.out.print("Masukkan teks: ");
            String text = scanner.nextLine();
            
            for (int i = 0; i < text.length(); i++) {
                char ch = Character.toLowerCase(text.charAt(i));
                
                try {
                    if (ch >= 'a' && ch <= 'z') {
                        counts[ch - 'a']++; // Hitung hanya jika karakter adalah huruf
                    } else {
                        throw new IllegalArgumentException("Not a Letters: " + ch);
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage()); // Tampilkan pesan karakter yang di-skip
                }
            }
            
            System.out.println("\nFrekuensi huruf dalam teks:");
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] > 0) {
                    System.out.println((char) (i + 'a') + ": " + counts[i]);
                }
            }
        }
    }
}
