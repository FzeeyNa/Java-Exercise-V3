package LatSoal3;
public final class KomputerCetak {
    public final void cetak(Komputer obj) {
        System.out.println("Mencetak dari " + obj.getClass().getSimpleName());
        obj.cetak_data();
    }
}