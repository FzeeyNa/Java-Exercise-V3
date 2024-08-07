package blocking3;
public class OperasiBilanganCetak {
    public static void main(String[] args) {
        OperasiBilangan penjumlahan = new OperasiPenjumlahan();
        penjumlahan.set_A(10.5);
        penjumlahan.set_B(0.5);
        penjumlahan.tampil();

        OperasiBilangan pengurangan = new OperasiPengurangan();
        pengurangan.set_A(10.5);
        pengurangan.set_B(0.5);
        pengurangan.tampil();

        OperasiBilangan perkalian = new OperasiPerkalian();
        perkalian.set_A(10.5);
        perkalian.set_B(0.5);
        perkalian.tampil();

        OperasiBilangan pembagian = new OperasiPembagian();
        pembagian.set_A(10.5);
        pembagian.set_B(0.5);
        pembagian.tampil();
    }
}