package soal4;

/**
 * Merepresentasikan produk layanan berlangganan (Subscription).
 * Berasal dari keluarga Produk Digital namun memiliki aturan diskon khusus.
 */
public class Langganan extends ProdukDigital {
    private int durasiBulan;
    private static final double DISKON_LANGGANAN = 0.20;
    private static final int BATAS_BULAN_DISKON = 12;

    /**
     * Membuat produk tipe Langganan (Subscription).
     *
     * @param kode kode produk langganan
     * @param nama nama jasa langganan
     * @param hargaDasar harga langganan per bulan
     * @param ukuranMb ukuran kebutuhan ruang digital
     * @param durasiBulan periode waktu berlangganan
     */
    public Langganan(String kode, String nama, double hargaDasar, double ukuranMb, int durasiBulan) {
        super(kode, nama, hargaDasar, ukuranMb);
        this.durasiBulan = durasiBulan;
    }

    /**
     * Menghitung total biaya tagihan langganan.
     * Jika durasi 12 bulan atau lebih, diberikan potongan 20%, mengabaikan diskon standar digital.
     *
     * @return harga total langganan 
     */
    @Override
    public double hitungHargaAkhir() {
        double total = hargaDasar * durasiBulan;
        if (durasiBulan >= BATAS_BULAN_DISKON) {
            total = total - (total * DISKON_LANGGANAN); 
        }
        return total;
    }

    /**
     * Memberikan deskripsi spesifik tentang durasi waktu langganan.
     *
     * @return string durasi dalam bulan
     */
    @Override
    public String deskripsi() { return "langganan " + durasiBulan + " bulan"; }
}