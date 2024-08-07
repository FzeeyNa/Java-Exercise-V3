package LatSoal3;
public class Main {
    public static void main(String[] args) {
        Komputer pc = new PC();
        Komputer laptop = new Laptop();
        Komputer netbook = new Netbook();
        KomputerCetak printer = new KomputerCetak();

        pc.hidupkan_os();
        pc.klik_kanan();
        pc.tekan_enter();
        printer.cetak(pc);
        pc.matikan_os();

        System.out.println();

        laptop.hidupkan_os();
        laptop.klik_kiri();
        laptop.tekan_enter();
        printer.cetak(laptop);
        laptop.matikan_os();

        System.out.println();

        netbook.hidupkan_os();
        netbook.klik_kanan();
        netbook.klik_kiri();
        printer.cetak(netbook);
        netbook.matikan_os();
    }
}