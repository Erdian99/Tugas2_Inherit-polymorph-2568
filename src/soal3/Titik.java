package soal3;

/**
 * Merepresentasikan koordinat dua dimensi (X dan Y) dalam bidang kartesius.
 */
public class Titik {
    private double x;
    private double y;

    /**
     * Membuat objek Titik di pusat koordinat (0.0, 0.0).
     */
    public Titik() {
        this(0, 0); 
    }

    /**
     * Membuat objek Titik pada koordinat spesifik.
     *
     * @param x nilai koordinat sumbu X
     * @param y nilai koordinat sumbu Y
     */
    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Mengubah nilai koordinat X.
     * @param x nilai X yang baru
     */
    public void setX(double x) { this.x = x; }

    /**
     * Mengubah nilai koordinat Y.
     * @param y nilai Y yang baru
     */
    public void setY(double y) { this.y = y; }

    /**
     * Mengambil nilai koordinat X.
     * @return nilai X saat ini
     */
    public double getX() { return x; }

    /**
     * Mengambil nilai koordinat Y.
     * @return nilai Y saat ini
     */
    public double getY() { return y; }

    /**
     * Menghitung jarak lurus (Euclidean distance) dari titik ini ke titik lain.
     *
     * @param lain objek Titik tujuan
     * @return jarak berupa bilangan desimal
     */
    public double jarakKe(Titik lain) {
        return Math.sqrt(Math.pow(lain.x - this.x, 2) + Math.pow(lain.y - this.y, 2));
    }

    /**
     * Mengembalikan representasi string dari titik koordinat.
     *
     * @return string berformat (x, y)
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}