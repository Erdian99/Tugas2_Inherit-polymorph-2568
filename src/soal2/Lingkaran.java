package soal2;

/**
 * Merepresentasikan bangun datar lingkaran.
 */
public class Lingkaran {
    private double jariJari;

    /**
     * Membuat objek Lingkaran dengan jari-jari tertentu.
     *
     * @param jariJari nilai jari-jari lingkaran
     */
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    /**
     * Menghitung luas lingkaran berdasarkan jari-jarinya.
     *
     * @return luas lingkaran
     */
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Menghitung keliling lingkaran berdasarkan jari-jarinya.
     *
     * @return keliling lingkaran
     */
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}