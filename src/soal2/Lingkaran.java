package soal2;

public class Lingkaran{
    protected double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double Luas() {
        return Math.PI * (2 * this.jariJari);
    }
    public double Keliling() {
        return 2 * Math.PI * this.jariJari;
    }
}
    