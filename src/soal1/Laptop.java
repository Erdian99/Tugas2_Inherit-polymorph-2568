package soal1;

public class Laptop extends Perangkat {
    int ramGb;
    double ukuranLayarInci;

    public Laptop(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci){
        super(merek, harga, garansiBulan);
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;

    }
    public double hitungHargaPromo(double diskonPersen){
        return this.harga * (1 - diskonPersen / 100.0);
    }
    @Override 
    public String infoSingkat(){
        return super.infoSingkat() + " | RAM " + ramGb + " GB | layar " + ukuranLayarInci + " inci";
    }
    public int getRamGb(){
        return ramGb;
    }
    public double ukuranLayarInci(){
        return ukuranLayarInci;
    }
    public void setRamGb(int ramGb){
        this.ramGb = ramGb;
    }
    public void setUkuranLayarInci(double ukuranLayarInci){
        this.ukuranLayarInci = ukuranLayarInci;
    }
}
