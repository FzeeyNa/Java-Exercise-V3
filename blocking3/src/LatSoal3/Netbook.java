package LatSoal3;
public class Netbook extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("Menghidupkan OS Netbook");
    }

    @Override
    public void matikan_os() {
        System.out.println("Mematikan OS Netbook");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Klik kanan pada Netbook");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Klik kiri pada Netbook");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Menekan enter pada Netbook");
    }

    @Override
    public void cetak_data() {
        System.out.println("Mencetak data dari Netbook");
    }
}