package soal1;

/**
 * 
 * Kelas LaptopGaming merepresentasikan laptop dengan spesifikasi khusus untuk gaming.
 * Merupakan turunan dari kelas laptop dengan tambahan garansi eksklusif.
 * 
 * @author Erdian Wijaya
 * @version 1.0
 */
public class LaptopGaming extends Laptop {
    public static final int GARANSI_TAMBAHAN = 6;
    private String kartuGrafis;

    /**
     * Membuat objek laptop gaming baru.
     * Secara otomatis menambahkan durasi garansi standar.
     * 
     * @param merek merek laptop gaming
     * @param harga harga laptop gaming
     * @param garansiBulan garansi laptop gaming
     * @param ramGb kapasitas RAM laptop gaming
     * @param ukuranLayarInci ukuran layar laptop gaming dalam satuan inci
     * @param kartuGrafis model kartu grafis (GPU) yang digunakan
     */
    public LaptopGaming(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci, String kartuGrafis){
    super(merek, harga, garansiBulan + GARANSI_TAMBAHAN, ramGb, ukuranLayarInci);
    this.kartuGrafis = kartuGrafis;
    }
    /**   
     * Menghasilkan informasi spesifikasi laptop gaming termasuk GPU-nya
     * 
     * @return string informasi spek laptop gaming 
     */
    @Override
    public String infoSingkat(){
        return super.infoSingkat() + " | Kartu Grafis " + kartuGrafis;
    }
}
