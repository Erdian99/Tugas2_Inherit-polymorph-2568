package soal1;

/**
 * Kelas Perangkat merepresentasikan perangkat elektronik dasar yang dijual di toko.
 * Kelas ini menjadi superclass bagi jenis perangkat lain.
 * 
 * @author Erdian Wijaya
 * @version 1.0
 */

public class Perangkat {
    public static final double TARIF_PAJAK = 0.10;

    protected double harga; 
    private String merek;
    private int garansiBulan;

    /**
     * Membuat objek perangkat baru dengan validasi data.
     * 
     * @param merek merek dari perangkat
     * @param harga harga-harga dasar perangkat
     * @param garansiBulan lama garansi dalam satuan bulan
     * @throws IllegalArgumentException jika harga negatif atau merek kosong
     */
    public Perangkat(String merek, double harga, int garansiBulan) {
        if (harga < 0 || merek == null || merek.trim().isEmpty()){
            throw new IllegalArgumentException("Harga tidak boleh negatif dan merek tidak boleh kosong!");
        }
        this.merek = merek;
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }
    /**
     * Menghitung nilai pajak dari perangkat berdasarkan tarif tetap.
     * 
     * @return nominal pajak perangkat
     */
    public double hitungPajak(){
        return this.harga * TARIF_PAJAK;
    }
    /**
     * Menghasilkan informasi singkat dari setiap perangkat.
     * 
     * @return string berisi merek dan lama garansi
     */
    public String infoSingkat(){
        return merek + " | garansi " + garansiBulan + " bulan";
    }
    /**
     * Mengambil nama merek perangkat.
     * @return merek perangkat
     */
    public String getMerek(){
        return merek;
    }
    /**
     * Mengambil harga perangkat.
     * @return harga perangkat
     */
    public double getHarga(){
        return harga;
    }
    /**
     * Mengambil lama garansi dalam satuan bulan.
     * @return lama garansi
     */
    public int getGaransiBulan(){
        return garansiBulan;
    }
    public void setGaransiBulan(int garansiBulan){
        this.garansiBulan = garansiBulan;
    }
}