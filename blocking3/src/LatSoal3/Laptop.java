package LatSoal3;
public class Laptop extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("Menghidupkan OS Laptop");
    }

    @Override
    public void matikan_os() {
        System.out.println("Mematikan OS Laptop");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Klik kanan pada Laptop");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Klik kiri pada Laptop");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Menekan enter pada Laptop");
    }

    @Override
    public void cetak_data() {
        System.out.println("Mencetak data dari Laptop");
    }
}