package soal4;
import java.util.ArrayList;

public class Keranjang {
    private ArrayList<Produk> daftarProduk;

    public Keranjang() {
        daftarProduk = new ArrayList<>();
    }

    public void tambah(Produk produk) {
        for (Produk p : daftarProduk) {
            if (p.getKode().equals(produk.getKode())) {
                throw new IllegalStateException("Produk dengan kode " + produk.getKode() + " sudah ada di keranjang"); //[cite: 7]
            }
        }
        daftarProduk.add(produk);
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarProduk) { // Tanpa instanceof[cite: 7]
            total += p.hitungHargaAkhir(); 
        }
        return total;
    }

    public void cetakStruk() {
        for (Produk p : daftarProduk) { 
            System.out.printf("%s | %s | %s | Rp%.0f%n", p.getKode(), p.getNama(), p.deskripsi(), p.hitungHargaAkhir()); 
        }
        System.out.printf("TOTAL: Rp%.0f%n", hitungTotal()); 
    }

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