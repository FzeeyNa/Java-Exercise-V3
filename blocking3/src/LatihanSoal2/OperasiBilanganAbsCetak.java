package LatihanSoal2;
public class OperasiBilanganAbsCetak {
    public static void main(String[] args) {
        OperasiBilanganAbs[] operasi = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        double a = 6.5;
        double b = 0.5;

        for (OperasiBilanganAbs op : operasi) {
            op.set_A(a);
            op.set_B(b);
            op.set_C();
            op.tampil();
        }
    }
}