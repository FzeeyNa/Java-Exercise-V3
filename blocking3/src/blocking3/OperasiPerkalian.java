package blocking3;
public class OperasiPerkalian extends OperasiBilangan {
    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        return a * b;
    }

    protected void tampil() {
        System.out.println("Hasil perkalian: " + get_C());
    }
}