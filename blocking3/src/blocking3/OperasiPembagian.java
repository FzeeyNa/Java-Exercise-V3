package blocking3;
public class OperasiPembagian extends OperasiBilangan {
    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected double get_A() {
        return a;
    }

    @Override
    protected double get_B() {
        return b;
    }

    @Override
    protected double get_C() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol");
            return Double.NaN;
        }
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil pembagian: " + get_C());
    }
}