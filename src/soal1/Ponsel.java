package soal1;

/**
 * 
 * Kelas Ponsel merepresentasikan perangkat berjenis ponsel.
 * 
 * @author Erdian Wijaya
 * @version 1.0
 */
public class Ponsel extends Perangkat {
    int kapasitasGb;
    int jumlahKamera;
    /**
     * Membuat objek ponsel baru.
     * 
     * @param merek merek ponsel
     * @param harga harga ponsel 
     * @param garansiBulan lama garansi (bulan)
     * @param kapasitasGb kapasitas memori (GB)
     * @param jumlahKamera jumlah lensa kamera pada ponsel
     */
    public Ponsel(String merek, double harga, int garansiBulan, int kapasitasGb, int jumlahKamera){
        super(merek, harga, garansiBulan);
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }
    /**    
     * 
     * 
     */
    @Override
    public String infoSingkat(){
        return super.infoSingkat() + " | " + kapasitasGb + " GB | " + jumlahKamera + " kamera";
    }
}
