public class MathUtils {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Faktorial tidak didefinisikan untuk angka negatif: " + n);
        }
        if (n > 16) {
            throw new IllegalArgumentException("Faktorial terlalu besar! Bisa menyebabkan overflow: " + n);
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}