import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        try (Scanner scan = new Scanner(System.in)) {
            while (keepGoing.equalsIgnoreCase("y")) {
                try {
                    System.out.print("Enter an integer: ");
                    int val = scan.nextInt();
                    
                    System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
                    
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Input tidak valid! Masukkan angka yang benar.");
                    scan.next();
                }
                
                System.out.print("Another factorial? (y/n) ");
                keepGoing = scan.next();
            }
        }
    }
}