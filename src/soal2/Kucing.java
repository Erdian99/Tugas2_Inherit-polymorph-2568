package soal2;

/**
 * Merepresentasikan hewan berjenis Kucing.
 * Kelas ini adalah turunan dari Hewan dan menguji konsep downcasting.
 */
public class Kucing extends Hewan {
    
    /**
     * Membuat objek Kucing dengan nama tertentu.
     *
     * @param nama nama kucing
     */
    public Kucing(String nama) {
        super(nama);
        System.out.println("Kucing dibuat");
    }

    /**
     * Mencetak suara spesifik kucing, meng-override method dari superclass.
     */
    @Override
    public void suara() {
        System.out.println("meong");
    }

    /**
     * Mencetak perilaku memanjat khusus untuk kucing.
     */
    public void panjat() {
        System.out.println(nama + " memanjat");
    }
}