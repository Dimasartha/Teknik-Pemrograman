public class RoleManager <T extends Peran> {
    public void tampilkanPeran (T t) {
        System.out.println("Peran: " + t.tugasUtama());
    }
}