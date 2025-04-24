public class Kontribusi<T, U> {
    private final T kontributor;
    private final U nilai;

    public Kontribusi(T kontributor, U nilai) {
        this.kontributor = kontributor;
        this.nilai = nilai;
    }

    public void tampilkan() {
        System.out.println(kontributor + " berkontribusi " + nilai);
    }
}