package LatihanSoal2;
public final class OperasiPembagian extends OperasiBilanganAbs {
    private double c;

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        if (this.b != 0) {
            this.c = this.a / this.b;
        } else {
            System.out.println("Error: Pembagian dengan nol");
            this.c = Double.NaN;
        }
    }

    protected double get_A() {
        return this.a;
    }

    protected double get_B() {
        return this.b;
    }

    protected double get_C() {
        return this.c;
    }

    protected void tampil() {
        System.out.println("Hasil Pembagian: " + this.c);
    }
}