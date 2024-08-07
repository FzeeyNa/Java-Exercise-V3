package blocking3;
abstract class OperasiBilangan {
    protected double a, b;
    
    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();
    protected abstract void tampil();
}