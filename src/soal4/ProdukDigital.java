package soal4;

/**
 * Merepresentasikan produk berupa file digital yang diunduh.
 * Memiliki ukuran file dan mendapat potongan harga.
 */
public class ProdukDigital extends Produk {
    protected double ukuranMb;
    protected static final double DISKON_DIGITAL = 0.10;

    /**
     * Membuat objek Produk Digital baru.
     *
     * @param kode kode unik produk digital
     * @param nama nama produk digital
     * @param hargaDasar harga jual dasar
     * @param ukuranMb besar ukuran file dalam Megabyte
     */
    public ProdukDigital(String kode, String nama, double hargaDasar, double ukuranMb) {
        super(kode, nama, hargaDasar);
        this.ukuranMb = ukuranMb;
    }

    /**
     * Menghitung harga akhir yang sudah dikurangi potongan diskon produk digital.
     *
     * @return harga setelah dipotong 10%
     */
    @Override
    public double hitungHargaAkhir() {
        return hargaDasar - (hargaDasar * DISKON_DIGITAL); 
    }

    /**
     * Memberikan deskripsi spesifik tentang ukuran media penyimpanan produk.
     *
     * @return string ukuran dalam MB
     */
    @Override
    public String deskripsi() { return "digital " + ukuranMb + " MB"; }
}