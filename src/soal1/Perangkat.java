package soal1;

public class Perangkat {
    public static final double TARIF_PAJAK = 0.10;

    protected double harga; 
    private String merek;
    private int garansiBulan;

    public Perangkat(String merek, double harga, int garansiBulan) {
        setMerek(merek);
        setHarga(harga);
        setGaransiBulan(garansiBulan);
    }
    public double hitungPajak(){
        return this.harga * TARIF_PAJAK;
    }
    public String infoSingkat(){
        return merek + " | garansi " + garansiBulan + " bulan";
    }
    public String getMerek(){
        return merek;
    }
    public double getHarga(){
        return harga;
    }
    public int getGaransiBulan(){
        return garansiBulan;
    }
    public void setMerek(String merek){
        if (merek == null || merek.trim().isEmpty()){
            throw new IllegalArgumentException("Merek tidak boleh kosong!");
        }
        this.merek = merek;
    }
    public void setHarga(double harga){
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }
        this.harga = harga;

    }
    public void setGaransiBulan(int garansiBulan){
        this.garansiBulan = garansiBulan;
    }
}