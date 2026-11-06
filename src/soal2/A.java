package soal2;

/**
 * Kelas dasar untuk mendemonstrasikan perilaku pemanggilan method yang bisa di-override
 * dari dalam constructor (menguji potensi anomali polimorfisme saat inisialisasi).
 */
public class A {
    
    /**
     * Constructor kelas A yang akan memanggil method init().
     */
    public A() {
        System.out.println("A dibuat");
        init();
    }

    /**
     * Method inisialisasi dasar kelas A.
     */
    public void init() {
        System.out.println("init A");
    }
}