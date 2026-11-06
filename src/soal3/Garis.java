package soal3;

/**
 * Merepresentasikan sebuah garis lurus yang dibentuk oleh dua Titik (awal dan akhir).
 * Mendemonstrasikan konsep Composition (relasi has-a).
 */
public class Garis {
    private Titik awal;
    private Titik akhir;

    /**
     * Membuat objek Garis dari dua referensi objek Titik.
     *
     * @param awal objek Titik awal
     * @param akhir objek Titik akhir
     */
    public Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
    }

    /**
     * Membuat objek Garis dari koordinat langsung (method overloading).
     *
     * @param x1 koordinat X titik awal
     * @param y1 koordinat Y titik awal
     * @param x2 koordinat X titik akhir
     * @param y2 koordinat Y titik akhir
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2)); 
    }

    /**
     * Menghitung panjang garis dengan memanfaatkan method jarak pada objek Titik.
     *
     * @return panjang garis
     */
    public double getPanjang() {
        return awal.jarakKe(akhir); 
    }

    /**
     * Mengembalikan representasi string dari garis.
     *
     * @return string dengan format (x1, y1)-(x2, y2)
     */
    @Override
    public String toString() {
        return awal.toString() + "-" + akhir.toString(); 
    }
}