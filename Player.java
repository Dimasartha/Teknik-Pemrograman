public class Player extends Person implements Peran {
    private final String posisi;

    public Player(String nama, String posisi) {
        super(nama);
        this.posisi = posisi;
    }

    public String getPosisi() {
        return posisi;
    }

    @Override
    public String toString() {
        return getNama() + " - " + posisi;
    }

    @Override
    public String tugasUtama() {
        return "Bermain baik selama 1 musim";
    }
}