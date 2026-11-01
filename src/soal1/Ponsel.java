package soal1;

public class Ponsel extends Perangkat {
    int kapasitasGb;
    int jumlahKamera;
    
    public Ponsel(String merek, double harga, int garansiBulan, int kapasitasGb, int jumlahKamera){
        super(merek, harga, garansiBulan);
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }
    @Override
    public String infoSingkat(){
        return super.infoSingkat() + " | " + kapasitasGb + " GB | " + jumlahKamera + " kamera";
    }
    public int getKapasitasGb(){
        return kapasitasGb;
    }
    public int getJumlahKamera(){
        return jumlahKamera;
    }
    public void setKapasitasGb(int kapasitasGb){
        this.kapasitasGb = kapasitasGb;
    }
    public void setJumlahKamera(int jumlahKamera){
        this.jumlahKamera = jumlahKamera;
    }
}
