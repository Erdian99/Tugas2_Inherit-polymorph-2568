package soal2;

public class TesSoal2 {
    public static void main(String []args){
        Hewan h = new Kucing("Tom");
        h.makan();
        h.suara();
        // h.panjat();
        Kucing k = (Kucing) h;
        k.panjat();
        Hewan h2 = new Hewan("Generik"); 
        Kucing k2 = (Kucing) h2;
        k2.panjat();

        new B();

        Lingkaran l1 = new Lingkaran(5); 
        Titik l2 = new Titik(); 
        Lingkaran l3 = new Titik();
            System.out.println(l1.Luas());
            System.out.println(l2.Luas());
            System.out.println(l3.Luas());
    }
}
