package soal4;

public abstract class Produk {
    protected String kode;
    protected String nama;
    protected double hargaDasar;

    public Produk(String kode, String nama, double hargaDasar) {
        if (hargaDasar < 0 || nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Harga dasar tidak boleh negatif dan nama tidak boleh kosong"); 
        }
        this.kode = kode;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }

    public abstract double hitungHargaAkhir(); 
    public abstract String deskripsi(); 
}