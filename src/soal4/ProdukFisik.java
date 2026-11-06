package soal4;

/**
 * Merepresentasikan produk berwujud fisik yang memiliki bobot dan biaya ongkos kirim.
 */
public class ProdukFisik extends Produk {
    private double beratKg;
    private static final double ONGKIR_PER_KG = 10000;

    /**
     * Membuat objek Produk Fisik baru.
     *
     * @param kode kode unik produk fisik
     * @param nama nama produk
     * @param hargaDasar harga beli dasar produk
     * @param beratKg berat barang dalam satuan kilogram
     */
    public ProdukFisik(String kode, String nama, double hargaDasar, double beratKg) {
        super(kode, nama, hargaDasar);
        this.beratKg = beratKg;
    }

    /**
     * Menghitung total harga produk dengan menambahkan biaya ongkos kirim.
     *
     * @return harga dasar ditambah (berat dikali tarif ongkir)
     */
    @Override
    public double hitungHargaAkhir() {
        return hargaDasar + (beratKg * ONGKIR_PER_KG);
    }

    /**
     * Menghasilkan deskripsi spesifik tentang produk fisik beserta bobotnya.
     *
     * @return string deskripsi fisik
     */
    @Override
    public String deskripsi() { return "fisik " + beratKg + " kg"; }
}