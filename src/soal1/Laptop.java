package soal1;

/**
 * Kelas Laptop merepresentasikan perangkat berjenis laptop.
 * Kelas ini merupakan subclass dari perangkat.
 * 
 * @author Erdian Wijaya
 * @version 1.0
 */

public class Laptop extends Perangkat {
    int ramGb;
    double ukuranLayarInci;

    /**
     * Membuat objek laptop baru.
     * 
     * @param merek merek laptop
     * @param harga harga laptop 
     * @param garansiBulan garansi dalam satuan bulan
     * @param ramGb kapasitas ram laptop
     * @param ukuranLayarInci ukuran layar laptop dalam satuan inci
     */
    public Laptop(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci){
        super(merek, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }
    /**
     * Menghitung harga laptop setelah diberikan promo.
     * 
     * @param diskonPersen persentasi diskon yang diberikan (contoh: 10 untuk 10%)
     * @return harga akhir setelah dipotong diskon
     */
    public double hitungHargaPromo(double diskonPersen){
        return this.harga * (1 - diskonPersen / 100.0);
    }
    /**
     * Menghasilkan informasi detail tentang laptop.
     * memanggil method dari superclass perangkat.
     * 
     * @return string informasi mengenai laptop
     */
    @Override 
    public String infoSingkat(){
        return super.infoSingkat() + " | RAM " + ramGb + " GB | layar " + ukuranLayarInci + " inci";
    }
}
