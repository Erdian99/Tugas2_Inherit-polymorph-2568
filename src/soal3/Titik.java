package soal3;

public class Titik {
    private double x;
    private double y;

    public Titik() {
        this(0, 0); 
    }

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public double getX() { return x; }
    public double getY() { return y; }

    public double jarakKe(Titik lain) {
        return Math.sqrt(Math.pow(lain.x - this.x, 2) + Math.pow(lain.y - this.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}