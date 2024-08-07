package blocking3;
public class LaptopToshiba extends Laptop {
    LaptopToshiba(String merk) {
        setMerk(merk);
        merk = null;
    }

    protected void setMerk(String merk) {
        this.merk = merk;
        merk = null;
    }

    protected String getMerk() {
        return merk;
    }

    protected void setPemilik(String pemilik) {
        this.pemilik = pemilik;
        pemilik = null;
    }

    protected String getPemilik() {
        return pemilik;
    }

    protected void tampil() {
        System.out.println(getPemilik() + " memiliki laptop merk " + getMerk());
    }

    protected void hapus() {
        merk = null;
        pemilik = null;
    }
}