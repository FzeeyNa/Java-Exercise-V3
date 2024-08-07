package LatSoal3;
public class PC extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("Menghidupkan OS PC");
    }

    @Override
    public void matikan_os() {
        System.out.println("Mematikan OS PC");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Klik kanan pada PC");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Klik kiri pada PC");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Menekan enter pada PC");
    }

    @Override
    public void cetak_data() {
        System.out.println("Mencetak data dari PC");
    }
}