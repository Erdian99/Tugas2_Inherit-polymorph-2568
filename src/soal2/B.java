package soal2;

/**
 * Turunan dari kelas A untuk menunjukkan efek overriding pada siklus constructor.
 */
public class B extends A {
    private int nilai = 5;

    /**
     * Constructor kelas B.
     */
    public B() {
        super();
        System.out.println("B dibuat, nilai=" + nilai);
    }

    /**
     * Meng-override method init() dari kelas A.
     */
    @Override
    public void init() {
        System.out.println("init B, nilai=" + nilai);
    }
}