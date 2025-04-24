public class Coach extends Person {
    public Coach(String nama) {
        super(nama);
    }

    @Override
    public String toString() {
        return getNama() + " - Pelatih";
    }
}