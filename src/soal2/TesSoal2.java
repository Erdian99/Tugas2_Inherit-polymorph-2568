package soal2;

/**
 * Kelas utama untuk menguji serangkaian kasus polimorfisme, upcasting, 
 * downcasting, penanganan ClassCastException, dan method overriding pada Soal 2.
 */
public class TesSoal2 {

    /**
     * Method utama untuk mengeksekusi semua skenario pengujian di Soal 2.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        System.out.println("=== Bagian A: Hewan & Kucing ===");
        Hewan h = new Kucing("Tom");
        h.makan();
        h.suara();
        
        // h.panjat(); // Error kompilasi jika tidak dikomentari (method tidak ada di tipe Hewan)

        Kucing k = (Kucing) h;
        k.panjat();

        Hewan h2 = new Hewan("Generik");
        
        // Perbaikan ClassCastException menggunakan pengecekan instanceof
        if (h2 instanceof Kucing) {
            Kucing k2 = (Kucing) h2;
            k2.panjat();
        } else {
            System.out.println("h2 bukan instansiasi Kucing, sehingga downcasting dicegah.");
        }

        System.out.println("\n=== Bagian B: Urutan Constructor ===");
        new B();

        System.out.println("\n=== Bagian C: Lingkaran & Titik ===");
        Lingkaran l1 = new Lingkaran(5);
        Titik l2 = new Titik();
        Lingkaran l3 = new Titik();

        System.out.println(l1.luas());
        System.out.println(l2.luas());
        System.out.println(l3.luas());
    }
}