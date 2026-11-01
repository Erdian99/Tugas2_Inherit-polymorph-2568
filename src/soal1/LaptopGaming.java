package soal1;

public class LaptopGaming extends Laptop {
    public static final int GARANSI_TAMBAHAN = 6;
    private String kartuGrafis;

    public LaptopGaming(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci, String kartuGrafis){
    super(merek, harga, garansiBulan + GARANSI_TAMBAHAN, ramGb, ukuranLayarInci);
    this.kartuGrafis = kartuGrafis;
    }
    @Override
    public String infoSingkat(){
        return super.infoSingkat() + " | Kartu Grafis " + kartuGrafis;
    }
    public String getKartuGrafis(){
        return kartuGrafis;
    }
    public void setKartuGrafis(String kartuGrafis){
        this.kartuGrafis = kartuGrafis;
    }
}
