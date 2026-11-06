package soal2;

/**
 * Merepresentasikan entitas dasar hewan.
 * Kelas ini menjadi superclass untuk menguji konsep overriding dan polimorfisme.
 */
public class Hewan {
    protected String nama;

    /**
     * Membuat objek Hewan dengan nama tertentu.
     *
     * @param nama nama dari hewan
     */
    public Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama); //
    }

    /**
     * Mencetak suara standar hewan.
     */
    public void suara() {
        System.out.println("..."); //[cite: 4]
    }

    /**
     * Mencetak perilaku makan hewan dan memanggil method suara().
     */
    public void makan() {
        System.out.println(nama + " makan"); //[cite: 4]
        suara(); //[cite: 4]
    }
}