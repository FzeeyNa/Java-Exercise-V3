package blocking3;
public class OperasiPengurangan extends OperasiBilangan {
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
        return a - b;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil pengurangan: " + get_C());
    }
}