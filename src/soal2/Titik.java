package soal2;

/**
 * Merepresentasikan titik (berdimensi nol).
 * Kelas ini didesain sebagai turunan dari Lingkaran untuk mendiskusikan relasi is-a.
 */
public class Titik extends Lingkaran {

    /**
     * Membuat objek Titik, menginisialisasi jari-jari dengan 0 lewat pemanggilan superclass.
     */
    public Titik() {
        super(0); 
    }

    /**
     * Mengembalikan luas titik. Karena titik tidak memiliki area, selalu menghasilkan 0.0.
     *
     * @return 0.0 konstan
     */
    @Override
    public double luas() {
        return 0.0;
    }

    /**
     * Mengembalikan keliling titik. Selalu menghasilkan 0.0.
     *
     * @return 0.0 konstan
     */
    @Override
    public double keliling() {
        return 0.0;
    }
}