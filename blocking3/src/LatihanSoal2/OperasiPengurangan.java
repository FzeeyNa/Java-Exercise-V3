package LatihanSoal2;
public final class OperasiPengurangan extends OperasiBilanganAbs {
    private double c;

    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        this.c = this.a - this.b;
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
        System.out.println("Hasil Pengurangan: " + this.c);
    }
}