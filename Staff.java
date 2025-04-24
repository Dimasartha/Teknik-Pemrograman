public class Staff extends Person {
    private final String jabatan;

    public Staff(String nama, String jabatan) {
        super(nama);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    @Override
    public String toString() {
        return getNama() + " - " + jabatan;
    }
}