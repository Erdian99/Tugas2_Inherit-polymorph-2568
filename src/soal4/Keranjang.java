package soal4;
import java.util.ArrayList;

/**
 * Kelas yang menampung daftar objek-objek Produk yang siap dibeli.
 * Kelas ini mendemonstrasikan Polimorfisme pada collection array serta downcasting.
 */
public class Keranjang {
    private ArrayList<Produk> daftarProduk;

    /**
     * Melakukan instansiasi keranjang dengan membuat ArrayList kosong.
     */
    public Keranjang() {
        daftarProduk = new ArrayList<>();
    }

    /**
     * Memasukkan produk ke dalam koleksi keranjang.
     *
     * @param produk objek turunan abstrak Produk yang ingin ditambahkan
     * @throws IllegalStateException jika produk dengan kode serupa telah tercatat di keranjang
     */
    public void tambah(Produk produk) {
        for (Produk p : daftarProduk) {
            if (p.getKode().equals(produk.getKode())) {
                throw new IllegalStateException("Produk dengan kode " + produk.getKode() + " sudah ada di keranjang");
            }
        }
        daftarProduk.add(produk);
    }

    /**
     * Menjumlahkan seluruh harga dari produk-produk di keranjang berbekal polimorfisme.
     *
     * @return nominal total harga seluruh isi keranjang
     */
    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarProduk) { 
            total += p.hitungHargaAkhir(); 
        }
        return total;
    }

    /**
     * Menampilkan daftar item dalam format resi struk.
     */
    public void cetakStruk() {
        for (Produk p : daftarProduk) { 
            System.out.printf("%s | %s | %s | Rp%.0f%n", p.getKode(), p.getNama(), p.deskripsi(), p.hitungHargaAkhir());
        }
        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal());
    }

    /**
     * Merekap jumlah barang menurut hierarki kelas masing-masing memakai metode Type Checking.
     */
    public void hitungPerJenis() {
        int fisik = 0, digital = 0, langganan = 0;
        for (Produk p : daftarProduk) {
            if (p instanceof Langganan) { 
                langganan++;
            } else if (p instanceof ProdukDigital) {
                digital++;
            } else if (p instanceof ProdukFisik) {
                fisik++;
            }
        }
        System.out.println("Fisik: " + fisik + ", Digital: " + digital + ", Langganan: " + langganan);
    }
}