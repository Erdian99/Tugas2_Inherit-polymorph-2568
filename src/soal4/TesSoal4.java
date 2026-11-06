package soal4;

/**
 * Kelas utama untuk menguji fungsionalitas sistem Keranjang belanja
 * toko digital dengan memanfaatkan polimorfisme pada Soal 4.
 */
public class TesSoal4 {

    /**
     * Method utama untuk menjalankan simulasi transaksi pada Soal 4.
     * 
     * @param args argumen command line (tidak digunakan)
     */
    public static void main(String[] args) {
        Keranjang keranjang = new Keranjang();
        
        keranjang.tambah(new ProdukFisik("F01", "Keyboard Mekanik", 500000, 1.5));
        keranjang.tambah(new ProdukDigital("D01", "Ebook Java", 100000, 20));
        keranjang.tambah(new Langganan("L01", "Kelas Online", 150000, 20, 12));
        
        keranjang.cetakStruk();
        keranjang.hitungPerJenis();
        
        try {
            keranjang.tambah(new ProdukFisik("F01", "Mouse", 100000, 0.2));
        } catch (IllegalStateException e) {
            System.out.println("Gagal: " + e.getMessage());
        }
    }
}