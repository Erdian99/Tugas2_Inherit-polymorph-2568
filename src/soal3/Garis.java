package soal3;

public class Garis {
    private Titik awal;
    private Titik akhir;

    public Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
    }

    public Garis(double x1, double y1, double x2, double y2) {
        this(new Titik(x1, y1), new Titik(x2, y2)); 
    }

    public double getPanjang() {
        return awal.jarakKe(akhir); 
    }

    @Override
    public String toString() {
        return awal.toString() + "-" + akhir.toString();
    }
}