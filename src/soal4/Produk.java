package soal4;

/**
 * Merupakan cetak biru abstrak untuk semua jenis produk di toko digital.
 */
public abstract class Produk {
    protected String kode;
    protected String nama;
    protected double hargaDasar;

    /**
     * Membuat instansiasi dasar dari sebuah produk dengan pengecekan kelayakan data.
     *
     * @param kode kode unik produk
     * @param nama nama dari produk
     * @param hargaDasar harga jual dasar sebelum pajak atau biaya lain
     * @throws IllegalArgumentException jika harga dasar negatif atau nama kosong
     */
    public Produk(String kode, String nama, double hargaDasar) {
        if (hargaDasar < 0 || nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif dan nama tidak boleh kosong");
        }
        this.kode = kode;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    /**
     * Mengambil kode dari produk.
     * @return string kode produk
     */
    public String getKode() { return kode; }

    /**
     * Mengambil nama dari produk.
     * @return string nama produk
     */
    public String getNama() { return nama; }

    /**
     * Method abstrak untuk menghitung harga final produk sesuai aturan masing-masing subclass.
     *
     * @return harga total/akhir dari produk
     */
    public abstract double hitungHargaAkhir();

    /**
     * Method abstrak untuk memberikan informasi jenis barang produk spesifik.
     *
     * @return deskripsi barang
     */
    public abstract String deskripsi();
}